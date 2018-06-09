package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        double[][] array = new double[5][5];

        InitLogic.init(array ,-10, 10);

        double min = Array.getMin(array);
        System.out.println("Min = " + min);


        double max = Array.getMax(array);
        System.out.println("Max = " + max);

        double arithmetical = Array.getArithmetical(array);
        System.out.println("Arithmetical = " + arithmetical);

        double geometrical = Array.getGeometrical(array);
        System.out.println("Geometrical = " + geometrical);

        int[] localMin = Array.getLocalMin(array);
        System.out.println("Local min:  x = " + localMin[0] + " y = " + localMin[1]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println();

        Array.getTransponationSquare(array);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println();

//        double[][] arra = Array.getTransponationNonSquare(array);
//
//        System.out.println();
//
//        for (int i = 0; i < arra.length; i++) {
//            for (int j = 0 ; j < arra[i].length; j++) {
//                System.out.print(arra[i][j] + "\t");
//            }
//            System.out.println();
//
//        }


    }

}
