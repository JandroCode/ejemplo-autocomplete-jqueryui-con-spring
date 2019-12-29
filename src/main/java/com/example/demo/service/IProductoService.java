package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Producto;

public interface IProductoService {
	
	public List<Producto> findByNombre(String term);
	public List<Producto>listAllProducts();
	

}