package com.bridgelabz.Programs;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.print("Enter the number to check primefactors : ");
        int Number = utility.getIntValue();
        utility.getPrimeFactor(Number);
    }

}

