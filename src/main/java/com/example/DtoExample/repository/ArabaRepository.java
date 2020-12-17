package com.example.DtoExample.repository;

import com.example.DtoExample.entity.Araba;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArabaRepository extends JpaRepository<Araba,Long> {
}
