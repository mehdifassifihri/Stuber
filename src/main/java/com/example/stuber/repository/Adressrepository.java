package com.example.stuber.repository;

import com.example.stuber.models.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Adressrepository extends JpaRepository<Adress,Long> {
}
