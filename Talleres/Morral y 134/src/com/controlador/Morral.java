package com.controlador;

import java.util.List;

public class Morral 
{
	public static int mejorTula(List<Articulo> arti, int w)
	{
		int cache[][] = new int [arti.size()+1][w+1];
		for(int i = 1 ; i<arti.size()+1 ; i++)
		{
			for(int j = 1 ; j <= w ; j++)
			{
				if(arti.get(i-1).getPeso() > j)
				{
					cache[i][j] = cache[i-1][j];
				}
				else
				{
					if(cache[i-1][j] >= (arti.get(i-1).getPrecio() + cache[i-1][j-arti.get(i-1).getPeso()]))
					{
						cache[i][j] = cache[i-1][j];
					}
					else 
					{
						cache[i][j] = arti.get(i-1).getPrecio() + cache[i-1][j-arti.get(i-1).getPeso()];
					}
				}
			}
			impresionMatriz(cache);
		}
		return cache[arti.size()][w];
	}
	public static void impresionMatriz(int matriz[][])
	{
		System.out.println("---------------- IMPRESION DE MATRIZ:");
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz[0].length; j++)
			{
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println();
		}
	}
	public static int mejorTulaEspacio(List<Integer> columnaFinal, List<Articulo> arti)
	{
		int i = 1,x = columnaFinal.size();
		do 
		{
			if(columnaFinal.get(x) < columnaFinal.get(x-arti.get(i).getPeso()))
			{
				columnaFinal.set(x, columnaFinal.get(x-arti.get(i).getPeso())+columnaFinal.get(i));
			}
			if(x > arti.get(i).getPeso())
			{
				x = x-1;
			}
			else
			{
				i = i+1;
				x = columnaFinal.size();
			}
		}while(i <= arti.size()+1);
		return columnaFinal.get(columnaFinal.size()-1);
	}
	public static int mejorTulaListas(List<Integer> columnaFinal, List<Articulo> arti, int w)
	{
		int[][] artMatriz = new int[arti.size()][w];
		int i = 1,x = columnaFinal.size();
		do 
		{
			if(columnaFinal.get(x) < columnaFinal.get(x-arti.get(i).getPeso()))
			{
				columnaFinal.set(x, columnaFinal.get(x-arti.get(i).getPeso())+columnaFinal.get(i));
				artMatriz[i][x] = 1;
			}
			if(x > arti.get(i).getPeso())
			{
				x = x-1;
			}
			else
			{
				i = i+1;
				x = columnaFinal.size();
			}
		}while(i <= arti.size()+1);
		return columnaFinal.get(columnaFinal.size()-1);
	}
}
