package com.maxi.despensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.despensa.dao.IVentaDAO;
import com.maxi.despensa.model.Venta;

@Service
public class VentaService implements IVentaService{

	@Autowired
	private IVentaDAO venDAO;
	
	@Override
	public Venta saveVenta(Venta venta) {
		return venDAO.save(venta);
	}

	@Override
	public void deleteVenta(Long id) {
		venDAO.deleteById(id);
	}

	@Override
	public Venta getVenta(Long id) {
		return venDAO.findById(id).orElse(null);
	}

	@Override
	public List<Venta> getVentas() {
		return venDAO.findAll();
	}

	@Override
	public Venta editVenta(Long id, Venta ven) {
		
		Venta venta = this.getVenta(id);
		venta.setFechaVenta(ven.getFechaVenta());
		venta.setDescuento(ven.getDescuento());
		venta.setMetodoPago(ven.getMetodoPago());
		venta.setListaProducts(ven.getListaProducts());
		venta.setObservaciones(ven.getObservaciones());
		venta.setEstado(ven.getEstado());
		
		this.saveVenta(venta);
		
		return venta;
	}

}
