import java.util.*;

public class Butterfly {

    

    public static void Butterfly(int input){

//First for loop is for row

            for(int row = 1; row<=input; row++){
 //Second for loop is for star in column
            for(int col = 1; col <= row; col++){

                System.out.print("*");
            }
//Third for loop is for space which is number of rows+1
            
            for(int spa = 0; spa<=6;spa++){
                System.out.print(" ");

            for(int j = 1; j<=row; j++){
            System.out.print("*");
            }
        }
        System.out.println();
            
//Fourth for loop is to print inverted right angle tringle after space followed by First loop
     
    }
}

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        Butterfly(rows);
    }
    
}
