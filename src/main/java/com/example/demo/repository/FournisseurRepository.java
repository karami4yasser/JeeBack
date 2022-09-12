package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Founisseur;
import java.util.List;
public interface FournisseurRepository  extends JpaRepository<Founisseur, Long>{

    List<Founisseur> findAll();

}
