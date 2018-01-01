package com.apixu_weather.Model.RetrofitUtil;

import android.database.Observable;

import com.apixu_weather.Model.POJOs.CurrentWeather.CurrentCity;
import com.apixu_weather.Model.POJOs.ForecastWeather.Forecast;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Sina on 12/28/2017.
 */

public interface ApiContract {
   @GET("/v1/current.json")
    io.reactivex.Observable<CurrentCity> getCurrentWeather(@Query("q") String city,@Query("key") String key);

    @GET("/v1/forecast.json")
    io.reactivex.Observable<Forecast> getForecastWeather(@Query("q") String city,@Query("days") String days, @Query("key") String key);
}
