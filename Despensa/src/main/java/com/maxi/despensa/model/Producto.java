package com.maxi.despensa.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "producto_id")
	private Long idProducto;
	private String descripcion;
	private String nombre;
	private Double precio;
	private String stock;
	@ManyToMany(mappedBy="productos")
	private List<CarritoDeCompra> carritosCompras;
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria catProd;
	private String imagen;
	@Temporal(TemporalType.DATE)
	private LocalDate fechaVencimiento;
	@ManyToMany
	private List<Proveedor> proveedores;
	@OneToOne(mappedBy = "producto")
	private Inventario inventario;
	@ManyToMany(mappedBy = "listaProducts")
	List<Venta> ventas;
}
