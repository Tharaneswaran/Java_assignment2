package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg16 {

	static int GetUserInputInt(String x)throws IOException
	{
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));
		int b;
	    System.out.println(x);
	    String n = reader.readLine();
	    if (n.chars().allMatch(Character::isDigit))
	    	{
	          b = Integer.parseInt(n);
	    	}
	    else
	        {

	    	   System.out.println("Invalid input.  Please enter a valid number");
	    	   return 0;
	 	    }

	    return b;
	}
	static Double GetUserInputDouble(String x)throws IOException
	{
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));
		double p;
		String n;
	    System.out.println(x);
	    n= reader.readLine();
	    if(n.matches("-?\\d+(\\.\\d+)?"))
	    	{
	           p = Double.parseDouble(n);
	    	}
	    else
	        {

	    	   System.out.println("Invalid input.  Please enter a valid number");
	    	   return (double)0;
	 	 	}

	    return p;
	}


	static  void PrintResult(double X1[][], double X2[][], double X3[][])
	{
		int R1 = X1.length,C1 = X1[0].length;
		double Temp[][] = new double [R1][C1];
		System.out.println("First matrix \n");
		for(int n = 1; n<=3 ;n++)
		{
	      if( n == 1)
	      {
			  Temp = X1;
			  R1 = X1.length;
			  C1 = X1[0].length;
	      }
	      else if ( n == 2)
	       {
			   System.out.println("\nSecond matrix \n");
			   R1 = X2.length;
			   C1 = X2[0].length;
			   Temp =  X2;

		   }
	      else if ( n == 3)
	       {
			   System.out.println("\nResultant matrix \n");
			   R1 = X3.length;
			   C1 = X3[0].length;
			   Temp = X3;

		   }

		 for(int i=0;i<R1;i++)
		 {
			for(int j=0;j<C1;j++)
			{
				System.out.print(Temp[i][j]+"\t");
			}
				System.out.print("\n");
	     }

	    }
	 }

	 public static void main(String[] args)throws IOException
		{

		int R1 = 0  ,C1 = 0 ;
		double M1[][];
		double M3[][];
		System.out.println("Matrix Transpose");
		
		R1= GetUserInputInt("Enter the Number of rows for Matrix A:");
		C1= GetUserInputInt("Enter the Number of column for Matrix A:");
		M1= new double[R1][C1];
		M3= new double[R1][C1];

			for(int i=0;i<R1;i++)
			{
				for(int j=0;j<C1;j++)
				{
					M1[i][j]= GetUserInputDouble("Enter the elements of the First Matrix M1["+i+"]"+"["+j+"] :" );
				}
			}
			for(int i=0;i<R1;i++)
			{
				for(int j=0;j<C1;j++)
				{
					M3[i][j]=M1[j][i];
				}
			}
         System.out.println("Given Matrix \n");
			 for(int i=0;i<R1;i++)
			{
				for(int j=0;j<C1;j++)
				{
					System.out.print(M1[i][j]+"\t");
				}
				System.out.print("\n");
			}
         System.out.println("Transpose of Matrix the Given Matrix is \n");
			 for(int i=0;i<R1;i++)
			{
				for(int j=0;j<C1;j++)
				{
					System.out.print(M3[i][j]+"\t");
				}
				System.out.print("\n");
			}

		 return;
		}


}
