import java.util.*;
public class LargestArrayValue{

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        

        int[] arr= new int[5];
        int sum =arr[0];
        System.out.println("Enter the array values");

        for(int i =0; i<arr.length;i++){
           arr[i] = sc.nextInt();
         }
        
        for(int i =0; i<arr.length;i++){
            
            if(arr[i] > sum){
                sum =arr[i];
            }
         }
         System.out.println("Largest array value is" + sum);
    }
}