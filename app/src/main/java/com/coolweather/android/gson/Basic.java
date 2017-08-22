package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JOJO on 2017/8/22.
 */

public class Basic {
    @SerializedName("city")//由于JSON中一些字段不太适合直接作为Java字段来命令，所以使用@SerializedName注解的方式让JSON字段和Java字段间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
