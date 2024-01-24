import java.util.*;



public class Max_Subarray_Sum_Kadanes_Algorithm {


    public static boolean checkneg (int number[]){

        for(int i = 0 ; i < number.length ; i++){

            if(number[i] >= 0){

                return false ;        
            }
        }  

        return true ;
}

public static int pureneg(int number[]){
    
    int ms = Integer.MIN_VALUE ;

    for(int i = 0 ; i < number.length ; i++){

        if(number[i] == -1){
            return -1;
        }

        ms = Math.max(ms, number[i]);
        

    }
    return ms ;

}

public static int kadanes(int number[]){
        int cs = 0 ;
        int ms = Integer.MIN_VALUE ;

        for(int i = 0 ; i < number.length ; i++){

            cs = cs + number[i] ;

            if(cs < 0){
                cs = 0 ;
            }

            ms = Math.max(ms , cs) ;
        }

        return ms ;

}

    public static void main(String args[]){
        int number [] = {-2,-3,4,-1,-2,1,5,-3};

        if(checkneg(number)){
            System.out.print(pureneg(number));
        }
        else{
            System.out.print(kadanes(number));
        }
        
    }
    
}
