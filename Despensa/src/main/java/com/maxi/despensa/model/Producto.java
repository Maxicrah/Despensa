package com.maxi.despensa.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Producto {

	private Long idProducto;
	private String descripcion;
	private String nombre;
	private Double precio;
	private String stock;
	private Categoria catProd;
	private String imagen;
	private LocalDate fechaVencimiento;
	private Proveedor proveedor;
	
	
	
}
