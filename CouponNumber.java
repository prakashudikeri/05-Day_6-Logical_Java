package com.bridgelabz.logicaljavaprograms;
import java.util.Random;

public class CouponNumber {
    public String createRandomCode(int codeLength) {
        char[] chars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String s = "";
        Random random = new Random();
        for (int i = 0; i < codeLength; i++)
        {
            char c = chars[random.nextInt(chars.length)];
            s=s+c;
        }
        return s ;
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to Program for Generating 10 Unique Coupon Code");
        CouponNumber cn = new CouponNumber();
        for(int i=1;i<=10;i++) {
            String couponCode = cn.createRandomCode(6);   //Passing value 6 as Length of Coupon Code
            System.out.println("CODE="+couponCode);
        }
    }
}