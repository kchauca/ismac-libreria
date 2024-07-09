package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class principalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		//Add
		Cliente cliente = new Cliente(0,"123456789","juan","taipe","av.por ahi","0987456321","jtaipe2@correo.com");
		clienteDAO.add(cliente);
		
		//Up
		Cliente cliente2 = new Cliente(1,"1234567892","juan2","taipe2","av.por ahi2","09874563212","jtaipe2@correo.com2");
		//clienteDAO.add(cliente2);
		
		//del
		//clienteDAO.del(1);
		System.out.println("****************** DEL ************"+clienteDAO.findOne(1));
		
		//findAll
		//List<Cliente> clientes = clienteDAO.findALL();
		clienteDAO.findALL().forEach(item -> {System.out.println(item.toString());
		});
		
		context.close();
	}

}
