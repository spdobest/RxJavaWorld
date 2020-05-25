package sptech.rxjavabysp.network

import io.reactivex.internal.operators.flowable.FlowableJust
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import sptech.rxjavabysp.BuildConfig
import sptech.rxjavabysp.network.models.MovieResponse

/**
 * The interface which provides methods to get result of webservices
 */
interface ApiServiceInterface {

    /**
     * Get Movie
     */

    @GET("/trending/all/day?api_key=b7eb389e9e6ad5e434077e4b6d83ad78")
    fun getTrendingMovies(): FlowableJust<MovieResponse>

/*    @GET("data/2.5/forecast")
    fun getWeatherDetails(
        @Query("q") action: String,
        @Query("appid") format: String
    ): Observable<WeatherModel>*/

    @GET("forecast")
    fun getWeatherDetails(
        @Query("q") action: String,
        @Query("APPID") appid: String
    ): Call<MovieResponse>

    companion object Factory {
        fun create(): ApiServiceInterface {

            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

            val retrofit = retrofit2.Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .build()

            return retrofit.create(ApiServiceInterface::class.java)
        }
    }
}