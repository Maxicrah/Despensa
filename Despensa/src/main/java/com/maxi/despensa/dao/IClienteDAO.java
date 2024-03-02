package com.maxi.despensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.despensa.model.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Long>{

}
