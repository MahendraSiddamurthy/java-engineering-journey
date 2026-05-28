
import java.util.*;

public class SwitchCase{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("Hey its me your Calulator you can choose any option below to perform operations");
        System.out.println("Choose 1 for addition operation");
        System.out.println("Choose 2 for subtraction operation");
        System.out.println("Choose 3 for multiplication operation");
        System.out.println("Choose 4 for division operation");
        System.out.println("Choose 5 for modulus operation");

        System.out.println("Enter the value");
        int num = sc.nextInt();
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value");
        int b = sc.nextInt();
      
    switch(num){
        case 1:
            System.out.println("Addition Operation");
            System.out.println("value of c "+ (a+b));
            break;
        case 2:
            System.out.println("Subtraction Operation");
            System.out.println("value of c "+ (a-b));
            break;
        case 3:
            System.out.println("Multiplication Operation");
            System.out.println("value of c "+ a*b);
            break;
        case 4:
            System.out.println("division Operation");
            System.out.println("value of c "+ a/b);
            break;
        case 5:
            System.out.println("Subtraction Operation");
            System.out.println("value of c "+ a%b);
            break;
        case 6:
            System.out.println("Thankyou...!");
            return;
        default:
            System.out.println("Invalid option");    
    }
    }
    } 
}