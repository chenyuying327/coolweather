package com.example.dell.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DELL on 2020/10/5.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

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

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
    public int getCityId(){
        return cityId;
    }
}