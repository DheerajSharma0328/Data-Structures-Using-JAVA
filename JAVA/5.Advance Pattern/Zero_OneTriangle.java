import java.util.*;

public class Zero_OneTriangle{

    public static void Zero_OneTriangle(int input){

        for(int row = 1; row<=input; row++){

            for(int col = 1; col<row; col++){

                if(((row+col) % 2) == 0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        Zero_OneTriangle(rows);

    }
    
}
