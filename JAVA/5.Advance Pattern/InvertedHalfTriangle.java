import java.util.*;

public class InvertedHalfTriangle {

    public static void InvertedRightTriangle(int ro){
        for(int row = 1; row<=ro; row++ ){

            

                for(int i = 1; i<=ro-row; i++){
                    System.out.print(" ");
                }

                for(int j = 1; j<=row; j++){
                    System.out.print("*");
                }

                System.out.println("");

                
            

        }
    } 

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        InvertedRightTriangle(rows);
        
    }

    
}
