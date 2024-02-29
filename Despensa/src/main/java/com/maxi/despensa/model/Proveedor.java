package com.maxi.despensa.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Proveedor {

	private Long idProveedor;
	private String nombre;
	private String telProveedor;
	private String correoProveedor;
	private String direccionProveedor;
	private List<Producto> listaProductos;
	private String estado;
	private LocalDate fechaRegistro;
	private String observaciones;
	
}
