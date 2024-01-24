import java.util.*;
public class productofAandB {

    public static int product(int a , int b){

        int pro = a*b;
        return pro; 
    }

    public static void main(String args[]){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int a = sc.nextInt();

        System.out.println("Enter B :");
        int b = sc.nextInt();

        int pro = product(a,b);
        System.out.println("Product is :"+pro);
    
}
}
