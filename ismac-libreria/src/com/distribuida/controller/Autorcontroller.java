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

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;


	

	@Controller
	@RequestMapping("/autores")          // path principal
	public class Autorcontroller {
		
		
		@Autowired
		private AutorDAO autorDAO;
		
		
	// JSP .- jAVA SERVER PAGE, SON LAS PAGINAS WEB DE TENCOLOGIA JAVA 
		@GetMapping("/findAll")
		public String findAll(Model model ) {
			
			
			//try {
				
				
			
				List<Autor>autores =autorDAO.findALL();
				
				model.addAttribute("autores",autores);
				
				
				return "listar-autores"; 
				
	//		} catch (Exception e) {
	//			// TODO: handle exception
	//			e.printStackTrace();
	//		}
			
		
			
			
			
		}
		
	
		
		@GetMapping ("/findOne")
		public String findOne (@RequestParam("idAutor") @Nullable Integer idAutor   
			
			                   ,@RequestParam("opcion") @Nullable Integer opcion
			                   ,Model model
			
				) {
			
			
			//try {
			
			
			if(idAutor !=null) {
				
				Autor autor =autorDAO.findOne(idAutor);
				model.addAttribute("autor", autor);
			}
				if(opcion==1)return "add-autores";
				else return "del-autores";
				
		//	} catch (Exception e) {
				// TODO: handle exception
	//		}
			
		

}
	
		
		
		@PostMapping("/add")
		public String add(@RequestParam("idCliente")@Nullable Integer idAutor
			              ,@RequestParam("nombre")@Nullable String nombre
			              ,@RequestParam("apellido")@Nullable String pais
			              ,@RequestParam("pais")@Nullable String apellido
			              ,@RequestParam("direccion")@Nullable String direccion
		                  ,@RequestParam("telefono")@Nullable String  telefono
			              ,@RequestParam("correo")@Nullable String  correo
			              ,Model model
			
			){
				
				
				
				//try {
				

					if(idAutor ==null) {
				Autor autor =new Autor(0,nombre,pais,apellido,direccion,telefono,correo);
				autorDAO.add(autor);
				
				}else {
					
					Autor autor2 =new Autor(idAutor,nombre,pais,apellido,direccion,telefono,correo);
					autorDAO.up(autor2);
				}
					return "redirect:/clintes/findAll"; 
				
			//	} catch (Exception e) {
					// TODO: handle exception
			//	}
			
				
			
		
			
			
		}
		
		@GetMapping("/del")
		public String del(@RequestParam("idAutor")@Nullable Integer idAutor) {
			
			
		//	try {
			
				autorDAO.del(idAutor);
				return"redirect:/autores/findAll";
	//		} catch (Exception e) {
				// TODO: handle exception
	//		}
			
		}
		
		}
		
	