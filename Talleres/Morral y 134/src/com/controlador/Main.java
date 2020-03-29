package com.controlador;

import java.util.ArrayList;
import java.util.List;

public class Main {
private static List<Articulo> articulosTomarPrestado = new ArrayList<Articulo>();
	public static void main(String[] args) 
	{
		/*Morral problem 1*/
		/*int resultado = 0;
		articulosTomarPrestado.add(new Articulo("banana",1,1));
		articulosTomarPrestado.add(new Articulo("banana de plata",2,2));
		articulosTomarPrestado.add(new Articulo("manzana",4,4));
		articulosTomarPrestado.add(new Articulo("banana oro",10,10));
		articulosTomarPrestado.add(new Articulo("manzana oro",20,20));
		articulosTomarPrestado.add(new Articulo("banana de diamante",50,50));
		articulosTomarPrestado.add(new Articulo("pendiente A",1000,5));*/

		
		/*Morral Problem 2 - Mixed*/
		/*int resultado = 0;
		articulosTomarPrestado.add(new Articulo("banana oro",10,10));
		articulosTomarPrestado.add(new Articulo("manzana oro",20,20));
		articulosTomarPrestado.add(new Articulo("banana de diamante",50,50));
		articulosTomarPrestado.add(new Articulo("pendiente A",1000,5));
		articulosTomarPrestado.add(new Articulo("banana",1,1));
		articulosTomarPrestado.add(new Articulo("banana de plata",2,2));
		articulosTomarPrestado.add(new Articulo("manzana",4,4));*/

		
		/*Morral problem 3 - Falling*/
		int resultado = 0;
		articulosTomarPrestado.add(new Articulo("B",50,10));
		articulosTomarPrestado.add(new Articulo("M",20,9));
		articulosTomarPrestado.add(new Articulo("BO",10,8));
		articulosTomarPrestado.add(new Articulo("PA",1000,7));
		articulosTomarPrestado.add(new Articulo("M",4,6));
		articulosTomarPrestado.add(new Articulo("BP",2,5));
		articulosTomarPrestado.add(new Articulo("B",1,4));
		
		
		resultado = Morral.mejorTula(articulosTomarPrestado, 8);
		System.out.println("Resultado: " + resultado);
		/*134 problem*/
		int resultado134 = 0;
		resultado134 = E134.forma134(10);
		System.out.println("Resultado 134: " + resultado134);
		resultado134 = E134.forma134recursion(10);
		System.out.println("Resultado recursivo 134: " + resultado134);
		
		/*Problema 4.6 Boh*/
		ArrayList<Integer> arregloP = new ArrayList<Integer>();
		
		/*arregloP.add(4);
		arregloP.add(2);
		arregloP.add(10);
		arregloP.add(25);
		arregloP.add(3);
		arregloP.add(5);
		arregloP.add(1);*/
		
		/*arregloP.add(1);
		arregloP.add(1);
		arregloP.add(1);
		arregloP.add(1);
		arregloP.add(1);
		arregloP.add(1);*/
		
		/*arregloP.add(7);
		arregloP.add(8);
		arregloP.add(1);
		arregloP.add(15);
		arregloP.add(1);*/
	
		
		if(EjerciciosBoh.posibleDividirArreglo(arregloP) == false)
		{
			System.out.println("No es posible dividir el arreglo en conjuntos equivalentes");
		}
	}

}
