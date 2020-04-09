package com.problemas;

import java.util.ArrayList;
import java.util.List;

/*https://www.youtube.com/watch?v=bJB9YEiLwKQ
 * We have a Bar of some value material with a longitude "n"
 * The objective is cut the Bar in the best way to get money
   The values are theses: 1 mm = 1$, 2 mm = 5$, 3 mm = 8$ 
   What is the maximum possible gain?
   -> Formalization f the problem:  >50%

	Function (Parameters y and return):
	maxGainBar(bar : int): int
	Cache:
	C[i] (What we have in each position): The maximum gain considering a longitude of "0...i" 
	C[N] (The position where the final answer is): What we want
	
	Recursion: 
	
	Basic cases:
	bar.lenght = 0 -> C[0] = 0
	bar.lenght = 1 -> C[1] = 1
	bar.lenght = 2 -> C[2] = 5
	bar.lenght = 3 -> C[3] = 8
	Recursive call: 
	C[i] = max(C[i-1] + C[1], C[i-2] + C[2], C[i-3] + C[3])
	
	-> Análisis del algoritmo:
	
	Spatial Analysis:
	We have to use a cache with one dimension, so the complex belongs to> O(n)
	Temporal Analysis:
	We have to fit the cache of one dimension, so there will be one cycle, for that reason the complex is> O(n) 
	Size of the input: n 
	n is: the size of the bar 
	Basic operation: Sum 
	Value of the basic operation: 1 
	
	-> Preguntas conceptuales 15 35%
*/

public class BarProblem
{
	public static int maxGainBar(int bar)
	{
		List<Integer> cache = new ArrayList<Integer>();
		int broke1 = 0, broke2 = 0, broke3 = 0, tam = 0;
		cache.add(0);
		cache.add(1);
		cache.add(5);
		cache.add(8);
		for (int i = 4; i <= bar; i++)
		{
			broke1 = cache.get(i - 1) + cache.get(1);
			broke2 = cache.get(i - 2) + cache.get(2);
			broke3 = cache.get(i - 3) + cache.get(3);
			System.out.println("b1> " + broke1);
			System.out.println("b2> " + broke2);
			System.out.println("b3> " + broke3);
			if (broke1 >= broke2 && broke1 >= broke3)
			{
				cache.add(broke1);
			}
			else if (broke2 >= broke1 && broke2 >= broke3)
			{
				cache.add(broke2);
			}
			else if (broke3 >= broke2 && broke3 >= broke1)
			{
				cache.add(broke3);
			}
		}
		tam = cache.size();
		System.out.println("The maximum gain with those conditions is> " + (cache.get(tam-1)));
		return cache.get(cache.size()-1);
	}
	public static auxBar maxGainBarV2(int bar)
	{
		List<auxBar> cache = new ArrayList<auxBar>();
		int broke1 = 0, broke2 = 0, broke3 = 0, tam = 0;
		int aux1,aux2,aux3;
		auxBar auxBar0 = new auxBar(0,0,0,0);
		auxBar auxBar1 = new auxBar(1,0,0,1);
		auxBar auxBar2 = new auxBar(0,1,0,5);
		auxBar auxBar3 = new auxBar(0,0,1,8);
		
		cache.add(auxBar0);
		cache.add(auxBar1);
		cache.add(auxBar2);
		cache.add(auxBar3);
		
		for (int i = 4; i <= bar; i++)
		{
			broke1 = cache.get(i - 1).getTotalGain() + cache.get(1).getTotalGain();
			broke2 = cache.get(i - 2).getTotalGain() + cache.get(2).getTotalGain();
			broke3 = cache.get(i - 3).getTotalGain() + cache.get(3).getTotalGain();
			System.out.println("b1> " + broke1);
			System.out.println("b2> " + broke2);
			System.out.println("b3> " + broke3);
			if (broke1 >= broke2 && broke1 >= broke3)
			{
				aux1 = cache.get(i - 1).getOneMm()+1;
				aux2 = cache.get(i - 1).getTwoMm();
				aux3 = cache.get(i - 1).getThreeMm();
				auxBar auxBarN = new auxBar(aux1,aux2,aux3,broke1);
				cache.add(auxBarN);
			}
			else if (broke2 >= broke1 && broke2 >= broke3)
			{
				aux1 = cache.get(i - 2).getOneMm();
				aux2 = cache.get(i - 2).getTwoMm()+1;
				aux3 = cache.get(i - 2).getThreeMm();
				auxBar auxBarN = new auxBar(aux1,aux2,aux3,broke2);
				cache.add(auxBarN);
			}
			else if (broke3 >= broke2 && broke3 >= broke1)
			{
				aux1 = cache.get(i - 3).getOneMm();
				aux2 = cache.get(i - 3).getTwoMm();
				aux3 = cache.get(i - 3).getThreeMm()+1;
				auxBar auxBarN = new auxBar(aux1,aux2,aux3,broke3);
				cache.add(auxBarN);
			}
		}
		tam = cache.size();
		System.out.println("The complete answer is> " + (cache.get(tam-1).toString()));
		return cache.get(cache.size()-1);
	}
}
