package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bookmodel;
@Repository
public interface Bookrepo extends JpaRepository<Bookmodel, Integer>{

}
