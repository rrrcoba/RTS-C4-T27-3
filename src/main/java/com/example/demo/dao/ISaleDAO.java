package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Sale;

public interface ISaleDAO extends JpaRepository<Sale, Long>{

}
