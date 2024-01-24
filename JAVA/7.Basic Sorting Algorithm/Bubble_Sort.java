import java.util.*;

public class Bubble_Sort {

    public static void bubble_sort(int bubble[]) {

        int swap = 0;
        boolean isSorted = true;
        

        for (int i = 1; i < bubble.length; i++) {
            int count = 0;
        
            for (int k = 0; k < bubble.length - i; k++) {
                if (bubble[k] > bubble[k + 1]) {
                    isSorted = false ;
                    swap = bubble[k + 1];
                    bubble[k + 1] = bubble[k];
                    bubble[k] = swap;

                }
                count ++;
            }
               System.out.println("Count: "+count) ;

               if(isSorted == true){
                break;
               }
        }

        for (int i = 0; i < bubble.length; i++) {

            System.out.print(bubble[i]);
        }

    }

    public static void main(String args[]) {

        int bubble[] = {1,2,3,4,5};
        bubble_sort(bubble);

    }

}
