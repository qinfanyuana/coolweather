package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hp on 2020/5/4.
 * 关于未来几天的天气 搞一个单日天气类 使用时用集合声明
 * 时间 温度 最高最低气温 天气额外描述
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
