package desafioTriangulo;

import java.util.Scanner;

public class TipoDeTriangulo {
	// desafio de estrutura de controle.

	// lendo os lados de um triângulo, dizer se o mesmo é equilátero, isósceles ou
	// escaleno.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do lado A do triângulo:");
		double lA = entrada.nextDouble();

		System.out.println("Digite o valor do lado B do triângulo:");
		double lB = entrada.nextDouble();

		System.out.println("Digite o valor do lado C do triângulo:");
		double lC = entrada.nextDouble();

		if (lA == lB && lB == lC && lC == lA) {
			System.out.println("O triângulo é equilátero.");

		} else if (lA == lB ^ lA == lC ^ lC == lB) {
			System.out.println("O triângulo é isósceles.");

		} else {
			System.out.println("O triângulo é escaleno.");
		}

		entrada.close();

	}

}
