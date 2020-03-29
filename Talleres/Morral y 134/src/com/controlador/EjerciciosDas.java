package com.controlador;

public class EjerciciosDas
{
	static void lcs(String S1, String S2, int m, int n) {
	    int[][] LCS_table = new int[m + 1][n + 1];

	    for (int i = 0; i <= m; i++) {
	      for (int j = 0; j <= n; j++) {
	        if (i == 0 || j == 0)
	          LCS_table[i][j] = 0;
	        else if (S1.charAt(i - 1) == S2.charAt(j - 1))
	          LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
	        else
	          LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
	      }
	    }
	}
}
