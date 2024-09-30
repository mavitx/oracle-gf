package Aula;

import java.util.Scanner;

public class Reprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a media: ");
		double media = sc.nextDouble();
		
		sc.close();
		
		if (media < 5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}

	}

}
