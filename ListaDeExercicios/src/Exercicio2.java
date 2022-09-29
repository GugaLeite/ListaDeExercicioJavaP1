import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor1, valor2, som, sub, mult, div, rest;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Abaixo, digite 2 valores para calcularmos as 4 operacoes basicas entre eles!");
		
		System.out.println("Digite um valor: ");
		valor1 = scanner.nextDouble();
		
		System.out.println("Digite outro valor: ");
		valor2 = scanner.nextDouble();
		
		scanner.close();
		
		
		som = valor1 + valor2;
		sub = valor1 - valor2;
		mult = valor1 * valor2;
		div = valor1 / valor2;
		rest = valor1 % valor2;
		
		
		
		
		System.out.println("O valora da soma entre os valores escolhidos e de: " + som);
		System.out.println("O valora da subtracao entre os valores escolhidos e de: " + sub);
		System.out.println("O valora da multiplicacao entre os valores escolhidos e de: " + mult);
		System.out.println("O valora da divisao entre os valores escolhidos e de: " + div);
		System.out.println("O valora do resto da divisao entre os valores escolhidos e de: " + rest);
		
	}

}
