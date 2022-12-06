//This is a program to print the day from (1 to 7), using switch cases?

import java.util.*;
class program2
{
	public static void main(String args[])
	
	{
		Scanner days = new Scanner(System.in);
		System.out.println("Enter a days (1 to 7): ");
		int a = days.nextInt();
		
		switch(a)
		{
		case 1 -> System.out.println("Sunday");
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5-> System.out.println("Thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default -> System.out.println("Invaild day");
		}
	}
}