package com.distribuida.entities;

import java.util.Date;

public class facturadetalle {
	
	
	//atributos
	

	private int idFactura_detalle;
	private int cantidad;
	private float subtotal;
	private int idFactua;
	private int idLibro;
	
	
	public facturadetalle(int idFactura_detalle, int cantidad, float subtotal, int idFactua, int idLibro) {
		super();
		this.idFactura_detalle = idFactura_detalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.idFactua = idFactua;
		this.idLibro = idLibro;
	}


	public int getIdFactura_detalle() {
		return idFactura_detalle;
	}


	public void setIdFactura_detalle(int idFactura_detalle) {
		this.idFactura_detalle = idFactura_detalle;
	}

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public float getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}



	public int getIdFactua() {
		return idFactua;
	}



	public void setIdFactua(int idFactua) {
		this.idFactua = idFactua;
	}


	public int getIdLibro() {
		return idLibro;
	}



	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}





	@Override
	public String toString() {
		return "facturadetalle [idFactura_detalle=" + idFactura_detalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", idFactua=" + idFactua + ", idLibro=" + idLibro + "]";
	}
	

	

}
