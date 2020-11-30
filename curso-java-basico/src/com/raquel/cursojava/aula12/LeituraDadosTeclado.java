package com.raquel.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome , idade, qtde de filhos, altura e se tem pet");
		
		String nome = scan.next();
		int idade = scan.nextInt();
		byte qtdeFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("qtde de filhos" + qtdeFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem pet ?: " + temPet);
		
				
	}

}
