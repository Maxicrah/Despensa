package com.maxi.despensa.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Inventario {

	private Long idInventario;
	private Long idProducto;
	private Integer cantidad;
	private Double precioCompra;
	private Double precioVenta;
	private Proveedor proveedor;
	private String estado;
	private LocalDate fechaVencimiento;
	private LocalDate fechaActualizacion;
}
