package com.apixu_weather.ViewModel;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.util.Log;

import com.apixu_weather.Model.POJOs.ForecastWeather.Forecast;
import com.apixu_weather.Model.POJOs.ForecastWeather.Forecastday;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sina on 12/30/2017.
 */

public class DetailViewModel {

    Forecast forecast;
    String city;
    static ArrayList<Entry> temp=new ArrayList();
    static ArrayList<String> days=new ArrayList();
    List<Forecastday> forecastdays;

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Entry> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<Entry> temp) {
        this.temp = temp;
    }

    public ArrayList getDays() {
        return days;
    }

    public void setDays(ArrayList days) {
        this.days = days;
    }

    public List<Forecastday> getForecastdays() {
        return forecastdays;
    }

    public void setForecastdays(List<Forecastday> forecastdays) {
        this.forecastdays = forecastdays;
    }

    public DetailViewModel(Forecast forecast) {
        temp=new ArrayList();
        days=new ArrayList();
        this.forecast = forecast;
        forecastdays=forecast.getForecast().getForecastday();
        city=forecast.getLocation().getName();
        for (int i = 0 ; forecastdays.size()>i;i++){
            days.add(forecastdays.get(i).getDate().toString());
            Log.e("getDate",forecastdays.get(i).getDate());
            temp.add(new Entry(i,Float.valueOf(forecastdays.get(i).getDay().getAvgtempC().toString())));
            Log.e("getTempC",forecastdays.get(i).getDay().getAvgtempC().toString());
        }
    }

    @BindingAdapter("bind:setData")
    public static void setData(com.github.mikephil.charting.charts.LineChart lineChart,String string){

        LineDataSet set=new LineDataSet(temp,"Fore cast");

        lineChart.setData(new LineData(set));

        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                Log.e("getFormattedValue",String.valueOf((int) value));
                return  days.get((int) value);
            }
        });

    }
}
