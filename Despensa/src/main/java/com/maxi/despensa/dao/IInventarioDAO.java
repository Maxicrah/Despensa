package com.maxi.despensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxi.despensa.model.Inventario;

@Repository
public interface IInventarioDAO extends JpaRepository<Inventario, Long>{

}
