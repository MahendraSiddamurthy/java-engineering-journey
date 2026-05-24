
import java.util.*;
public class OperationsDemo{

    public static void main(String args[]){

       Scanner sc= new Scanner(System.in);
       System.out.println("Let's learn some operations");
       System.out.println("Enter the value of a  : ");
       double a = sc.nextDouble();
       System.out.println("Enter the value of b  : ");
       double b = sc.nextDouble();
       double c = a+b;
       System.out.println("Addition value is:   " + c);
       double d = a-b;
        System.out.println("Subtraction value is:   " + d);
       double e = a*b;
        System.out.println("Multiplication value is:   " + e);
       double f = a/b;
        System.out.println("Divison value is:   " + f);
       double g = a%b;
        System.out.println("Modulus value is:   " + g);

        
        }
}