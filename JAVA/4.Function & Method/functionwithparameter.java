import java.util.*;
public class functionwithparameter {

    public static int Addition(int a , int b){



        int sum = a+b;

        return sum;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int a = sc.nextInt();
        System.out.println("Enter Number:");
        int b = sc.nextInt();
        
        int sum =  Addition(a,b);

        System.out.println("Output is :"+sum);
    }
    
}
