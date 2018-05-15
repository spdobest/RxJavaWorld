package sptech.rxjavabysp.network;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sptech.rxjavabysp.network.dto.CityResponse;

/**
 * Created by root on 5/15/18.
 */

public interface RetrofitApiService {
    @GET("citiesJSON")
    Single<CityResponse> queryGeonames(@Query("north") double north, @Query("south") double south,
                                       @Query("east") double east, @Query("west") double west, @Query("lang") String lang);
}
