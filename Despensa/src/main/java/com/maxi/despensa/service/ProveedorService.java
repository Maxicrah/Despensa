package com.maxi.despensa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.despensa.dao.IProveedorDAO;
import com.maxi.despensa.model.Producto;
import com.maxi.despensa.model.Proveedor;

@Service
public class ProveedorService implements IProveedorService{

	@Autowired
	private IProveedorDAO prodDAO;
	@Autowired 
	private IProductoService prodServ;
	
	
	@Override
	public Proveedor saveProveedor(Proveedor prov) {
		
		List<Producto> productosValidos = new ArrayList<>();
		
		for(Producto producto : prov.getListaProductos()) {

			Producto prodEx = prodServ.getProduct(producto.getIdProducto());
			
			if(prodEx !=null) {
				productosValidos.add(prodEx);
			}	
		}
		
		if(!productosValidos.isEmpty()) {
			prov.setListaProductos(productosValidos);
			return prodDAO.save(prov);
		}else {
			return null;
		}
	}

	@Override
	public void deleteProveedor(Long id) {
		prodDAO.deleteById(id);
	}

	@Override
	public Proveedor getProveedor(Long id) {
		return prodDAO.findById(id).orElse(null);
	}

	@Override
	public List<Proveedor> getProveedores() {
		return prodDAO.findAll();
	}

	@Override
	public Proveedor editProveedor(Long id, Proveedor prov) {
		
		Proveedor proveedor = this.getProveedor(id);
		
		proveedor.setNombre(prov.getNombre());
		proveedor.setFechaRegistro(prov.getFechaRegistro());
		proveedor.setCorreoProveedor(prov.getCorreoProveedor());
		proveedor.setTelProveedor(prov.getTelProveedor());
		proveedor.setDireccionProveedor(prov.getDireccionProveedor());
		proveedor.setEstado(prov.getEstado());
		proveedor.setObservaciones(prov.getObservaciones());
		
		this.saveProveedor(proveedor);
		
		return proveedor;
	}
	

}
