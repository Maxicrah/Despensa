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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.despensa.model.Inventario;
import com.maxi.despensa.service.IInventarioService;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
	
	@Autowired
	private IInventarioService invServ;
	
	@PostMapping("/crear")
	public Inventario saveInventario(@RequestBody Inventario inv) {
		return invServ.saveInventario(inv);
	}
	
	@GetMapping("/traer/{id}")
	@ResponseBody
	public Inventario getInventario(@PathVariable Long id) {
		return invServ.getInventario(id);
	}
	
	@GetMapping("/traer")
	public List<Inventario> getInventarios(){
		return invServ.getInventarios();
	}
	
	@DeleteMapping("/eliminar/{idInv}")
	public String deleteInventario(@PathVariable Long idInv) {
		invServ.deleteInventario(idInv);
		return "Eliminado correctamente";
	}
	
	@PutMapping("/editar/{idInventario}")
	public Inventario editInventario(@PathVariable Long idInventario,
									@RequestBody Inventario inv) {
		return invServ.editInventario(idInventario, inv);
	}
	
}
