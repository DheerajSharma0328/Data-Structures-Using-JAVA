import java.util.*;
public class invertedStar {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Number :");
        int line = in.nextInt();
        
        

        for(int i=1; i<=line; i++){

            for(int j=1; j<=(line-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
