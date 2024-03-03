package com.maxi.despensa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.despensa.model.Venta;
import com.maxi.despensa.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private IVentaService venServ;
	
	@PostMapping("/crear")
	public String vreateVenta(@RequestBody Venta venta) {
		venServ.saveVenta(venta);
		return "Venta creada";
	}
	
	@GetMapping("/traer/{id}")
	public Venta getVenta(@PathVariable Long id) {
		return venServ.getVenta(id);
	}
	
	@GetMapping("/traer")
	public List<Venta> getVentas(){
		return venServ.getVentas();
	}
	
	@DeleteMapping("/eliminar/{idVen}")
	public String deleteVenta(@PathVariable Long idVen) {
		venServ.deleteVenta(idVen);
		return "Venta eliminada";
	}
	
	@PutMapping("/editar/{idVenta}")
	public Venta editVenta(@PathVariable Long idVenta,
							@RequestBody Venta venta) {
		return venServ.editVenta(idVenta, venta);
	}
	
	
}
