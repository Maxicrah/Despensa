package com.maxi.despensa.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class CarritoDeCompra {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCarrito;
	@ManyToMany
	@JoinTable(
		name = "carrito_producto",
		joinColumns = @JoinColumn(name = "carrito_id"),
		inverseJoinColumns = @JoinColumn(name = "producto_id")
			)
	
	private List<Producto> productos;
	private Double total;
	@ManyToOne
	private Cliente unCliente;
}
