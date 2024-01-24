import java.util.*;

public class Factorial {

    public static int factorial(int a){

        int i;
        int mul=1;

        for(i = 1 ; i<=a ; i++){

           mul = mul*i;            
        }
        return mul;
    }

        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The Factorial : ");
            int a = sc.nextInt();

            int mul = factorial(a);
            System.out.println("Your Factorial is :"+mul);

        }

    }
    

