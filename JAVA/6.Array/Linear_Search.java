/*
1.Is Code me humne linear search karna sikha hai jisme ki hum ek given element ko array ke ander find karte hai

2.Just comparing given element With rest of the element of an array
 */
import java.util.*;
public class Linear_Search {

    public static void finder(int number[] , int input){

        boolean check = false;

        for(int i = 0; i<number.length; i++){

            if(input == number[i]){

                check = true;
                System.out.print(input + " Is On " + i + " Index ");
            }
        }

        if(check == false){
            System.out.print("Number Not Found");
        }

        
        
    }

    public static void main(String args[]){

        int number[] = {11,12,13,14,15,16,17,18,19,20};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int input = sc.nextInt();
        finder(number , input);
    }  
}
