package com.apixu_weather.View;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.apixu_weather.Model.RetrofitUtil.CreateRetrofit;
import com.apixu_weather.R;
import com.apixu_weather.ViewModel.DetailViewModel;
import com.apixu_weather.databinding.ActivityDetailBinding;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        String city;
        if(extras == null) {
            city= null;
        } else {
            city= extras.getString("city");
            Log.e("city=",city);
        }
        CreateRetrofit mRetrofit=new CreateRetrofit();
           DetailViewModel detailViewModel = new DetailViewModel( mRetrofit.fetchForecastWeather(city));
        detailViewModel.getCity();
        binding.setViewModel(detailViewModel);
    }
}
