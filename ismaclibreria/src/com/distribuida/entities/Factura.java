package com.distribuida.entities;

import java.util.Date;

public class Factura {
	
	//atributos
	
	private int idFactura;
	private String num_factura;
	private Date fecha;
	private String total_neto;
	private Float  iva;
	private Float total; 
	private int idCliente;
	
	
	public Factura () {}


	public Factura(int idFactura, String num_factura, Date fecha, String total_neto, Float iva, Float total,
			int idCliente) {
		super();
		this.idFactura = idFactura;
		this.num_factura = num_factura;
		this.fecha = fecha;
		this.total_neto = total_neto;
		this.iva = iva;
		this.total = total;
		this.idCliente = idCliente;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public String getNum_factura() {
		return num_factura;
	}


	public void setNum_factura(String num_factura) {
		this.num_factura = num_factura;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getTotal_neto() {
		return total_neto;
	}


	public void setTotal_neto(String total_neto) {
		this.total_neto = total_neto;
	}


	public Float getIva() {
		return iva;
	}


	public void setIva(Float iva) {
		this.iva = iva;
	}


	public Float getTotal() {
		return total;
	}


	public void setTotal(Float total) {
		this.total = total;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", num_factura=" + num_factura + ", fecha=" + fecha + ", total_neto="
				+ total_neto + ", iva=" + iva + ", total=" + total + ", idCliente=" + idCliente + "]";
	}
	
	
	
	
	
}
