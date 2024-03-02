package com.maxi.despensa.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Proveedor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProveedor;
	private String nombre;
	private String telProveedor;
	private String correoProveedor;
	private String direccionProveedor;
	@ManyToMany(mappedBy = "proveedores")
	private List<Producto> listaProductos;
	private String estado;
	private LocalDate fechaRegistro;
	private String observaciones;
	@ManyToMany(mappedBy="proveedor")
	private List<Inventario> inventarios;
	
}
