package com.controlador;

import java.util.ArrayList;
import java.util.List;

public class Main {
private static List<Articulo> articulosTomarPrestado = new ArrayList<Articulo>();
	public static void main(String[] args) 
	{
		/*Morral problem*/
		int resultado = 0;
		articulosTomarPrestado.add(new Articulo("banana",1,1));
		articulosTomarPrestado.add(new Articulo("banana de plata",2,2));
		articulosTomarPrestado.add(new Articulo("banana oro",10,10));
		articulosTomarPrestado.add(new Articulo("banana de diamante",50,50));
		articulosTomarPrestado.add(new Articulo("manzana",4,4));
		articulosTomarPrestado.add(new Articulo("manzana de plata",8,8));
		articulosTomarPrestado.add(new Articulo("manzana oro",20,20));
		articulosTomarPrestado.add(new Articulo("manzana de diamante",2000,2000));
		articulosTomarPrestado.add(new Articulo("pendiente A",1000,5));
		articulosTomarPrestado.add(new Articulo("pendiente B",1000,5));
		
		resultado = Morral.mejorTula(articulosTomarPrestado, 10);
		System.out.println("Resultado: " + resultado);
		/*134 problem*/
		int resultado134 = 0;
		resultado134 = E134.descomposicion134(10);
		System.out.println("Resultado 134: " + resultado134);
	}

}
