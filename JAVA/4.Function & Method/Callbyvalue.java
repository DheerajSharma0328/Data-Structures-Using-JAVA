import java.util.*;

public class Callbyvalue {

    public static void swap(int a , int b){

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("this is functon of swap");
        System.out.println("The Value of A : " +a);
        System.out.println("The Value of B :"+b);
        System.out.println(" ");


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = sc.nextInt();

        System.out.println("Enter Second Number ");
        int b = sc.nextInt();

        swap(a,b);

        System.out.println("this is callbyvalue no change in original value");
        System.out.println("The Value of A : " +a);
        System.out.println("The Value of B :"+b);
    }
}
