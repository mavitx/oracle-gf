package Aula;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Cadastrar filmes");
//		System.out.println("Informe o filme 1:");
//		String filme1 = sc.next();
//		
//		System.out.println("Informe o filme 2:");
//		String filme2 = sc.next();
//		
//		System.out.println("Lista de filmes: ");
//		System.out.println(filme1);
//		System.out.println(filme2);
		
		String filmes[] = new String[3];
		filmes[0] = sc.next();
		filmes[1] = "wiu";
		filmes[2] = sc.next();
		
		System.out.println("Lista:");
		System.out.println(filmes[0]);
		System.out.println(filmes[1]);
		System.out.println(filmes[2]);
		
		int idades[] = new int[5];
		idades[0] = 32;
		idades[1] = 16;
		idades[2] = 8;
		idades[3] = 4;
		idades[4] = sc.nextInt();
		
		System.out.println("Lista:");
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		System.out.println(idades[3]);
		System.out.println(idades[4]);
		
		sc.close();
	}

}
