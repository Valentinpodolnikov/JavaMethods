package com.company;

public class Main2 {

    public static void IncArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;

        }
    }

    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] CreateArr(){
        return new int[]{3, 5, 6};
    }
    public static void PrintEnter(){
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = CreateArr();


        PrintArr(arr);
        IncArr(arr);

        PrintEnter();

        PrintArr(arr);


    }
}
