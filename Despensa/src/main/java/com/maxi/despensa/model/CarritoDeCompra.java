package com.maxi.despensa.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CarritoDeCompra {

	private Long idCarrito;
	private List<Producto> productos;
	private Double total;
	private Cliente unCliente;
}
