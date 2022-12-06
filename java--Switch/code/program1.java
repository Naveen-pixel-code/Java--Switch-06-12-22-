//This is a program to find Number of days in the month(1 to 12), using Switch case?

import java.util.*;

class program1
{
	public static void main(String args[])
	
	{
		int a;
		Scanner mon = new Scanner(System.in);
		
		System.out.println("Enter a month: ");
		a = mon.nextInt();
		
		switch(a)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println("This month have 31 Days");
			break;
			
			case 2:
			System.out.println("This month have 28/29 Days");
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println("This month have 30 Days");
			break;
			
			default:
			System.out.println("Invaild");
			
		}
		
	}
	
}