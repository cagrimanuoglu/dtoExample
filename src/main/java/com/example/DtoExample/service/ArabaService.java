package com.example.DtoExample.service;

import com.example.DtoExample.dto.ArabaDto;
import com.example.DtoExample.entity.Araba;
import org.springframework.http.ResponseEntity;

public interface ArabaService {

    ResponseEntity<ArabaDto>save(ArabaDto arabaDto);

}
