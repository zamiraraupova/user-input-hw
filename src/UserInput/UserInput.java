package UserInput;

import java.util.Scanner;

public class UserInput {
//	1. Write Fibonnacci series between the user entered start and end values
// 0,1,1,2,3,5,8,13,21,34,55,89,144, ... x(n) = x(n-1) + x(n-2) === x8 = x6 + x7
	
	public static void main(String[] args) {
		//start scanner for user input
		Scanner scanner = new Scanner(System.in);
		
		//prints the string
		System.out.println("Enter number you want to display: ");
		
		//initialize num reading what user enters
		int num =  scanner.nextInt();        
		
		// prints the string with num == user's input
		System.out.print("Fibonacci series of " + num + " number(s): ");
		
		//initialize variables 
		int i = 1;     
		int num1 = 0;
		int num2 = 1;
		
		while (i <= num) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			i++;
		}
		
	}
	
	
//	2. Determine whether a user entered number is an Armstrong number
	
	public static void main(String[] args) {
		//start scanner for user input
		Scanner scanner = new Scanner(System.in);
		
		//prints the string
		System.out.println("Enter number to check if it is an Armstrong number: ");
		
		//initialize num reading what user enters
		int num =  scanner.nextInt();        
		
		//initialize variables
		int temp = num;
		int rem = 0;  
		int sum = 0;
	
//   logic: 
//		   371 - Armstrong number => 3^3 + 7^3 + 1^3 = 371
//			
//		    Step1: 371%10 = 1
//			       sum=sum+(1*1*1)=1
//			       371/10 =37
//			
//		    Step2: 37%10=7
//		           sum+sum+(7*7*7)= 1+343 = 342
//		           37/10 = 3
//		           
//		    Step3: 3%10 = 3
//		           sum=sum+(3*3*3)=344+27=371
//		           3/10 = 0
			       	   
				   
		while(num>0) {
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		
		// prints the string with num == user's input
		if(temp==sum) {
			System.out.print("Number you entered is Armstrong number");
		}
		else {
			System.out.print("Number you entered is not Armstrong number");
		}
	}
	


//	3. Write a program to see if a user entered string is a palindrome or not
	
	public static void main(String[] args) {
		//start scanner for user input
		Scanner scanner = new Scanner(System.in);
		
		//prints the string
		System.out.println("Enter a word: ");
		
		//initialize string - reading what user enters
		String str =  scanner.nextLine();        
		
		//reverse string entered into a new string
		String reverseStr = new StringBuilder(str).reverse().toString();
		
		//checking
		if(str.equals(reverseStr)) {
			System.out.println("The word you entered is a palindrome");
		}
		else {
			System.out.println("The word you entered is not a palindrome");
		}
		
	}

	//scanner.close();
}
