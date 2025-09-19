package exercicio3;

import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		String nome;
		int idade;
		double altura;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		nome = scanner.next();

		System.out.println("Digite a sua idade:");
		idade = scanner.nextInt();

		System.out.println("Digite a sua altura em centimetro:");
		altura = scanner.nextInt();

		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);

		scanner.close();
	}

}
