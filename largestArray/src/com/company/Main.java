package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, -1, 5, -4};

        System.out.println("Largest sum: " + largestSum(arr));




    }

    public static int largestSum(int[] arr){
        int largestSoFar = arr[0];
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int[] check = new int[j - i + 1];
                // insert values...
                for (int k = 0; k < check.length; k++){
                    check[k] = arr[j-k];
                }
                int sum = sum(check);
                if (sum > largestSoFar){
                    largestSoFar = sum;
                }
            }
            System.out.println();
        }
        return largestSoFar;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
            sum += arr[i];
        }
        System.out.println();
        return sum;
    }

}
