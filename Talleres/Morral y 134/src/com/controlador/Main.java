package com.controlador;

import java.util.ArrayList;
import java.util.List;

public class Main {
private static List<Articulo> articulosTomarPrestado = new ArrayList<Articulo>();
	public static void main(String[] args) 
	{
		int resultado = 0;
		articulosTomarPrestado.add(new Articulo("banana",1,1));
		articulosTomarPrestado.add(new Articulo("banana de plata",10,10));
		articulosTomarPrestado.add(new Articulo("banana oro",100,100));
		articulosTomarPrestado.add(new Articulo("banana de diamante",1000,1000));
		articulosTomarPrestado.add(new Articulo("manzana",2,2));
		articulosTomarPrestado.add(new Articulo("manzana de plata",20,20));
		articulosTomarPrestado.add(new Articulo("manzana oro",200,200));
		articulosTomarPrestado.add(new Articulo("manzana de diamante",2000,2000));
		
		resultado = Morral.mejorTula(articulosTomarPrestado, 1000);
		System.out.println("Resultado: " + resultado);
		
	}

}
