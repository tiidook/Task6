package com.company;

public class Array {

    public static final int DEFAULTVALUE = -1;

    public static double getMin(double[][] arr){
        double min = arr[0][0];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++){

            if (arr[i][j] < min){
                min = arr[i][j];
            }
        }
        return min;
    }

    public static double getMax(double[][] arr){
        double max = arr[0][0];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++){

                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        return max;
    }

    public static double getArithmetical(double[][] array){
        double arithmetical = 0;

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++){

                arithmetical += array[i][j] / array.length / array[i].length;
            }
        return arithmetical;
    }

    public static double getGeometrical(double[][] array){
        double geometrical = 1;//if geometrical exist it's always > 0

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++){

                if (array[i][j] > 0) {
                    geometrical *= Math.pow(array[i][j], 1. / array.length / array[i].length);
                }
                else{
                    return -1;
                }
            }
        return geometrical;
    }


    public static int[] getLocalMin(double[][] arr){

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++){

                if(checkLocal(arr, i ,j)){
                    return new int[]{i,j};
            }
        }
            return new int[]{DEFAULTVALUE,DEFAULTVALUE};
    }


    public static boolean checkLocal(double[][] array ,int i,int j){
        int length = array.length;
        int hight = array[0].length;

        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, length - 1); ++x)
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, hight - 1); ++y){

                if (x != i || y != j){

                    if (array[i][j] > array[x][y]){
                        return false;
                    }
                }
            }

            return true;
    }


    public static void getTransponationSquare(double[][] array) throws Exception{

        if(checkSquare(array)) {

            for (int i = 0; i < array.length; i++)
                for (int j = i + 1; j < array[i].length; j++) {

                    array[i][j] = array[i][j] + array[j][i];
                    array[j][i] = array[i][j] - array[j][i];
                    array[i][j] = array[i][j] - array[j][i];
                }
        } else {
            throw new Exception("This method transpose only square matrix!!!");
        }
    }


    public static double[][] getTransponationNonSquare(double[][] array) throws Exception{

        double[][] transponedArr = new double[array[0].length][array.length];

        if (!checkSquare(array)) {

            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array[0].length; j++) {

                    transponedArr[j][i] = array[i][j];
                }
        } else {
            throw new Exception("Only non-square matrix!!!");
        }
            return transponedArr;
    }


    public static boolean checkSquare(double[][] array){

        return array.length == array[0].length ? true:false;
    }
}
