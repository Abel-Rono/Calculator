import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        double num1, num2;
        num1 = num2 = 0;
        char operator;

        while (true) 
        {
            System.out.println("Enter the first number: ");
            if (SC.hasNextDouble()) {
                 num1 = SC.nextDouble();
            }
            else{
                System.out.println("Type error : Display some level of intelligence.");
                SC.nextLine();
                break;
            }
            
    
            System.out.println("Enter the second number: ");
            if (SC.hasNextDouble()) {
                num2 = SC.nextDouble();
           }
           else{
               System.out.println("Type error : Display some level of intelligence.");
               SC.nextLine();
               break;
           }
    
    
            System.out.println("Enter the operator: ");
            operator = SC.next().charAt(0);
    
            switch(operator){
                case '+': System.out.println(num1 + num2);
                break;
                case '-': System.out.println(num1 - num2);
                break;
                case '/': System.out.println(num1 / num2);
                break;
                case '*': System.out.println(num1 * num2);
                break;
                default:
                 System.out.println("Invalid entries");
            }
        }
    }
        
       
}