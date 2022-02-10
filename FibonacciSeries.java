package com.bridgelabz.logicaljavaprograms;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0, b=1, c=0;
		Scanner sc = new Scanner (System.in);
			System.out.println("Enter the Level Number for Fibonacci Series :");
        int level = sc.nextByte();
        	System.out.println(a +"\n"+ b);
        for(int i=1; i <= level; i++) {
        	c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}