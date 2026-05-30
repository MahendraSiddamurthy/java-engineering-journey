public class ArrayPractice{

    public static void main(String args[]){

        int [] arr = {10,20,30,40,50};

        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);

        arr[2] = 60;
        System.out.println("Updated Value" + arr[2]);

        System.out.println("Length of an array" + arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.println("Array index is " + arr[i]);
        }
    }
}