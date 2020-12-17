package com.example.DtoExample.mapper;

import com.example.DtoExample.dto.ArabaDto;
import com.example.DtoExample.entity.Araba;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArabaMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "model",target = "model")
    @Mapping(source = "age",target = "age")
    @Mapping(source = "kisiDto",target = "kisi")
    Araba fromDto(ArabaDto arabaDto);

    @InheritInverseConfiguration(name = "fromDto")
    ArabaDto toDto(Araba araba);



}
