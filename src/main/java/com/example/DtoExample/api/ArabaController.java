package com.example.DtoExample.api;

import com.example.DtoExample.dto.ArabaDto;
import com.example.DtoExample.service.ArabaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArabaController {
    @Autowired
    private ArabaService arabaService;

    // Deneme Branch
    @PostMapping("/addcar")
    public ResponseEntity<ArabaDto> addAraba(@RequestBody ArabaDto arabaDto)
    {
        return arabaService.save(arabaDto);
    }

}
