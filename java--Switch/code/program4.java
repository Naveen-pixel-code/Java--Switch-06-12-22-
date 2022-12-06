//Build a mini-Calculator using switch cases?

import java.util.*;

class program4
{
	public static void main(String args[])
	
	{
		float a, b, result=0;
		char select;
		Scanner cal = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		a = cal.nextFloat();
		
		System.out.println("Enter secound number: ");
		b = cal.nextFloat();
		
		System.out.println("Enter Operator: ");
		select = cal.next().charAt(0);
		
		switch(select)
		{
			case '+':
			   result = a + b ;
			   System.out.println("Addition of " + a + "and " + b + "is " + result);
			   break;
			   
			case '-':
			   result = a - b ;
			   System.out.println("Substraction of " + a + "and " + b + "is " + result);
			   break;
			   
			      
			case '*':
			   result = a * b ;
			   System.out.println("Multiplication of " + a + "and " + b + "is " + result);
			   break;
			   
			      
			case '/':
			   result = a / b ;
			   System.out.println("Division of " + a + "and " + b + "is " + result);
			   break;
			   
			      
			case '%':
			   result = a % b ;
			   System.out.println("Module of " + a + "and " + b + "is " + result);
			   break;
			   
			   default: 
			   System.out.println("Invalid");
			    
			
		}
		
		
		
		
		
	}
}