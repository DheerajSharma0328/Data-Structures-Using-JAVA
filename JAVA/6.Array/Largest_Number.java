/*
1. Is code me humne ek array ke ander smallest and largest element find kara hai

2.Largest number find karne ke liye yaha pe humne -infinity use kara hai java ka util package hume ye advantage deta hai.
  -infinity use karne ke liye hume  Integer.MIN_VALUE use kari hai is function ki help se hum java me negative me jo sab se chota number deta hai usse hum
   compare kate hai

3.Smallest number find karne ke liye yaha pe humne +infinity use kara hai java ka util package hume ye advantage deta hai.
  +infinity use karne ke liye hume Integer.MAX_VALUE use kari hai is function ki help se hum java me positive me jo sab se bada number hota hai usse hum 
  compare kate hai

4.  +Infinity = Integer.MAX_VALUE
    -Infinity = Intrger.MIN_VALUE
*/

import java.util.*;

public class Largest_Number {

    public static int largest(int number[]){

       int max = Integer.MIN_VALUE;

       for(int i = 0; i<number.length; i++){

        if(max < number[i]){

            max = number[i];
        }
       }
       return max;
    }

    public static int smallest(int number[]){

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<number.length; i++){

            if(min > number[i]){
               
                min = number[i];
            }
        }
        return min;
    }   
    
    
    public static void main(String args[]){

        int number[] = {1050,25,35,47,58,659,76,83,29,1};
        largest(number);
        smallest(number);

                System.out.println("Smallest Number In Array Is: "+largest(number));
                System.out.println("Largest Number In Array Is: "+smallest(number));
    }
    
}
