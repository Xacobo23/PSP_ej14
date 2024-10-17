package org.example;

import java.util.List;

public class SumSquare {

    private double sum = 0;

    public double Sum(List<Double> numList){
        for (double num : numList ){
            sum = sum + num;
        }

        return Math.pow(sum,2);
    }


}
