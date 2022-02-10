package com.bridgelabz.logicaljavaprograms;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args)
    {
        long start = 0, stop = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. Start StopWatch \n2. Stop StopWatch \n3. Exit");
            System.out.println("Enter your Choice :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                start = System.nanoTime();
                    System.out.println("Start Time :" + start);
                break;
            case 2:
                stop = System.nanoTime();
                long sec = ((stop - start) / 1000000000);
                    System.out.println("edn Time :" + stop);
                int min = (int) sec / 60;
                int hr = min / 60;
                    System.out.println("Elapsed Time is " + hr + ":" + min + ":" + sec);
                break;
            }
        if(choice >= 3) {
            System.out.println("Closing the Stopwatch.");
        break;
            }
        }
    }
}