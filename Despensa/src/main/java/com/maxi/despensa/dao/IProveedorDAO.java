package com.maxi.despensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxi.despensa.model.Proveedor;

@Repository
public interface IProveedorDAO extends JpaRepository<Proveedor, Long>{

}
