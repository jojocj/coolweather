package com.coolweather.android.gson;

/**
 * Created by JOJO on 2017/8/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
