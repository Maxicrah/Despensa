package com.maxi.despensa.service;

import java.util.List;

import com.maxi.despensa.model.Inventario;

public interface IInventarioService {

	//crear inventario de producto
	public Inventario saveInventario(Inventario inv);
	//editar inventario
	public Inventario editInventario(Long id, Inventario inv);
	//eliminar inventario
	public void deleteInventario(Long id);
	//traer un inventario
	public Inventario getInventario(Long id);
	//traer todos inventarios
	public List<Inventario> getInventarios();
}
