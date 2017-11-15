package com.example.a14369.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 14369 on 2017/11/15.
 */
//每个LitePal实例中必须继承自DataSupport类
public class Province extends DataSupport {
    private int id;
    // 省的名字
    private int provinceName;
    //省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(int provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
