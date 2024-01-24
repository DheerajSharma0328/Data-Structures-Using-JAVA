import java.util.*;

public class Pair_In_Array {


public static void pair(int group[]){

    int tp = 0;
    
    for(int i = 0; i<group.length-1; i++ ){
        
        int curr = group[i];

        for(int j = i+1; j<group.length ; j++){

            System.out.print("(" + curr + "," + group[j] + ")" + " ");
            
            tp++;
        }

        System.out.println(" ");

    }
    System.out.println("Total Pair In Array Are : " + tp); //Formual OF Finding Total Pair In Array  tp = n(n-1)/2  here n is total number of element in array

}

public static void main(String args[]){

    int group[] = {2,4,6,8,10};

    pair(group);
}

}
