package com.example.limingyu.coolweather.db;

import org.litepal.crud.DataSupport;

/**县
 * Created by limingyu on 2019/7/31.
 */

public class County extends DataSupport{
    private int id;//id

    private String countyName;//县名称

    private String weatherId;//对应天气的

    private int cityId;//对应城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
