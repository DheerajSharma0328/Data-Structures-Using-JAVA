import java.util.*;

public class ReverseArray{

public static void reverse_array(int reverse[]){
    int first = 0 , last = reverse.length-1;

    while(first < last){
        int temp = reverse[last];
        reverse[last] = reverse[first];
        reverse[first] =  temp;

        first++;
        last--;

        }
        
    
}



public static void main(String args[]){
    int reverse[] = {2,4,6,8,10};

   reverse_array(reverse);

    for(int i = 0; i<reverse.length; i++){
        System.out.print(reverse[i]+" ");

    }
    System.out.println();

}

}