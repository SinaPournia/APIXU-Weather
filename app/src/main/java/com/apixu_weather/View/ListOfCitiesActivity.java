package com.apixu_weather.View;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.apixu_weather.Model.RetrofitUtil.Constants;
import com.apixu_weather.Model.RetrofitUtil.CreateRetrofit;
import com.apixu_weather.R;
import com.apixu_weather.View.ListOfCities.RecyclerViewAdapter;
import com.apixu_weather.ViewModel.RecyclerViewViewModel;
import com.apixu_weather.databinding.ActivityListOfCitiesBinding;

import java.util.ArrayList;

public class ListOfCitiesActivity extends AppCompatActivity  {
    ActivityListOfCitiesBinding binding;
    ArrayList<RecyclerViewViewModel> mList;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_list_of_cities);
        binding.Recyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mList= new ArrayList<>();

         recyclerViewAdapter = new RecyclerViewAdapter(mList);

       Constants Cities = new Constants();
       ArrayList<String> cities=Cities.getCities();
       CreateRetrofit mRetrofit=new CreateRetrofit();
        binding.Recyclerview.setAdapter(recyclerViewAdapter);
        binding.Recyclerview.addItemDecoration(new DividerItemDecoration(
                this,
                1));
       for(int i=0;i<cities.size();i++){
           RecyclerViewViewModel recyclerViewViewModel= new RecyclerViewViewModel(mRetrofit.fetchCurrentWeather(cities.get(i)), getApplicationContext());
           mList.add(recyclerViewViewModel);
          recyclerViewAdapter.notifyDataSetChanged();
       }


    }





}
