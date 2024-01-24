import java.util.*;

public class Binary_Search{

    public static int binarysearch(int number[] , int key){
        int start = 0 , end = number.length; //.lenght functon 0 se nahi 1 se array ke element count karta hai

        while(start < end){
            int mid = (start + end) / 2; //yaha me mid jo hai wo array ke index ka mid hai na ki element ka

            if(number[mid] == key){
                return mid;
            }

            if(number[mid] < key){
                //right
                start = mid +1; //+1 hum isliye kar rahe hai kyo ki hume mid wale index ke check kar liya hai hai 
                                //ab hum +1 karke next index ko start bana ke check kar rahe hai
            }
            else{//left
                end = mid - 1;
            }
        }

        return -1; // -1 mean number not found

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int number[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int key = 12;

        System.out.println("Index For Key Is :"+binarysearch(number,key));

        
    }
}