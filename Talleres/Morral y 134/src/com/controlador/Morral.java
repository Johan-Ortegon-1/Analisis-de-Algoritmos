package com.controlador;

import java.util.List;

public class Morral 
{
	public static int mejorTula(List<Articulo> Arti, int w)
	{
		int cache[][] = new int [Arti.size()+1][w+1];
		for(int i = 1 ; i<Arti.size()+1 ; i++)
		{
			for(int j = 1 ; j <= w ; j++)
			{
				if(Arti.get(i-1).getPeso() > j)
				{
					cache[i][j] = cache[i-1][j];
				}
				else
				{
					if(cache[i-1][j] >= (Arti.get(i-1).getPrecio() + cache[i-1][j-Arti.get(i-1).getPeso()]))
					{
						cache[i][j] = cache[i-1][j];
					}
					else 
					{
						cache[i][j] = Arti.get(i-1).getPrecio() + cache[i-1][j-Arti.get(i-1).getPeso()];
					}
				}
			}
			impresionMatriz(cache);
		}
		return cache[Arti.size()][w];
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
	public static void mejorTulaRecursiva()
	{
		
	}
}
