package com.apixu_weather.ViewModel;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.util.Log;
import android.widget.ImageView;
import android.content.Context;
import com.apixu_weather.Model.POJOs.CurrentWeather.CurrentCity;
import com.apixu_weather.View.DetailActivity;
import com.squareup.picasso.Picasso;

/**
 * Created by Sina on 12/27/2017.
 */

public class RecyclerViewViewModel {
    CurrentCity currentCity;
    ObservableField<String> cityName;
    ObservableField<String> temp;
    ObservableField<String> ImageUrl;
    Context context;



    public RecyclerViewViewModel(CurrentCity currentCity, Context context) {
        this.currentCity=currentCity;
        this.context = context;
        this.cityName = new ObservableField<>(currentCity.getLocation().getName());
        this.temp = new ObservableField<>(String.valueOf(currentCity.getCurrent().getTempC()));
        this.ImageUrl = new ObservableField<>(currentCity.getCurrent().getCondition().getIcon());
        Log.e("RecyclerViewViewModel",currentCity.getLocation().getName());
    }
    public RecyclerViewViewModel(String cityName,String temp,String ImageUrl) {
        this.currentCity=currentCity;
        this.cityName = new ObservableField<>(cityName);
        this.temp = new ObservableField<>(temp);
        this.ImageUrl = new ObservableField<>(ImageUrl);
    }


    public CurrentCity getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(CurrentCity currentCity) {
        this.currentCity = currentCity;
    }

    public ObservableField<String> getCityName() {
        return cityName;
    }

    public void setCityName(ObservableField<String> cityName) {
        this.cityName = cityName;
    }

    public ObservableField<String> getTemp() {
        return temp;
    }

    public void setTemp(ObservableField<String> temp) {
        this.temp = temp;
    }

    public ObservableField<String> getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(ObservableField<String> imageUrl) {
        ImageUrl = imageUrl;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Log.e("PicaseImageUrl",imageUrl);
        Picasso.with(view.getContext())
                .load("http:"+imageUrl)

                .into(view);

    }


    public void getClickedCity(ObservableField<String> City) {

        Intent startDetailActivity = new Intent(context.getApplicationContext(), DetailActivity.class);
        startDetailActivity.putExtra("city",City.get());
        startDetailActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(startDetailActivity);

    }




}
