package com.arm.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arm.atm.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{
	
	public Client findByName(String name);

}
