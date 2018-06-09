package com.company;

public class InitLogic {

    public static void init(double[][] array, double min, double max){

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++){
            array[i][j] = Math.random() * (max - min) + min;
        }
    }
}
