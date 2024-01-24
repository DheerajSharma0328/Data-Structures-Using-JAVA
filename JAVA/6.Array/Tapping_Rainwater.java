import java.util.*;
 
public class Tapping_Rainwater {

    public static int trap_Rainwater(int height[]){
        int hei_len = height.length;

        if(hei_len <= 2){
            return 0 ;
        }

        int leftMax[] = new int[hei_len] ;
        leftMax[0] = height[0];
        for(int i = 1 ; i < hei_len ; i++){
                leftMax[i] = Math.max(height[i], leftMax[i-1]) ;
                // System.out.print(" "+leftMax[i]);
        }


        int rightMax[] = new int[hei_len];
        rightMax[hei_len-1] = height[hei_len-1];
        for(int i = hei_len-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }


        int trappedWater = 0 ;

        for(int i = 0 ; i < hei_len ; i++){
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);

            trappedWater = trappedWater + (waterLevel - height[i]) ;
        }

        return trappedWater ;

    }
    
    public static void main(String args[]){

        int height[] = {1,2,3,4,5,6};
        System.out.print(trap_Rainwater(height));
    }
}
