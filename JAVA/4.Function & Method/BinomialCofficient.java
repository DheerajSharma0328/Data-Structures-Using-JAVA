import java.util.*;

public class BinomialCofficient {

    //yaha pe factorial ka alag funaction bana ke fir n,r,n-r ki indivisual value bhej ke factorial find kar lege
    //ye ek optimized code ho jaye ga

    public static int BinomialCofficient(int n , int r){

        
        int nf = 1;
        for( int i = 1 ; i<=n; i++){

             nf = nf*i; //Calculating N Factorial
        }


        int rf =1;
        for(int j = 1; j<=r; j++){

            rf = rf*j;//Calculating J Factorial
        }


        int sub = n-r;

        int subf = 1;
        for(int k = 1; k<=sub; k++){

            subf = subf*k;//Calculating n-r Factorial
        }

        int bc = nf/(rf*subf); //yaha pe (rf*subf) ye bracket ke ander hai kyoki phele bracket solve hota hai 
                               //  agar hum bracket use nahi kare ge toh answer galat aaye ga
        return bc;


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of N :");
        int n = sc.nextInt();

        System.out.println("Enter The Value Of R :");
        int r = sc.nextInt();

        int bc = BinomialCofficient(n,r);

        System.out.println("Binomial Cofficient Is :"+bc);

    }
    
}
