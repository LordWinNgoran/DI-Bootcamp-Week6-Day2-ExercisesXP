//Exercise 2 : Numbers Triangle
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that uses the loops to produce the following output:
 * Date : 01/01/2023
 */
package day2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//declaration part
		int userInput;
		try (Scanner scanner = new Scanner(System.in)) {
		// we user need to enter a number
			System.out.print( "Please enter a number for pyramid : " );
			userInput = scanner.nextInt();
		}
		//loop to output the pyramid by user input
		for (int i = 1; i <= userInput; i++) {
			//If the number is 1 output 1
        	if (i<=1) {
        		System.out.println(i);
			}else {
				// we convert the number to String to use a method repeat
				String value = String.valueOf(i);
				 System.out.println(i+""+value.repeat(i-1));
			}
        	 
        }

	}

}
