package com.controlador;

import java.util.List;
import java.util.ArrayList;;

public class E134 
{
	public static int forma134(int n)
	{
		List<Integer> cache = new ArrayList<Integer>();
		cache.add(1);
		cache.add(1);
		cache.add(2);
		cache.add(3);
		for (int i = 4; i < n; i++)
		{
			cache.add(cache.get(i-1)+cache.get(i-3)+cache.get(i-4));
		}
		return cache.get(n-1);
	}
	public static int forma134recursion(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		if(n==3)
			return 2;
		if(n==4)
			return 3;
		return forma134recursion(n-1)+forma134recursion(n-3)+forma134recursion(n-4);
	}
	
}
