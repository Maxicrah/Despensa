package com.maxi.despensa.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Inventario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idInventario;
	@OneToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;
	private Integer cantidad;
	private Double precioCompra;
	private Double precioVenta;
	@ManyToMany
	private List<Proveedor> proveedor;
	private String estado;
	private LocalDate fechaVencimiento;
	private LocalDate fechaActualizacion;
}
