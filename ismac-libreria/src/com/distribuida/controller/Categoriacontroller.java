package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;


	

	@Controller
	@RequestMapping("/categorias")          // path principal
	public class Categoriacontroller {
		
		
		@Autowired
		private CategoriaDAO categoriaDAO;
		
		
	// JSP .- jAVA SERVER PAGE, SON LAS PAGINAS WEB DE TENCOLOGIA JAVA 
		@GetMapping("/findAll")
		public String findAll(Model model ) {
			
			
			//try {
				
				
			
				List<Categoria>categorias = categoriaDAO.findALL();
				
				model.addAttribute("categorias",categorias); 
				
				
				return "listar-categorias";
				
	//		} catch (Exception e) {
	//			// TODO: handle exception
	//			e.printStackTrace();
	//		}
			
		
			
			
			
		}
		
	
		
		@GetMapping ("/findOne")
		public String findOne (@RequestParam("idCategoria") @Nullable Integer idCategoria   
			
			                   ,@RequestParam("opcion") @Nullable Integer opcion
			                   ,Model model
			
				) {
			
			
			//try {
			
			
			if(idCategoria !=null) {
				
				Categoria categoria =categoriaDAO.findOne(idCategoria);
				model.addAttribute("categoria", categoria);
			}
				if(opcion==1)return "add-categorias";
				else return "del-clientes";
				
		//	} catch (Exception e) {
				// TODO: handle exception
	//		}
			
		

}
	
		
		
		@PostMapping("/add")
		public String add(@RequestParam("idCategoria")@Nullable Integer idCategoria
			              ,@RequestParam("cedula")@Nullable String categoria
			              
			              
			              ,Model model
			
			){
				
				
				
				//try {
				

					if(idCategoria ==null) {
				Categoria categoria1 =new  Categoria (0,categoria);
				categoriaDAO.add(categoria1);
				
				}else {
					
					Categoria categoria2 =new Categoria (idCategoria,categoria);
					categoriaDAO.up(categoria2);
				}
					return "redirect:/categorias/findAll";
					
			//	} catch (Exception e) {
					// TODO: handle exception
			//	}
			
				
			
		
			
			
		}
		
		@GetMapping("/del")
		public String del(@RequestParam("idCategoria")@Nullable Integer idCategoria) {
			
			
		//	try {
			
				categoriaDAO.del(idCategoria);
				return"redirect:/categorias/findAll";
	//		} catch (Exception e) {
				// TODO: handle exception
	//		}
			
		}
		
		}
		
	
