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

import com.maxi.despensa.model.Producto;
import com.maxi.despensa.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService prodServ;
	
	
	@PostMapping("/crear")
	public Producto createProduct(@RequestBody Producto prod) {
		return prodServ.saveProduct(prod);
	}
	
	@GetMapping("/traer")
	@ResponseBody
	public List<Producto> getProducts(){
		return prodServ.getProducts();
	}
	
	@GetMapping("/traer/{id}")
	public Producto getProduct(@PathVariable Long id) {
		return prodServ.getProduct(id);
	}
	
	@DeleteMapping("/eliminar/{idProd}")
	public String deleteProduct(@PathVariable Long idProd) {
		prodServ.deleteProduct(idProd);
		return "Producto eliminado";
	}
	
	@PutMapping("/editar/{idProducto}")
	public Producto editProduct(@PathVariable Long idProducto, @RequestBody Producto prod) {
		
		return prodServ.editProduct(idProducto, prod);
	}
	
}
