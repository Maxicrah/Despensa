package com.maxi.despensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.despensa.dao.IInventarioDAO;
import com.maxi.despensa.model.Inventario;

@Service
public class InventarioService implements IInventarioService{

	@Autowired
	private IInventarioDAO invDAO;
	
	@Override
	public Inventario saveInventario(Inventario inv) {
		return invDAO.save(inv);
	}

	@Override
	public Inventario editInventario(Long id, Inventario inv) {
		Inventario inventario = this.getInventario(id);
		inventario.setProveedor(inv.getProveedor());
		inventario.setCantidad(inv.getCantidad());
		inventario.setPrecioCompra(inv.getPrecioCompra());
		inventario.setPrecioVenta(inv.getPrecioVenta());
		inventario.setProveedor(inv.getProveedor());
		inventario.setEstado(inv.getEstado());
		inventario.setFechaActualizacion(inv.getFechaActualizacion());
		inventario.setFechaVencimiento(inv.getFechaVencimiento());
		
		this.saveInventario(inventario);
		
		return inventario;
	}

	@Override
	public void deleteInventario(Long id) {
		invDAO.deleteById(id);
	}

	@Override
	public Inventario getInventario(Long id) {
		return invDAO.findById(id).orElse(null);
	}

	@Override
	public List<Inventario> getInventarios() {
		return invDAO.findAll();
	}

}
