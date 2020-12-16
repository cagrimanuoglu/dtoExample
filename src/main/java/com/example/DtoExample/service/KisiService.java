package com.example.DtoExample.service;

import com.example.DtoExample.dto.KisiDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface KisiService {

    ResponseEntity<KisiDto> save(KisiDto kisiDto);

    void delete(Long id);
    List<KisiDto> getAll();



}
