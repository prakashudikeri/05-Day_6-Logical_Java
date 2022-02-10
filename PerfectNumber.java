package com.bridgelabz.logicaljavaprograms;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Any Number :");
        n = sc.nextInt();
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            System.out.println(i+" is Divisor and Sum : "+sum);
            }
        }
        if(sum == n) {
            System.out.println(n+" is Perfect Number");
        } else {
            System.out.println(n+" is Not Perfect Number");
        }
    }
}