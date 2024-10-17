package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMany = sc.nextInt();

        ProcessBuilder pb = new ProcessBuilder();
        pb.command("java", "-cp","./target/classes", "org/example/SquareSum");

        List<Double> numList = new ArrayList<>();
        for (int i = 0; i < numMany; i++) {
            numList.add(sc.nextDouble());
        }
        SumSquare sumSquare = new SumSquare();
        System.out.println(sumSquare.Sum(numList));

        SquareSum squareSum = new SquareSum();
        System.out.println(squareSum.Sum(squareSum.Square(numList)));



    }
}