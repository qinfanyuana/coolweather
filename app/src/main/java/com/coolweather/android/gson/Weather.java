package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2020/5/4.
 * 包含其余的四个 和状态ok和不成功的原因
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;

    @SerializedName("daily_forest")
    public List<Forecast> forecastList=new ArrayList<>();
    //集合 这里要初始化啊啊啊啊不然报错555555
}
