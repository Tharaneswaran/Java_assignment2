package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg7 {

	public static void main(String[] args) throws IOException
	{
		 BufferedReader reader = new BufferedReader(
		 new InputStreamReader(System.in));
		 

        int i, j, flag,lower,upper;

        System.out.printf("Enter lower bound of the interval: ");
        String a = reader.readLine();
		 if (a.chars().allMatch(Character::isDigit))
		 {
		 		lower = Integer.parseInt(a);
			}
	     else {
			 System.out.println("Invalid Input only enter a number: ");
			 return;
		 }
 
        // Ask user to enter upper value of interval
        System.out.printf("\nEnter upper bound of the interval: ");
        String b = reader.readLine();
		 if (b.chars().allMatch(Character::isDigit))
		 {
		 		upper = Integer.parseInt(b);
			}
	     else {
			 System.out.println("Invalid Input only enter a number: ");
			 return;
		 }

        System.out.printf("\nPrime numbers between %d and %d are: ", lower, upper);

        for (i = lower; i <= upper; i++) {
 

            if (i == 1 || i == 0)
                continue;
 

            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }

	}

