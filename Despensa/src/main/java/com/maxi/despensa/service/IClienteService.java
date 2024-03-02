package com.maxi.despensa.service;

import java.util.List;

import com.maxi.despensa.model.Cliente;

public interface IClienteService {

	//crear cliente
	public Cliente saveCliente(Cliente cli);
	
	//eliminar cliente
	public void deleteCliente(Long id);
	
	//traer clientes
	public List<Cliente> findClientes();
	
	//traer un cliente por ID
	public Cliente findCliente(Long id);
	
	//editar un cliente
	public Cliente editCliente(Long id, Cliente cli);
}
