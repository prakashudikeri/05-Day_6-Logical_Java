package com.bridgelabz.logicaljavaprograms;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Any Number :");
        n = sc.nextInt();
        while( n > 0 ) {
            int r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }
}
