package com.example.foxpet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.foxpet.model.Provincia;


@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {

}