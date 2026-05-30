import java .util.*;

public class UserDefinedArray{

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter array values");
       

        int[] arr = new int[5];
        int sum = 0;
        int max =arr[0];

        for(int i =0; i<arr.length; i++){
            
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

         for(int i =0; i<arr.length; i++){
            sum = sum +arr[i];
        }
         System.out.println("Array total is "+ sum);
    }
}