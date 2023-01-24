package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
        private double lat;
        private double lon;
        private String timezone;

        @JsonProperty("timezone_offset")
        private int timezoneOffset;

        private Current current;
        //......
        private List<Minute> minutely;
        //.....

        private List<Weather> weather;

        private List<Hourly> hourly;

        private double pop;

        private List<Daily> daily;

        private List<Alerts> alerts;

}
