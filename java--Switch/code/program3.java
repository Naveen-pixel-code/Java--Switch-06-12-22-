//This is a program to find whether a char is vowel or not? Using switch cases

import java.util.*;

class program3
{
 public static void main(String args[])
 
 {
     Scanner ch = new Scanner(System.in);
	 System.out.println("Enter a Letter: ");
	 char  a = ch.next().charAt(0);
	 
	 switch(a)
	 {
		 
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
		 case 'A':
		 case 'E':
		 case 'I':
		 case 'O':
		 case 'U':
		 System.out.println("It is Vowel");
		 break;
		 default :
		 System.out.println("Not a Vowel");
	 }
 }
}