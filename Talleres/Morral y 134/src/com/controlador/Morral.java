package com.controlador;

import java.util.List;

public class Morral 
{
	public static int mejorTula(List<Articulo> Arti, int w)
	{
		int cache[][] = new int [Arti.size()+1][w+1];
		for(int i = 1 ; i<Arti.size() ; i++)
		{
			for(int j = 1 ; j < w ; j++)
			{
				if(Arti.get(i).getPeso() > j)
				{
					cache[i][j] = cache[i-1][j];
				}
				else
				{
					if(cache[i-1][j] >= Arti.get(i).getPrecio() + cache[i-1][j-Arti.get(i).getPeso()])
						cache[i][j] = cache[i-1][j];
					else
						cache[i][j] = Arti.get(i).getPrecio() + cache[i-1][j-Arti.get(i).getPeso()];
				}
			}
		}
		return cache[Arti.size()][w];
	}
}
