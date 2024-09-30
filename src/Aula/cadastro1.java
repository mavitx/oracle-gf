package Aula;

import java.util.Scanner;

public class cadastro1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("""
					=====================================
					Menu de Opções (digite um dos números):
					0 - Para encerrar o programa 
					1 - Tela de Cadastro
					2 - Tela de Visualização
					=====================================
					""");
			 numero = sc.nextInt();
		
		switch (numero) {
			case 0: 
			System.out.println("Programa encerrado");
			 	break;
			case 1: 
			System.out.println("TELA PARA CADASTRO");
				break;
			case 2: 
				System.out.println("TELA PARA VISUALIZAÇÃO");
				break;
			default:
				System.out.println("Inválido");
		}
		
		} while (numero != 0);
		
		sc.close();

	}

}
