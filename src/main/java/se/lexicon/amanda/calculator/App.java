package se.lexicon.amanda.calculator;

import java.util.*;
public class App 
{
	private static final Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
    
    	double num1;
    	double num2;
    	char operator;
    	char question;
    	double answer = 0.0;
    	
    boolean mathOperation = true;
    
   while(mathOperation) {
    
    System.out.println("Please enter first number");
    num1 = scanner.nextInt();
    System.out.println("What mathoperation?");
    operator = scanner.next().charAt(0);
    System.out.println("Please enter second number");
    num2 = scanner.nextInt();
 
    switch (operator) {
    
    case '+': answer = add(num1, num2);
    break;
    case '-': answer = sub(num1, num2);
    break;
    case '*': answer = multi(num1, num2);
    break;
    case '/': answer = div(num1, num2);
    break;
    
    }
    
    System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    
    System.out.println("Do you want to do more math? y/n");
    question = scanner.next().charAt(0);
    if(question == 'n' || question == 'N') { 
    	System.out.println("Thank you!");
    	 //reagerar bara på nej
    	
    	mathOperation = false;
    }
    
   } // while ends
  
    
    }
    public static double add (double num1, double num2) {
        
    	double result = num1 + num2;
    	return result;
    	
    }
    
    public static double sub (double num1, double num2) {
        
    	double result = num1 - num2;
    	return result;
}
    

	public static double multi (double num1, double num2) {
    
		double result = num1 * num2;
		return result;
	
}
    
    public static double div (double num1, double num2) {
		double result = 0;   
		//allt inom scopen (=det inom {}) under känner till den här, tvärtom funkar ej. T.ex. hade return result stått inom
		//else hade result inte kunnat visas. Tänk vattenfall, kan bara falla neråt.
		
			if (num1 == 0 || num2 == 0) {
	        	System.out.println("Can not devide with zero!");
	        }
	        else {         	
	        	result = num1 / num2; 
	        }
	    	return result;    	
    }


    
}
