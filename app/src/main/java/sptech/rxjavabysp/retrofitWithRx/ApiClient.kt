package sptech.rxjavabysp.retrofitWithRx

import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import sptech.rxjavabysp.retrofitWithRx.models.CryptoResponse
import sptech.rxjavabysp.retrofitWithRx.models.GithubRepo

interface ApiClient {

    /**
     * Get the list of the pots from the API
     */
    @GET("top/totalvolfull")
    fun getTotalVol(@Query("tsym") action: String = "USD", @Query("page") pageNo: Int = 2): Single<CryptoResponse>

    @GET("users/{user}/starred")
    fun getStarredRepositories(@Path("user") userName: String): Single<List<GithubRepo>>

    companion object {

        val BASE_URL = "https://min-api.cryptocompare.com/data/"
        val GITHUB_BASE_URL = "https://api.github.com/"

        fun create(url: String): ApiClient {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

            val retrofit = retrofit2.Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(url)
                    .client(client)
                    .build()

            return retrofit.create(ApiClient::class.java)
        }

    }

}