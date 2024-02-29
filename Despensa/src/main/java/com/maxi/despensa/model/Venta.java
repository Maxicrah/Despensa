package com.maxi.despensa.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Venta {

	private Long idVenta;
	private LocalDate fechaVenta;
	private Double totalVenta;
	private Cliente unCliente;
	private List<Producto> listaProducts;
	private String metodoPago;
	private String estado;
	//private Vendedor unVendedor;
	private Double descuento;
	private String observaciones;
}
