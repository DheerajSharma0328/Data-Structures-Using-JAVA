import java.util.*;
public class characterHalfPramaid {
    public static void main(String args[]){
        Scanner store = new Scanner(System.in);

        System.out.print("Enter The Number:");
        int line = store.nextInt();

        char ch = 'A';

        for(int i=0; i<line; i++){
            for(int j=0; j<i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
