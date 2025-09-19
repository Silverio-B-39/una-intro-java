package exercicio2;

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		int num1;
		int num2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		num1 = scanner.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = scanner.nextInt();
		scanner.close();

		int subtracao = num1 - num2;
		int multiplicacao = num1 * num2;
		int divisao = num1 / num2;

		System.out.println("O resultado da Subtração é: " + subtracao);
		System.out.println("O resultado da multiplicação é: " + multiplicacao);
		System.out.println("O resultado da Divisão é: " + divisao);
	}
}