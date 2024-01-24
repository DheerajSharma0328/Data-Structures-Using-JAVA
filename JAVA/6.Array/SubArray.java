import java.util.*;


public class SubArray {

public static void subarray(int subarr[]){

    int totalsubarrr = 0;

    for(int i = 0; i < subarr.length; i++){

        int start = i;

        for(int j = i ; j < subarr.length; j++){

            int end = j;

            for(int k = start; k <= end; k++){

                System.out.print(subarr[k] + " ");
            }
            totalsubarrr++;
            System.out.println(" ");
        }
        System.out.println(" ");

        
    }

    System.out.print("Total SubArray Are :" + totalsubarrr);
}

public static void main(String args[]){

    int subarr[] = {2,4,6,8,10};

    subarray(subarr);
}
    
}
