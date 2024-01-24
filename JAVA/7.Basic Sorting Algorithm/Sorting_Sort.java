import java.util.*;

public class Sorting_Sort{

public static void sorting_sort(int unsorted[]){

    for(int i = 0 ; i < unsorted.length-1 ; i++){

        int tiny = i ;

        for(int j = i+1 ; j < unsorted.length ; j++){

            if(unsorted[tiny] > unsorted[j]){ 

                tiny = j ;
            }
        } 

        int swap = unsorted[tiny];
        unsorted[tiny] = unsorted[i] ;
        unsorted[i] = swap ; 

    }

    for(int i = 0 ; i < unsorted.length ; i++){
        System.out.print(unsorted[i] + " ");
    }
}

public static void main (String args[]){

    int unsorted[] = {5,4,1,3,2};

    sorting_sort(unsorted);

}
}