package com.example.DtoExample.service;
import com.example.DtoExample.dto.KisiDto;
import com.example.DtoExample.entity.Kisi;
import com.example.DtoExample.mapper.KisiMapper;
import com.example.DtoExample.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KisiServiceImpl implements KisiService {

    @Autowired
    private KisiRepository kisiRepository;

    @Autowired
    private KisiMapper kisiMapper;

    @Override
    public ResponseEntity<KisiDto> save(KisiDto kisiDto) {

        Kisi kisi = kisiMapper.fromDto(kisiDto);
        kisi=kisiRepository.save(kisi);
        return ResponseEntity.ok(kisiMapper.toDto(kisi));


    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<KisiDto> getAll() {
        return null;
    }
}
