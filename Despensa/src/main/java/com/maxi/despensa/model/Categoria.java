package com.maxi.despensa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Categoria {

	private Long idCategoria;
	private String nombre;
	private String descripcion;
}
