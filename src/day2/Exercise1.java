package day2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("======= Début Exercice 1 ========");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez la note (0-100): ");
		// lecture de la note entrée par l'utilisateur
		int grade = scanner.nextInt();

		// déclaration de la variable pour stocker la note en lettres
		String letterGrade;
		// vérification de la note et détermination de la note en lettres correspondante
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

		// Affichage de la note en lettres
		System.out.println("Note en lettres: " + letterGrade);

		System.out.println("====== Fin exercie 1 =========");

	}

}
