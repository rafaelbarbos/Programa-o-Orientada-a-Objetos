package poo;


//Classe principal

import java.util.Scanner;

public class Principal{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cadastro de produtos.");

		System.out.println("Informe o código do produto:");
		int codigo = scanner.nextInt();

		scanner.nextLine(); //Limpar o buffer do teclado

		System.out.println("Informe o nome do produto:");
		String nome = scanner.nextLine();

		System.out.println("Informe a quantidade do produto:");
		int quantidade = scanner.nextInt();

		scanner.nextLine(); //Limpar o buffer do teclado

		System.out.println("Informe o tipo do produto:");
		String tipo = scanner.nextLine();

		System.out.println("Informe o valor do produto:");
		double valor = scanner.nextDouble();

		Produto produto = new Produto(codigo, nome, quantidade, tipo, valor);

		System.out.println("Produto cadastrado:");

		System.out.println(produto);

		scanner.close();

	}
}
