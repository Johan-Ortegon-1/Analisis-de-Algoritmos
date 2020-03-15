package com.controlador;

import java.util.List;
import java.util.ArrayList;;

public class E134 
{
	public static int descomposicion134(int n)
	{
		List<Integer> cache = new ArrayList<Integer>();
		cache.add(1);
		cache.add(1);
		cache.add(2);
		cache.add(3);
		for (int i = 4; i < n; i++)
		{
			cache.add(cache.get(i-1)+cache.get(i-3)+cache.get(i-4));
			//System.out.println("Cache en " + i + " > " + cache.get(i));
		}
		return cache.get(n-1);
	}
}
