package com.maxi.despensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.despensa.dao.ICategoriaDAO;
import com.maxi.despensa.model.Categoria;

@Service
public class CategoriaService implements ICategoriaService{

	@Autowired
	private ICategoriaDAO catDAO;
	
	@Override
	public Categoria saveCategoria(Categoria cat) {
		return catDAO.save(cat);
	}

	@Override
	public void deleteCategoria(Long id) {
		catDAO.deleteById(id);
	}

	@Override
	public Categoria getCategoria(Long id) {
		return catDAO.findById(id).orElse(null);
	}

	@Override
	public List<Categoria> getCategorias() {
		return catDAO.findAll();
	}

	@Override
	public Categoria editCategoria(Long id, Categoria cat) {
		
		Categoria categoria = this.getCategoria(id);
		categoria.setDescripcion(cat.getDescripcion());
		categoria.setNombre(cat.getNombre());
		categoria.setProductos(cat.getProductos());
		
		this.saveCategoria(categoria);
		
		return categoria;
	}

}
