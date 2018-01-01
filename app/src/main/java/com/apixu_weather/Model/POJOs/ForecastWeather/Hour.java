
package com.apixu_weather.Model.POJOs.ForecastWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hour {

    @SerializedName("time_epoch")
    @Expose
    private Integer timeEpoch;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("temp_c")
    @Expose
    private Double tempC;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("is_day")
    @Expose
    private Integer isDay;
    @SerializedName("condition")
    @Expose
    private Condition__ condition;
    @SerializedName("wind_mph")
    @Expose
    private Double windMph;
    @SerializedName("wind_kph")
    @Expose
    private Double windKph;
    @SerializedName("wind_degree")
    @Expose
    private Integer windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mb")
    @Expose
    private Double pressureMb;
    @SerializedName("pressure_in")
    @Expose
    private Double pressureIn;
    @SerializedName("precip_mm")
    @Expose
    private Double precipMm;
    @SerializedName("precip_in")
    @Expose
    private Double precipIn;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("cloud")
    @Expose
    private Integer cloud;
    @SerializedName("feelslike_c")
    @Expose
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    @Expose
    private Double feelslikeF;
    @SerializedName("windchill_c")
    @Expose
    private Double windchillC;
    @SerializedName("windchill_f")
    @Expose
    private Double windchillF;
    @SerializedName("heatindex_c")
    @Expose
    private Double heatindexC;
    @SerializedName("heatindex_f")
    @Expose
    private Double heatindexF;
    @SerializedName("dewpoint_c")
    @Expose
    private Double dewpointC;
    @SerializedName("dewpoint_f")
    @Expose
    private Double dewpointF;
    @SerializedName("will_it_rain")
    @Expose
    private Integer willItRain;
    @SerializedName("chance_of_rain")
    @Expose
    private String chanceOfRain;
    @SerializedName("will_it_snow")
    @Expose
    private Integer willItSnow;
    @SerializedName("chance_of_snow")
    @Expose
    private String chanceOfSnow;
    @SerializedName("vis_km")
    @Expose
    private Double visKm;
    @SerializedName("vis_miles")
    @Expose
    private Double visMiles;

    public Integer getTimeEpoch() {
        return timeEpoch;
    }

    public void setTimeEpoch(Integer timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public Condition__ getCondition() {
        return condition;
    }

    public void setCondition(Condition__ condition) {
        this.condition = condition;
    }

    public Double getWindMph() {
        return windMph;
    }

    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Double getWindKph() {
        return windKph;
    }

    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public Double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(Double precipMm) {
        this.precipMm = precipMm;
    }

    public Double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(Double precipIn) {
        this.precipIn = precipIn;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(Double windchillC) {
        this.windchillC = windchillC;
    }

    public Double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(Double windchillF) {
        this.windchillF = windchillF;
    }

    public Double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(Double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public Double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(Double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public Double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Integer getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(Integer willItRain) {
        this.willItRain = willItRain;
    }

    public String getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(String chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public Integer getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(Integer willItSnow) {
        this.willItSnow = willItSnow;
    }

    public String getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(String chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public Double getVisKm() {
        return visKm;
    }

    public void setVisKm(Double visKm) {
        this.visKm = visKm;
    }

    public Double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(Double visMiles) {
        this.visMiles = visMiles;
    }

}
