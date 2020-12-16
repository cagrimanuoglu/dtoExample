package com.example.DtoExample.dto;


public class KisiDto {

    //private Long id;
    private String adi;
    private String soyadi;


    public KisiDto() {
    }

    public KisiDto( String adi, String soyadi) {

        this.adi = adi;
        this.soyadi = soyadi;

    }



    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

}
