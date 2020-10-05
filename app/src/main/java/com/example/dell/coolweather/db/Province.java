package com.example.dell.coolweather.db;

/**
 * Created by DELL on 2020/10/5.
 */

public class Province {
    private int id;
    private String provinceName;
    private int provinceCode;


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

    public void setProvinceCode( int provinceCode) {
        this.provinceCode = provinceCode;
    }


}