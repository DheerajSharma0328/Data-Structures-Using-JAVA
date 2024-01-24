import java.util.*;

public class Max_SubArray_Sum{

public static void max_array_sum(int number[]){

    int sum = 0;
    int max = Integer.MIN_VALUE;


    for(int i = 0 ; i < number.length ; i++){
        int start = i ;

        for(int j =i ; j < number.length ; j++){
                int end = j ;

                for(int k = start ; k <= end ; k++ ){
                    
                    System.out.print(" "+number[k]);

                    sum = sum + number[k];                   
                }
                System.out.println();

                if(max < sum){

                    max = sum;
                }
                 
                sum = 0 ;
        }

    }

    System.out.println("Max Sum Of A Array Element Are:"+max);

}


public static void main(String args[]){

    int number[] = {-2,-4,6,8,-10};

    max_array_sum(number);


}
}