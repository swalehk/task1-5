// write a java program 
package calcultor;
//Importing scanner class object class.
import java.util.Scanner;
public class Calcultor {
//Declearing variables
   static char operator;
   static Double number1,number2,results;
    
    public static void main(String[] args) {
     //creating scanner class
     Scanner input=new Scanner(System.in);
     // Ask user to enter the operator
     System.out.println("choose an operator: +,-,* or /");
     operator=input.next().charAt(0);
     //Ask the user to enter the numbers:
     System.out.println("Enter the first number");
     number1=input.nextDouble();
       System.out.println("Enter the second  number");
     number2=input.nextDouble(); 
     
     switch (operator){
         //performing addition between 
         case'+':
         results=number1+number2;
       System.out.println(number1+"+"+number2+"="+results);
       break;
       //perform multiplication between two numbers
       case'*':
           results=number1*number2;
       System.out.println(number1+"*"+number2+"="+results);
       break;
       //performing substraction between numbers
       case'-':
           results=number1*number2;
       System.out.println(number1+"-"+number2+"="+results);
       break;
       //perform division between two numbers
       case'/':
           results=number1/number2;
       System.out.println(number1+"/"+number2+"="+results);
       break;
       
       default:
          System.out.println("Invalid operator!");
     }
     input.close();
    }
    
}
