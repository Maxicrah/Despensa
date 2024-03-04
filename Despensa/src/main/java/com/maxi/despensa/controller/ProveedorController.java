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

import com.maxi.despensa.model.Proveedor;
import com.maxi.despensa.service.IProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

	@Autowired
	private IProveedorService provServ;
	
	
	@PostMapping("/crear")
	public String createProveedor(@RequestBody Proveedor prov) {
		Proveedor proveedor = provServ.saveProveedor(prov);
		if(proveedor!=null) {
			return "Proveedor creado";
		}else {
			return "NO se creo nada";
		}
	}
	
	@GetMapping("/traer/{id}")
	public Proveedor getProveedorById(@PathVariable Long id) {
		return provServ.getProveedor(id);
	}
	
	@GetMapping("/traer")
	public List<Proveedor> getProveedores(){
		return provServ.getProveedores();
	}
	
	@DeleteMapping("/eliminar/{idProv}")
	public String deleteProveedor(@PathVariable Long idProv) {
		provServ.deleteProveedor(idProv);
		return "Proveedor eliminado";
	}
	
	@PutMapping("/editar/{idProveedor}")
	public Proveedor editProveedor(@PathVariable Long idProveedor, @RequestBody Proveedor prov) {
		return provServ.editProveedor(idProveedor, prov);
	}
}
