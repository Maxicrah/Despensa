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

import com.maxi.despensa.model.Categoria;
import com.maxi.despensa.service.ICategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaService catServ;
	
	@PostMapping("/crear")
	public String saveCategoria(@RequestBody Categoria cat) {
		catServ.saveCategoria(cat);
		return "Categoria creada";
	}
	
	@GetMapping("/traer")
	public List<Categoria> getCategorias(){
		return catServ.getCategorias();
	}
	
	@GetMapping("/traer/{id}")
	@ResponseBody
	public Categoria getCategoria(@PathVariable Long id) {
		return catServ.getCategoria(id);
	}
	
	@DeleteMapping("/eliminar/{idCat}")
	public String deleteCategoria(@PathVariable Long idCat) {
		catServ.deleteCategoria(idCat);
		return "Eliminado correctamente";
	}
	
	@PutMapping("/editar/{idCategoria}")
	public Categoria editCategoria( @PathVariable Long idCategoria,
									@RequestBody Categoria cat) {
		
		return catServ.editCategoria(idCategoria, cat);
	}
	
}
