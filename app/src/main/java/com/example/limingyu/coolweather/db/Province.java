package com.example.limingyu.coolweather.db;

import org.litepal.crud.DataSupport;

/**省份
 * 使用litepal必须继承DataSupport类
 *
 * Created by limingyu on 2019/7/31.
 */

public class Province extends DataSupport {

    private int id;//id号

    private String provinceName;//省份名字

    private int provinceCode;//省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}