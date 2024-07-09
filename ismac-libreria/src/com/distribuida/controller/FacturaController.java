package com.distribuida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.distribuida.entities.Factura_detalle;


	@Controller

	@RequestMapping

public class FacturaController {
		
		
		@Autowired
		
		private FacturaDAO FacturaDAO;
		
		@Autowired
		
		private Factura_detalle facturaDetalleDAO;
		
		@GetMapping("/findAll")
		
		public String findAll_(ModelMap modelMap) {
			
			modelMap.addAtributte("facturas", FacturaDAO.findAll());
			return "listar-facturas";
					
		}
}
	
	
