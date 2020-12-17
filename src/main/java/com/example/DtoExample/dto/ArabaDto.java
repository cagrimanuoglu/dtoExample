package com.example.DtoExample.dto;

import com.example.DtoExample.entity.Araba;
import com.example.DtoExample.entity.Kisi;

public class ArabaDto {

    private Long id;
    private String model;
    private Integer age;
    private KisiDto kisiDto;



    public ArabaDto() {
    }

    public ArabaDto(Long id, String model, Integer age,KisiDto kisiDto) {
        this.id = id;
        this.model = model;
        this.age = age;
        this.kisiDto = kisiDto;
    }

    public KisiDto getKisiDto() {
        return kisiDto;
    }

    public void setKisiDto(KisiDto kisiDto) {
        this.kisiDto = kisiDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
