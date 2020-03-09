package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         int[] arr= new int[10];

         for (int i=0;i<arr.length;i++){
             arr[i] = i;
         }

         int[] scores = new int[]{100,99,98};
         for (int i=0;i<scores.length;i++){
             System.out.println(scores[i]);
         }

         for(int source:scores){
             System.out.println(source);
         }

         scores[0] = 90;

        for(int source:scores){
            System.out.println(source);
        }

    }
}
