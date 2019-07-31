package com.example.limingyu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by limingyu on 2019/7/31.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
