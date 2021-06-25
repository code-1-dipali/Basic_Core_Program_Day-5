package com.bridgelabz.Programs;

import com.bridgelabz.utility.Utility;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.print("Enter the Devident: ");
        int Devident = utility.getIntValue();
        System.out.print("Enter the Devisor : ");
        int Devisor = utility.getIntValue();
        utility.getQuotientRemainder(Devisor, Devident);

    }

}

