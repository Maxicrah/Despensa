package com.maxi.despensa.service;

import java.util.List;

import com.maxi.despensa.model.Producto;

public interface IProductoService {

	//crear producto
	public Producto saveProduct(Producto prod);

	//decrementa el stock de un producto
	public void decrementStockProduct(Long id);
	
	//agrega stock de un producto
	public void addStock(Long id, Integer cantAdd);
	
	//elimina un producto 
	public void deleteProduct(Long id);
	
	//traer un producto
	public Producto getProduct(Long id);
	
	//traer todos los productos
	public List<Producto> getProducts();
	
	//editar producto
	public Producto editProduct(Long id, Producto prod);
}
