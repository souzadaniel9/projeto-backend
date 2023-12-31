package com.daniel.backendCompleto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.backendCompleto.model.Vendedor;
import com.daniel.backendCompleto.repository.VendedorRepository;

@Service
public class VendedorService {

	@Autowired
	private VendedorRepository repository;

	public List<Vendedor> obterTodos() {
		return repository.findAll();
	}

	public Optional<Vendedor> obterPorId(Integer id) {
		return repository.findById(id);
	}

	public Vendedor adicionarVendedor(Vendedor v) {
		return repository.save(v);
	}

	public void deletarUsandoId(Integer id) {
		repository.deleteById(id);
	}

	public void atualizarVendedor(Integer id, Vendedor v) {
		v.setId(id);
		repository.save(v);
	}

}
