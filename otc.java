import java.util.Scanner;

public class Question4{
  public static void main(String[] args){
    //Variable initialization
    Scanner in = new Scanner(System.in);
    int operand_1, operand_2;
    String operator;

    //Prompt users for inputs
    System.out.println("Welcome to the open source one-time-use calculator!");
    System.out.println("How ya doing today?");
    System.out.println("Please note that this calculator only supports +,-,*,/ with 2 integers!");
    System.out.println("Enter the equation you wish to be solved, with infix notation and spaces seperating operators and operands!(e.g.: 2 + 6): ");
    operand_1 = in.nextInt();
    operator = in.next();
    operand_2 = in.nextInt();
    
    //Switch operators
    switch(operator){
        case "+":
            System.out.println("The result of " + operand_1 + " " + operator + " " + operand_2 + " is " + (operand_1 + operand_2));
            break;
        
        case "-":
            System.out.println("The result of " + operand_1 + " " + operator + " " + operand_2 + " is " + (operand_1 - operand_2));
            break;
            
        case "*":
            System.out.println("The result of " + operand_1 + " " + operator + " " + operand_2 + " is " + (operand_1 * operand_2));
            break;
            
        case "/":
            if(operand_2 == 0) System.out.println("Sorry, division by zero is currently unsupported. Feel free to create an issue @ https://github.com/krgy45/OTC/issues to ask for functionality extension!");
            else System.out.println("The result of " + operand_1 + " " + operator + " " + operand_2 + " is " + (operand_1 / operand_2) + " with remainder " + (operand_1 % operand_2));
            break;
            
        default:
            System.out.println("Sorry, the operator you have entered is currently unsupported. Feel free to create an issue @ https://github.com/krgy45/OTC/issues to ask for functionality extension!");
    }    
  }
}