package com.example.a14369.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 14369 on 2017/11/15.
 */

public class City  extends DataSupport{
    private int id;
    //市的名字
    private String cityName;
    //市的代号
    private int cityCode;
    //当前市所属省的id值
    private int provinceId;

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

