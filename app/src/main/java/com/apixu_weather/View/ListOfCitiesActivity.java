package com.apixu_weather.View;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.apixu_weather.Model.RetrofitUtil.CreateRetrofit;
import com.apixu_weather.R;
import com.apixu_weather.View.ListOfCities.RecyclerViewAdapter;
import com.apixu_weather.ViewModel.RecyclerViewViewModel;
import com.apixu_weather.databinding.ActivityListOfCitiesBinding;

import java.util.ArrayList;
import java.util.List;

public class ListOfCitiesActivity extends AppCompatActivity {
    ActivityListOfCitiesBinding binding;
    ArrayList<RecyclerViewViewModel> mList;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  binding= DataBindingUtil.setContentView(this,R.layout.activity_list_of_cities);
        binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mList= new ArrayList<>();
        mList.add(new RecyclerViewViewModel("test1.1","test1.2","http://cdn.apixu.com/weather/64x64/night/296.png"));
        mList.add(new RecyclerViewViewModel("test2.1","test2.2","http://cdn.apixu.com/weather/64x64/night/296.png"));
        mList.add(new RecyclerViewViewModel("test3.1","test3.2","http://cdn.apixu.com/weather/64x64/night/296.png"));
        mList.add(new RecyclerViewViewModel("test4.1","test4.2","http://cdn.apixu.com/weather/64x64/night/296.png"));
         recyclerViewAdapter = new RecyclerViewAdapter(mList);
        binding.RecyclerView.setAdapter(recyclerViewAdapter);*/
        new CreateRetrofit().fetchData();


    }

    public void test(View view){
        Log.e("test","isClickedd");
        mList.get(0).setCityName(new ObservableField<String>("SSSSSSSS"));
        recyclerViewAdapter.notifyDataSetChanged();
    }
}
