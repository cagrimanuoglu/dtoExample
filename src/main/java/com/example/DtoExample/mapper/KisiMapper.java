package com.example.DtoExample.mapper;

import com.example.DtoExample.dto.KisiDto;
import com.example.DtoExample.entity.Kisi;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring")
public interface KisiMapper {

    //@Mapping(source = "id",target = "id")
    @Mapping(source = "adi",target = "adi")
    @Mapping(source = "soyadi",target = "soyadi")
    Kisi fromDto(KisiDto kisiDto);

    @InheritInverseConfiguration(name = "fromDto")
    KisiDto toDto(Kisi kisi);


}
