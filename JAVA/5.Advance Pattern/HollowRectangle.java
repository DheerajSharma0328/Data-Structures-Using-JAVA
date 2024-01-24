import java.util.*;


        

public class HollowRectangle{

    public static void HollowRectangle (int r , int c){

        for(int i = 1; i<=r ; i++){

            for(int j = 1; j<=c ;j++){

                if(i==1  || i==r || j==1 || j==c){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }

            System.out.println();

    }
}

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Row :");
        int r = sc.nextInt();

        System.out.println("Enter Coloum");
        int c = sc.nextInt();

        HollowRectangle(r,c);


    }
}