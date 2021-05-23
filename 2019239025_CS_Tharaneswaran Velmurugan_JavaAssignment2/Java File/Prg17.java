package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg17 {

	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int m, n, c, d;
	    
		System.out.println("Enter the number of rows for matrix:");
	    m=Integer.parseInt(x.readLine());
	    System.out.println("Enter the number of columns for matrix:");
	    n=Integer.parseInt(x.readLine());

	    int M[][] = new int[m][n];
	    int Rotated[][] = new int[n][m];

	    System.out.println("\nEnter the elements the matrix:\n");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        M[c][d] = Integer.parseInt(x.readLine());
	    }
	    System.out.println(" \n The elements of matrix Before Rotation is:\n");
	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        System.out.print(M[c][d] + "\t");
	  
	      System.out.println();
	    }
	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	    	  Rotated[d][m-c-1] = M[c][d];
	    }
	    System.out.println("\n The elements of matrix After Rotation is:\n");
	    for (c = 0; c < n; c++)
	    {
	      for (d = 0; d < m; d++)
	        System.out.print(Rotated[c][d] + "\t");
	  
	      System.out.println();
	    }
	}

}