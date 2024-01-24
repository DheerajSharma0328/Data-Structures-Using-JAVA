
public class Buy_Sell_Stock {

    public static void main(String args[]){
        int number[] ={7,1,5,3,6,4};

        int past_Lowest_Price = 0 ;
        past_Lowest_Price = number[0] ; 
        int currentProfit = 0 ; 
        int finalProfit = 0 ;



        for (int  i = 1 ; i < number.length ; i++){

            if(number[i] - past_Lowest_Price > 0){

                currentProfit = number[i] - past_Lowest_Price ;

            }

            if(number[i] < past_Lowest_Price){

                past_Lowest_Price = number[i];
            }

            finalProfit = Math.max(currentProfit , finalProfit) ;
        }

        System.out.print(finalProfit);
    }
    
}
