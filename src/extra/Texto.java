package extra;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		
		// no lugar do System.in coloca onde esta o arquivo c:\oi.txt
		// sc.hasNextLine();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Escrever no arquivo");
		System.out.println("2. Ler");
		int numero = sc.nextInt(); 
		
		String textos;
		
	//	if (numero == 1) {
		System.out.println("1.1 Qual o endereço do arquivo?");
		textos = sc.nextLine();
		
	//	System.out.println("1.2 Digite a frase.");
	//	textos = sc.nextLine();
		
	/*	} else {
			System.out.println("add o path");
	*/	

	}

}
