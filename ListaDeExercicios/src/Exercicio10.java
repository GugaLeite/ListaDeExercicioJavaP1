import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a1, n, an, razao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Estre programa ira desenvolver o calculo da razao de uma P.A (Progressao Aritmetica)");
		System.out.println("------------------------------------------------------------------------");
		
		
		System.out.println("Digite a razao da P.A: ");
		razao = scanner.nextDouble();
		
		System.out.println("Digite o primeiro termo (a1): ");
		a1 = scanner.nextDouble();
		
		System.out.println("Digite o N: ");
		n = scanner.nextDouble();
		
		
		
		scanner.close();
		
		
		
		an = (a1 + (n-1) * razao);
		
		
		
		System.out.println("O resultado é: " + an);
		
		
		
	}

}
