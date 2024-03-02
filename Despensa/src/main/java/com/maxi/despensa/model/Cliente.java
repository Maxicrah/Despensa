package com.maxi.despensa.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private Long idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String direccion;
	private String dni;
	@Temporal(TemporalType.DATE)
	private LocalDate fechaNacimiento;
	private Double saldoCuenta;
	@Temporal(TemporalType.DATE)
	private LocalDate fechaRegistro;
	private String tipoCliente;
	@OneToMany(mappedBy = "unCliente")
	private List<Venta> ventas;
	@OneToMany(mappedBy = "unCliente")
	private List<CarritoDeCompra> carritosDeCompra;
}
