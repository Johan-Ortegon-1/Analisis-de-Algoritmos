package com.controlador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjerciciosBoh
{
	public static boolean posibleDividirArreglo(ArrayList<Integer> arreglo)
	{
		boolean retorno = false;
		ArrayList<Integer> cache = new ArrayList<Integer>();
		int tam = 0; 
		Collections.sort(arreglo, Collections.reverseOrder());
		System.out.println("Entrada ordenada:\n" + arreglo); 
		tam = arreglo.size();
		cache.add(arreglo.get(0));
		
		for(int i = 1;i < tam;i++)
		{
			if(cache.get(i-1) > 0)
			{
				cache.add(cache.get(i-1) - arreglo.get(i));
			} 
			else
			{
				cache.add(cache.get(i-1) + arreglo.get(i));
			}
		}
		System.out.println("El cache es: " + cache);
		if(cache.get(tam-1) == 0)
		{
			System.out.println("Se puede dividir el arrglo");
			retorno = true;
		}
		return retorno;
	}
}
