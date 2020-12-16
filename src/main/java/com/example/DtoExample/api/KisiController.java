package com.example.DtoExample.api;

import com.example.DtoExample.dto.KisiDto;
import com.example.DtoExample.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KisiController {

    @Autowired
    private KisiService kisiService;

    @PostMapping("/adduser")
    public ResponseEntity<KisiDto> addKisi(@RequestBody KisiDto kisiDto)
    {
        return kisiService.save(kisiDto);
    }

}
