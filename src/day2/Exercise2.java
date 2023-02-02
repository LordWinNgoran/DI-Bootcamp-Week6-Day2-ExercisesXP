package day2;
//Exercise 2 : Numbers Triangle
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int userInput;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print( "Please enter : " );
			userInput = scanner.nextInt();
		}
		
		for (int i = 1; i <= userInput; i++) {
        	if (i<=1) {
        		System.out.println(i);
			}else {
				String value = String.valueOf(i);
				 System.out.println(i+""+value.repeat(i-1));
			}
        	 
        }

	}

}
