package com.example.a14369.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 14369 on 2017/11/15.
 */

public class County extends DataSupport {
    private int id;
    //县的名字
    private String countyNmae;
    //县对应的天气Id
    private String wetherId;
    //记录当前县属市的id
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyNmae() {
        return countyNmae;
    }

    public void setCountyNmae(String countyNmae) {
        this.countyNmae = countyNmae;
    }

    public String getWetherId() {
        return wetherId;
    }

    public void setWetherId(String wetherId) {
        this.wetherId = wetherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
