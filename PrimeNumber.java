package com.bridgelabz.logicaljavaprograms;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
    	int n, temp=1;
        Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Any Number :");
        n = sc.nextInt();
        if(n != 1) {
            for(int i = 2; i <= n-1; i++) {
                if(n % i == 0) {
                    temp = 0; break;
                }
            }
        }
        if(temp == 1) {
            System.out.println(n+" is Prime Number");
        } 
        else {
            System.out.println(n+" is Not Prime Number");
        }
    }
}