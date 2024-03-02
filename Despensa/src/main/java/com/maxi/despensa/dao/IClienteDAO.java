package com.maxi.despensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxi.despensa.model.Cliente;
@Repository
public interface IClienteDAO extends JpaRepository<Cliente, Long>{

}
