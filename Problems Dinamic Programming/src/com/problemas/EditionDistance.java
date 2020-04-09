package com.problemas;
/*https://www.youtube.com/watch?v=bJB9YEiLwKQ
 * We have two string and we want to calculate the minimum edition of distance
 * The rules to calculate the distance are: 
 * 	1. If the characters are the same: +0
 *  2. If the characters are different: +1
 *  3. If one of those does not exists: +1
   -> Formalization f the problem:  >50%

	Function (Parameters y and return):
	minDistance(A : String, B : String): int
	A(Row)
	B(Column)
	Cache:
	C[i,j] (What we have in each position): The minimum distance of edition between A[0...i] and B[0...j]
	C[N,M] (The position where the final answer is): What we want
	Where N is the size of the string A and M is the size of the string B
	Recursion: 
	
	Basic cases:
	C[0,j] = j
	C[i,0] = i
	Recursive call:  
	If the position in B out of the bounds of A => C[i,j] = C[i-1,j]+1
	If the position in A out of the bounds of B => C[i,j] = C[i,j-1]+1
	If A[i] != B[j] => C[i,j] = C[i-1,j-1] + 1
	-> Análisis del algoritmo:
	
	Spatial Analysis:
	We have to use a cache with two dimension, so the complex belongs to> O(n*m)
	Temporal Analysis:
	We have to fit the cache of two dimension, so there will be one cycle within other, for that reason the complex is> O(n*m) 
	Size of the input: n,m 
	n is: the size of the fist string
	m is: the size of the second string 
	Basic operation: Comparison 
	Value of the basic operation: 1 
	
	-> Preguntas conceptuales 15 35%
*/
public class EditionDistance
{
	private static int minimum(int a, int b, int c)
	{
		return Math.min(a, Math.min(b, c));
	}
	public static int minDistance(String A, String B)
	{
		int tamA = A.length(), tamB = B.length(), aux;
		int[][] cache = new int [tamB+1][tamA+1];
		
		for (int i = 0; i <= tamB; i++)
		{
			cache[i][0] = i;
		}
		for (int j = 0; j <= tamA; j++)
		{
			cache[0][j] = j;
		}
		for (int i = 1; i <= tamB; i++)
		{
			for (int j = 1; j <= tamA; j++)
			{
				if(A.charAt(j-1) != B.charAt(i-1))
					aux = 1;
				else
					aux = 0;
				cache[i][j] = minimum(cache[i-1][j]+1,cache[i][j-1]+1,cache[i-1][j-1]+aux);
			}
		}
		System.out.println("Result of edit distance: " + cache[tamB][tamA]);
		System.out.println("With a matrix of:");
		for (int i = 0; i <= tamB; i++)
		{
			for (int j = 0; j <= tamA; j++)
			{
				System.out.print(cache[i][j] + " ");
			}
			System.out.println();
		}
		return cache[tamB][tamA];
	}
	
}








