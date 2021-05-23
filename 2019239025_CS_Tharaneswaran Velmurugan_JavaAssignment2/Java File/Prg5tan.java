package com.anna.msc;

public class Prg5tan {

	static int fac(int num)
	{
	    if (num == 0)
	        return 1;

	    // To store factorial of a number
	    int fact = 1;
	    for (int i = 1; i <= num; i++)
	        fact = fact * i;
	    return fact;
	}


	static void Tanx( int x)
	{

	    double sum = 0;
	    double accuracy = 0.00001;
	    double TanVal= Math.tan(x *(double)(3.142 / 180.0));
	    int i = 1;
	    do {

	        double B = 0;
	        int Bn = 2 * i;
	        for (int k = 0; k <= Bn; k++)
	        {
	            double temp = 0;
	            for (int r = 0; r <= k; r++)
	                temp = temp + Math.pow(-1, r) * fac(k) *
	                              Math.pow(r, Bn) / (fac(r) *
	                                                 fac(k - r));

	            B = B + temp / ((double)(k + 1));
	        }
	        sum = sum + Math.pow(-4, i) *
	               (1 - Math.pow(4, i)) * B *
	                    Math.pow(x, 2 * i - 1) / fac(2 * i);
	    } while(accuracy <= TanVal - sum);


	    System.out.println("tan("+x+")"+sum+"\n");
	    System.out.println("tan("+x+")"+Math.tan( x *(double)(3.142 / 180.0))+"\n");
	}

	public static void main(String[] args)
	{

	    for(int r=0;r<=360;r=r+15)
	    {
	      Tanx(r);
	   }
	}

}
