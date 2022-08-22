package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.CashRegister;

public interface ICashRegisterDAO extends JpaRepository<CashRegister, Long>{

}
