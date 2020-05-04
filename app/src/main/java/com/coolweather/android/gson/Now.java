package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hp on 2020/5/4.
 * 温度和天气
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }

}
