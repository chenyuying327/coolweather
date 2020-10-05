package com.example.dell.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DELL on 2020/10/5.
 */

public class City extends DataSupport{

        private int id;
        private String cityName;
        private String cityCode;
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

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }
        public void setProvinceId(int provinceId){
            this.provinceId=provinceId;
        }
        public int getProvinceId(){
            return provinceId;
        }
    }

