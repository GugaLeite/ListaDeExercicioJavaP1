import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario, aumento;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		System.out.println("Este programa ira ler o seu e salario e mostra-lo com um acrescimo de 15%.");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Digite o seu salario: ");
		salario = scanner.nextDouble();
		
		scanner.close();
		
		aumento = (salario * 0.15) + salario;
		
		System.out.println("O seu salario com um aumento de 15% e: " + aumento);
		
		
		
	}

}
