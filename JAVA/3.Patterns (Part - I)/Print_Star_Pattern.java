import java.util.*;
public class Print_Star_Pattern{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int a = in.nextInt();

        for(int i = 0; i<=a ; i++){
            
            for(int k = 0; k<i; k++ ){

                System.out.print("*");
            }
            System.out.println();
        }


    }
}