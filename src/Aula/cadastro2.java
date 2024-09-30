package Aula;

import java.util.Scanner;

public class cadastro2 {

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
			
			if (numero == 1) {
				System.out.println("TELA PARA CADASTRO");
			} else if (numero == 2) {
				System.out.println("TELA PARA VISUALIZAR");
			}  else if (numero == 0) {
				System.out.println("SAINDO");
			} else {
				System.out.println("OPÇÃO INVÁLIDA");
			}
			
		} while (numero != 0);
		
		sc.close();

	}

}
