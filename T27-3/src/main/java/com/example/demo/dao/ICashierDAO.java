package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Cashier;

public interface ICashierDAO extends JpaRepository<Cashier, Long>{

}
