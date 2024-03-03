package com.maxi.despensa.service;

import java.util.List;

import com.maxi.despensa.model.Proveedor;

public interface IProveedorService {

	//crear proveedor
	public Proveedor saveProveedor(Proveedor prov);
	
	//eliminar proveedor
	public void deleteProveedor(Long id);
	
	//traer un proveedor
	public Proveedor getProveedor(Long id);
	
	//traer todos los proveedores
	public List<Proveedor> getProveedores();
	
	//editar proveedor
	public Proveedor editProveedor(Long id, Proveedor prov);
}
