package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Daily {
    private long dt;
    private long sunrise;
    private long sunset;
    private long moonrise;
    private long moonset;

    @JsonProperty("moon_phase")
    private double moonPhase;

    private TempDaily temp;

    @JsonProperty("feels_like")
    private FeelsLikeDaily feelsLike;

    private int pressure;
    private int humidity;

    @JsonProperty("dew_point")
    private double dewPoint;

    @JsonProperty("wind_speed")
    private double windSpeed;

    @JsonProperty("wind_deg")
    private int windDeg;

    @JsonProperty("wind_gust")
    private double windGust;

    private Weather weather;

    private int cloud;
    private double pop;
    private double rain;
    private double uvi;

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public long getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(long moonrise) {
        this.moonrise = moonrise;
    }

    public long getMoonset() {
        return moonset;
    }

    public void setMoonset(long moonset) {
        this.moonset = moonset;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public TempDaily getTemp() {
        return temp;
    }

    public void setTemp(TempDaily temp) {
        this.temp = temp;
    }

    public FeelsLikeDaily getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(FeelsLikeDaily feelsLike) {
        this.feelsLike = feelsLike;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(int windDeg) {
        this.windDeg = windDeg;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getPop() {
        return pop;
    }

    public void setPop(double pop) {
        this.pop = pop;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getUvi() {
        return uvi;
    }

    public void setUvi(double uvi) {
        this.uvi = uvi;
    }
}
