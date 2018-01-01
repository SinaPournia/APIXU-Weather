package com.apixu_weather.Model.RetrofitUtil;

import android.util.Log;

import com.apixu_weather.Model.POJOs.CurrentWeather.CurrentCity;
import com.apixu_weather.Model.POJOs.ForecastWeather.Forecast;
import com.apixu_weather.ViewModel.DetailViewModel;
import com.apixu_weather.ViewModel.RecyclerViewViewModel;

import java.util.ArrayList;
import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sina on 12/28/2017.
 */

public class CreateRetrofit {
    Retrofit retrofit;
    ApiContract apiContract;


    public CreateRetrofit() {
        retrofit=retrofitBuilder();
         apiContract=retrofit.create(ApiContract.class);


    }


    public Retrofit retrofitBuilder (){
    return new Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://api.apixu.com")
            .build();
    }
    public CurrentCity fetchCurrentWeather(final String City ){


        CurrentCity currentCity=  apiContract.getCurrentWeather(City,"b02c5db5a05e4ccda27112236172512")
                .subscribeOn(Schedulers.newThread())
                .blockingFirst();
        return currentCity;


    }
   public Forecast  fetchForecastWeather(String City){

       Log.e("Forecast","fetchForecastWeather");

       Forecast forecast =apiContract.getForecastWeather(City,"10","b02c5db5a05e4ccda27112236172512")
               .subscribeOn(Schedulers.newThread())
               .blockingFirst();


       return forecast;


   }

}
