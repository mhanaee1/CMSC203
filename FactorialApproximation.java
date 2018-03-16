/**
 * This method calculates the approximation of a entered value using formula
 * @author Mohammad Hanaee
 * 
 */
import java.util.Scanner;
public class FactorialApproximation {

  
   public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	  
	   final double number;
	   double approximation;
      
       
       System.out.println("header: approximation of n!");
      
       try {
           System.out.println("Please enter a number from 0-100 ");
           number = input.nextInt();
           if (number>0 && number<100) { //checking to make sure the number is within range
               approximation = 0;
              
             
               approximation =  (Math.sqrt(2*Math.PI)*Math.pow(Math.E, -number)*Math.pow(number,number+.5));// formula to calculate n! 
              
               System.out.println("Approximation value of "+number+"! is "+approximation); // displaying the approximation of entered number
              
            
               if (number == 5) {     // check n equal to 5 if so find difference
                   final double diff5 = 120 - approximation;// calculating the difference
                   System.out.println("The difference of value of 5! and calculated value(5!) is "+diff5 );
               }
              
               if (number == 7) {   // check n equal to 7 if so find difference
                  final double diff7 = 5040 - approximation;// calculating the difference
                   System.out.println("The difference of actual value of 7! and calculated value 7! is "+ diff7 );
               }
               System.out.print("Programmer Name: Mohammad");
           } else {
               System.out.println(number+ " is not in range of 0 to 100");// if entered number in not within range display this
           }
       } finally {
       }
   }
}

