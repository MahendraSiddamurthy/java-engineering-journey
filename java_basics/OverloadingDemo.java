public class OverloadingDemo{

    public  static void greet(){
        System.out.println("Welcome to Java");
    }

    public  static void greet(String name){
        System.out.println("Hello" + name);
    }

    public static void greet(String  name , int age){
        System.out.println("Hello" +name +  "my age is" + age );
    }
    public static void main(String args[]){
        greet();
        greet("Mahendra");
        greet("Mahendra", 26);

        
    }
}