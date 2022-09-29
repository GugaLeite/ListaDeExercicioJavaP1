import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double prestacao, valor, taxa;
		int tempo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Este programa ira calcular o valor de uma prestacao em atraso");
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("Insira o valor da prestacao em atraso: ");
		valor = scanner.nextDouble();
		
		System.out.println("Insira taxa da prestacao em atraso: ");
		taxa = scanner.nextDouble();
		
		System.out.println("Insira quantos dias de atraso tem a prestacao: ");
		tempo = scanner.nextInt();
		
		
		scanner.close();
		
		
		prestacao = valor + ( valor * (taxa/100) * tempo);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("O valor a ser pago da sua prestacao com atraso e de: " + prestacao);
		
	}

}
