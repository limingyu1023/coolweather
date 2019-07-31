package com.example.limingyu.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by limingyu on 2019/7/31.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        //发起网络请求
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
    }

