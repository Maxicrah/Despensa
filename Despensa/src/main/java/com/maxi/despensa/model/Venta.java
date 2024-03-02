package com.maxi.despensa.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenta;
	@Temporal(TemporalType.DATE)
	private LocalDate fechaVenta;
	private Double totalVenta;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente unCliente;
	@ManyToMany
	@JoinTable(
	        name = "venta_producto",
	        joinColumns = { @JoinColumn(name = "venta_id") },
	        inverseJoinColumns = { @JoinColumn(name = "producto_id") }
	    )
	private List<Producto> listaProducts;
	private String metodoPago;
	private String estado;
	//private Vendedor unVendedor;
	private Double descuento;
	private String observaciones;
}
