package com.anna.msc;


import java.io.IOException;


public class Prg5 {

	public static void main(String[] args) throws IOException
	{

		 
		 int i=0;
		 double radian;
		 for (i = 0;i<=360;i=i+15)
		  {
			 radian= i* (3.142/180.0);
			 System.out.println("\nsin("+i+")\t "+Math.sin(radian)+"\ncos("+i+")\t"+Math.cos(radian)+"\ntan("+i+")\t"+Math.tan(radian));
	      }

	}

}
