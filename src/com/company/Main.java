package com.company;

public class Main {

    public static void main(String[] args) {
            double [] shrek = {-3.3,48.4,-9.5,71.1,-26.5,20,-49.9,3};
            double sum = 0;
            int counter = 0;
            boolean isFacedNegative = false;
            double avarageSum;

            for (double s:shrek) {
                if (s < 0){
                    isFacedNegative = true;
                } else if (s > 0 && isFacedNegative){
                    counter++;
                    sum += s;

                }
            }
            avarageSum = sum / counter;
            System.out.println(avarageSum);
        }
    }



