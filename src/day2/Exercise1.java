//Exercise 1 : Converts The 100 Points Grades
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that converts the 100 points grades into letter grades.
 * Date : 01/01/2023
 */
package day2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		String letterGrade;
		int grade;
		// We initiate scanner to read the input of user
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your points between (0-100): ");
			// Read the grade
			grade = scanner.nextInt();
			// Check by condition with the table
			if (grade >= 93 && grade <= 100) {
				letterGrade = "A";
			} else if (grade >= 90 && grade <= 92) {
				letterGrade = "A-";
			} else if (grade >= 87 && grade <= 89) {
				letterGrade = "B+";
			} else if (grade >= 83 && grade <= 86) {
				letterGrade = "B";
			} else if (grade >= 80 && grade <= 82) {
				letterGrade = "B-";
			} else if (grade >= 77 && grade <= 79) {
				letterGrade = "C+";
			} else if (grade >= 70 && grade <= 76) {
				letterGrade = "C";
			} else if (grade >= 60 && grade <= 69) {
				letterGrade = "D";
			} else {
				letterGrade = "F";
			}
			// Output the result 
			System.out.println("letter grades" + letterGrade);
		}

	}

}
