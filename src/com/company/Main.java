package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double[][] a = new double[3][5];
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
        }

    }
}
