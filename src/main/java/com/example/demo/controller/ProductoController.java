package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Producto;
import com.example.demo.service.IProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value = "/{term}", produces= {"application/json"})
	public @ResponseBody List<Producto> cargarProductos(@PathVariable String term){
		return productoService.findByNombre(term);
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("productos", productoService.listAllProducts() );
		return "list";
	}
	

}
