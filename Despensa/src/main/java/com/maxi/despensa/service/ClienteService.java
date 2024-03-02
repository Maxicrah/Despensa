package com.maxi.despensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.maxi.despensa.dao.IClienteDAO;
import com.maxi.despensa.model.Cliente;

public class ClienteService implements IClienteService{

	
	@Autowired
	private IClienteDAO cliDAO;
	
	@Override
	public Cliente saveCliente(Cliente cli) {
	return cliDAO.save(cli);
	}

	@Override
	public void deleteCliente(Long id) {
		cliDAO.deleteById(id);
	}

	@Override
	public List<Cliente> findClientes() {
		return cliDAO.findAll();
	}

	@Override
	public Cliente findCliente(Long id) {
		return cliDAO.findById(id).orElse(null);
	}

	@Override
	public Cliente editCliente(Long id, Cliente cli) {
		Cliente cliente = this.findCliente(id);
		cliente.setNombre(cli.getNombre());
		cliente.setApellido(cli.getApellido());
		cliente.setTelefono(cli.getTelefono());
		cliente.setDireccion(cli.getDireccion());
		cliente.setTipoCliente(cli.getTipoCliente());
		cliente.setDni(cli.getDni());
		cliente.setCorreo(cli.getCorreo());
		cliente.setFechaNacimiento(cli.getFechaNacimiento());
		
		this.saveCliente(cliente);
		
		return cliente;
	}
	

}
