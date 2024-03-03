package com.maxi.despensa.service;

import java.util.List;

import com.maxi.despensa.model.Categoria;

public interface ICategoriaService {

	//crear categoria
	public Categoria saveCategoria(Categoria cat);
	//eliminar categoria
	public void deleteCategoria(Long id);
	//traer categoria por id
	public Categoria getCategoria(Long id);
	//traer todas categorias
	public List<Categoria> getCategorias();
	//editar categoria
	public Categoria editCategoria(Long id, Categoria cat);
	
}
