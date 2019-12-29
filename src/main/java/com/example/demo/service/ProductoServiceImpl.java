package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository productoRepo;

	@Override
	public List<Producto> findByNombre(String term) {
		return productoRepo.findByNombre(term) ;
	}

	@Override
	public List<Producto> listAllProducts() {
		return (List<Producto>) productoRepo.findAll() ;
	}
	
	

}
