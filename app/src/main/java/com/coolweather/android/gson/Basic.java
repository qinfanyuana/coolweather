package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hp on 2020/5/4.
 * 天气里的基本类 包含城市名 城市对应的天气id 更新天气的时间
 */

public class Basic {
    //json的一些字段无法直接用java字段命名 用这个建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
