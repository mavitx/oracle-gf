package extra;

import java.util.Scanner;

public class Imc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		if (imc < 16) {
			System.out.println("Seu IMC demostra magreza grave!");
		} else if (imc >= 16 && imc <= 18.4) {
			System.out.println("Seu IMC demostra magreza moderada!");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Seu IMC demostra normalidade!");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Seu IMC demostra sobrepeso!");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Seu IMC demostra obesidade Grau 1!");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Seu IMC demostra obesidade Grau 2 ou severa!");
		} else if (imc >= 40) {
			System.out.println("Seu IMC demostra obesidade Grau 3 ou mórbida!");
		}

		sc.close();
	}

}
