import java.util.*;

public class InvertedNumberPyramid {

    public static void getInvertedNumberPyramid(int input){

        int a=0;

        for(int row = 1; row<=input; row++){

            for(int col = 1; col<=input-a; col++ ){
                System.out.print(col);
            }
            System.out.println();
            ++a;
        }

        //int cinput = input;

        // for(int row = input; row>=1; row--){

        //     for(int col = 1; col<=row; col++ ){
        //         System.out.print(col);
        //     }
        //     System.out.println();
            
        // }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        getInvertedNumberPyramid(rows);
    }
}
