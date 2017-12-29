package com.apixu_weather.Model.RetrofitUtil;

import android.util.Log;

import com.apixu_weather.Model.POJOs.CurrentWeather.CurrentCity;

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
    io.reactivex.Observable observable;
    public CreateRetrofit() {
        retrofit=retrofitBuilder();
         apiContract=retrofit.create(ApiContract.class);
        observable=apiContract.getCurrentWeather("istanbul","b02c5db5a05e4ccda27112236172512");

    }


    public Retrofit retrofitBuilder (){
    return new Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://api.apixu.com")
            .build();
    }
    public void fetchData(){
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CurrentCity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CurrentCity currentCity) {
                        Log.e("OnNext",currentCity.getCurrent().getCondition().getText());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


}
