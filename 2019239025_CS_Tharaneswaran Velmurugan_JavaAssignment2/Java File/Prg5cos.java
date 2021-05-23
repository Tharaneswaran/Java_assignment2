package com.anna.msc;

public class Prg5cos {

	public static void main(String[] args) {
		 int  i = 0,j=0;
		 double sum=1;
		 float fact=1;
	     double a=0;
		 double CosVal;

	   	 int m=2;
		 	 //a = n * (float)(3.142 / 180.0);
		 double accuracy = 0.00001;

	       //for(i=2; i <= n ;i++)
	       i=2;
	       for(int r=0;r<=360;r=r+15)
	       {
			  a =  r * (double)(3.142 / 180.0);
			  //Math.toRadians(r);
	          CosVal=Math.cos(a);
	          sum=1;
	          m=2;
	       do
		   {
			   //System.out.println(m);
	  	    for(j=m; j>0; j--)

			   {
				 fact = fact*j;
				 }

			   if(i%2==0)
				{
					sum = sum - Math.pow(a,m)/fact;

			    }
			   else
			   {
				 sum = sum + Math.pow(a,m)/fact;

			   }
	           fact=1;
	           m=m+2;
	           i++;
	       } while(accuracy <= CosVal - sum);//
	         System.out.println("cos("+r+")"+sum+ " Value by using series");
	         System.out.println("cos("+r+")"+CosVal+" Value from math function");



		}

	}

}
