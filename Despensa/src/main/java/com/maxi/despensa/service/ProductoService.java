package com.maxi.despensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.despensa.dao.IProductoDAO;
import com.maxi.despensa.model.Producto;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProductoDAO productDAO;
	
	
	@Override
	public Producto saveProduct(Producto prod) {
		return productDAO.save(prod);
	}

	@Override
	public void decrementStockProduct(Long id) {
		Producto prod = this.getProduct(id);
		Integer stock = prod.getStock();
		if(stock>0) {
			stock--;
			prod.setStock(stock);
			this.saveProduct(prod);
		}else {
			productDAO.deleteById(id);
		}
	}

	@Override
	public Producto getProduct(Long id) {
		return productDAO.findById(id).orElse(null);
	}

	@Override
	public List<Producto> getProducts() {
		return productDAO.findAll();
	}

	@Override
	public Producto editProduct(Long id, Producto prod) {
		Producto product = this.getProduct(id);
		
		product.setNombre(prod.getNombre());
		product.setDescripcion(prod.getDescripcion());
		product.setPrecio(prod.getPrecio());
		product.setStock(prod.getStock());
		product.setCatProd(prod.getCatProd());
		product.setProveedores(prod.getProveedores());
		product.setFechaVencimiento(prod.getFechaVencimiento());
		product.setInventario(prod.getInventario());
		
		this.saveProduct(product);
		
		return product;
	}

	@Override
	public void deleteProduct(Long id) {
		productDAO.deleteById(id);
	}

	@Override
	public void addStock(Long id, Integer cantAdd) {
		
		Producto prod = this.getProduct(id);
		Integer stock = prod.getStock();
		stock = stock + cantAdd;
		prod.setStock(stock);
		this.saveProduct(prod);
		
	}

	
}
