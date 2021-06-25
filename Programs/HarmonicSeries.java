package com.bridgelabz.Programs;

import com.bridgelabz.utility.Utility;

public class HarmonicSeries {
    public static class HarmonicNumber {

        public static void main(String[] args) {
            Utility utility = new Utility();
            System.out.print("Enter the number to check Harmonic number : ");
            int Number = utility.getIntValue();
            utility.getHarmonicNumber(Number);
        }

    }
}
