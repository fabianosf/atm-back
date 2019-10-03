package com.arm.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arm.atm.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{

}
