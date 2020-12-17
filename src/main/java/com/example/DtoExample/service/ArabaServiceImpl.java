package com.example.DtoExample.service;

import com.example.DtoExample.dto.ArabaDto;
import com.example.DtoExample.entity.Araba;
import com.example.DtoExample.mapper.ArabaMapper;
import com.example.DtoExample.repository.ArabaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ArabaServiceImpl implements ArabaService {
    @Autowired
    private ArabaRepository arabaRepository;
    @Autowired
    private ArabaMapper arabaMapper;

    @Override
    public ResponseEntity<ArabaDto> save(ArabaDto arabaDto) {

        Araba araba = arabaMapper.fromDto(arabaDto);
        araba=arabaRepository.save(araba);
        return ResponseEntity.ok(arabaMapper.toDto(araba));
    }
}
