package com.controlador;

public class Articulo 
{
	private String nobmre;
	private int precio;
	private int peso;
	
	
	public Articulo(String nobmre, int precio, int peso) {
		super();
		this.nobmre = nobmre;
		this.precio = precio;
		this.peso = peso;
	}
	public String getNobmre() {
		return nobmre;
	}
	public void setNobmre(String nobmre) {
		this.nobmre = nobmre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
