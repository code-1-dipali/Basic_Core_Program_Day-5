package com.bridgelabz.Programs;

import java.util.Scanner;

public class FlipCoin {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin");
        int numberOfFlip = sc.nextInt();
        System.out.println(numberOfFlip);
        int heads = 0,tails = 0;
        for(int i = 0; i < numberOfFlip; i++) {
            double side = Math.random();
            if(side>0.5){
                heads++;
            }else{
                tails++;
            }

        }
        System.out.println("Headcount::" +heads);
        System.out.println("Tailcount::" +(numberOfFlip-heads));
        double headpercent = ((heads * 100)/numberOfFlip);
        double tailspercent = ((tails * 100)/numberOfFlip);
        System.out.println("Head Percentage::" + headpercent + "%");
        System.out.println("tails Percentage::" + tailspercent + "%");
    }
}
