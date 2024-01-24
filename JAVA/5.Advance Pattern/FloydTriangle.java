import java.util.*;

public class FloydTriangle{

    public static void FloydTriangle(int input){

        int counter = 1;
        
        for(int row = 1; row<=input; row++){

            for(int col = 1; col<= row; col++){
                System.out.print(counter+" ");
                ++counter; 
            }

            System.out.println();


        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        FloydTriangle(rows);
    }
}