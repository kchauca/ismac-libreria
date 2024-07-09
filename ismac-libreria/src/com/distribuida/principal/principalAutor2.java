package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class principalAutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl2", AutorDAO.class);
		
		//Add
		Autor autor = new Autor(0,"123456789","juan","taipe","av.por ahi","0987456321","jtaipe2@correo.com");
		autorDAO.add(autor);
		
		//Up
		Autor autor2 = new Autor(54,"1234567892","juan2","taipe2","av.por ahi2","09874563212","jtaipe2@correo.com2");
		//autorDAO.up(autor2);
		
		//del
		//autorDAO.del(54);
		System.out.println("****************** DEL ************"+autorDAO.findOne(1));
		
		//findAll
		//List<Autor> autor = clienteDAO.findALL();
		autorDAO.findALL().forEach(item -> {System.out.println(item.toString());
		});
		
		context.close();
	}

}
