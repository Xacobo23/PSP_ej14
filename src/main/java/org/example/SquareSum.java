package org.example;

import java.util.ArrayList;
import java.util.List;

public class SquareSum {

    private double sum = 0;
    private List<Double> listSquares = new ArrayList<>();

    public List<Double> Square(List<Double> numList){
        for (double num : numList){
            listSquares.add(Math.pow(num,2));
        }
        return listSquares;
    }

    public double Sum(List<Double> numList){
        for (double num : numList ){
            sum = sum + num;
        }

        return sum;
    }

}






//Create a program in Java that reads from the standard input a number and after it reads the quantity of
//numbers indicated above.  The program must add up all the numbers and calculate the square of the sum and display
//the result on the standard output.
//
//Create another program in Java that reads from the standard input a number and after it reads the quantity
//of numbers indicated above.  The program must square all of the numbers and then calculate their sum and
//display the result on the standard output.
//
//        Finally, create another program that launches the two programs created earlier using the same
//numbers and display the result on the standard output. Use getInputStream and getOutputStream to communicate with the processes.