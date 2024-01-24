/*

1.Is code me humne arrrys ko as an argument pass kiya hai function ke ander jisse ki hume ye pata chalta hai ki array me pass by refence use hota hai kyoki
  pass by reference me original data change ho jata hai 

2.Pass by refrence me data ka address function me pass kiya jata hai

3. Note -- All the non primitive data type use pass by reference
           All the primitive data type use call by refernce
 
*/
public class Passing_Arrys_As_Argument{

    public static void change(int marks[] , int check){// 2.passing array as an argument

        check = 25; //1.2 change the value of check in function

        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] +1;//3.performing operation on original data
            
        }

    }
    public static void main(String args[]){

        int marks[] = {97,98,99};//1.origial data , Initilizing array
        
        //checking call by value
        int check = 10;//1.1
        change(marks , check );//Hum ek saath multiple argument pass kar sakte hai ,comma laga ke



        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]+"Call By Refrence");//4.when printing the array our original data is changed
        }

        System.out.println(check+"Call By Value");//1.3

    }
}