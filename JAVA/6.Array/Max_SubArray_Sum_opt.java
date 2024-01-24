import java.util.*;

public class Max_SubArray_Sum_opt {

    public static void prefix_Sum(int number[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        
        prefix[0] = number[0];
        // System.out.print(prefix[0]);

        for(int i=1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + number[i];
            // System.out.print(" " + prefix[i]);
        }

        //finding max sum of an array
        for(int i=0 ; i<prefix.length ; i++){
            int start = i ;

            for(int j = i ; j<prefix.length ; j++){
                int end = j ;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                        maxSum = currSum ;
                }
                
            }
        }
        System.out.print("Max Sum Is : " + maxSum);

    }

    public static void main(String args[]){

        int number[] = {1,-2,6,-1,3};
        prefix_Sum(number);

    }
    
}
