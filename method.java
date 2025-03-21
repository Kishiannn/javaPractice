import java.util.Scanner;


public class PracticeJava {
    
    static void myMethod(){     
        Scanner scan = new Scanner(System.in);
        
        int num1;
        int num2;
                
        
       System.out.print("Input number1 here: ");
       num1 = scan.nextInt();
       System.out.print("Input number2 here: ");
       num2 = scan.nextInt();
       
        int sum = num1 + num2;
        System .out.print("The sum is: " + sum);
        
    }

    public static void main(String[] args) {
        myMethod();
    }
}
