package com.bridgelabz.Programs;

import com.bridgelabz.utility.Utility;

public class LargestAmongThree {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.print("Enter the number num1 : ");
        int num1 = utility.getIntValue();
        System.out.print("Enter the number num2 : ");
        int num2 = utility.getIntValue();
        System.out.print("Enter the number num3 : ");
        int num3 = utility.getIntValue();
        utility.getLargestNumber(num1, num2, num3);



    }
    // method to get quetient and remainder
    public void getQuotientRemainder(int Divisor, int Dividend ) {
        int Quotient, Remainder;
        Remainder = Dividend % Divisor;
        Quotient = Dividend / Divisor;
        System.out.println("Remainder = " +Remainder+ " Quotient = " +Quotient);

    }

}

