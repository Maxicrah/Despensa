package com.maxi.despensa.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Cliente {

	private Long idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String direccion;
	private String dni;
	private LocalDate fechaNacimiento;
	private Double saldoCuenta;
	private LocalDate fechaRegistro;
	private String tipoCliente;
}
