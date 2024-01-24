import java.util.*;
public class halfPramaid {
    public static void main(String args[]){
        Scanner store = new Scanner(System.in);

        System.out.print("Enter The Number:");
        int line = store.nextInt();

        for(int i=1; i<=line ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
