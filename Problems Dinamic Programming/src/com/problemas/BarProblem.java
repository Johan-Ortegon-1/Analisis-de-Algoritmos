package com.problemas;

/*https://www.youtube.com/watch?v=bJB9YEiLwKQ
 * We have a Bar of some value material with a longitude "n"
 * The objective is cut the Bar in the best way to get money
   The values are theses: 1 mm = 1$, 2 mm = 5$, 3 mm = 8$ 
   How many pieces we have to get from the bar to maximize the gain?
   -> Formalizacion del problema:  >50%

	Function (Parameters y and return):
	maxGainBar(A : Seq [auxBar]): auxBar
	auxBar → Structure that contains the values of how many pieces of (1,..,4)mm we have to make to maximize the gain
	Cache:
	C[i] (What we have in each position): The auxiliary structure that who contains the better combination of pieces to
	maximize the gain with i size
	C[N] (The position where the final answer is): What we want
	
	Recursion: 
	
	Basic cases:
	A.lenght = 0 -> C[0] = 0,0,0 
	A.lenght = 1 -> C[i] = 1,0,0
	A.lenght = 2 -> C[i] = 0,1,0
	A.lenght = 3 -> C[i] = 0,0,1
	Recursive call: 
	If 
	C[i] = max(C[i-1],
	
	-> Análisis del algoritmo:
	
	Analisis espacial:
	
	Analisis temporal:
	
	Tamano de la entrada: 
	Sea n:
	Operacion basica: 
	Valor de la operación básica: 
	
	-> Preguntas conceptuales 15 35%
*/

public class BarProblem
{
	
}
