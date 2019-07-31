package com.example.limingyu.coolweather.db;

import org.litepal.crud.DataSupport;

/**城市
 * Created by limingyu on 2019/7/31.
 */

public class City extends DataSupport{
    private int id;//id号

    private String cityName;//城市名称

    private int cityCode;//城市代码

    private int provinceId;//省份id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
