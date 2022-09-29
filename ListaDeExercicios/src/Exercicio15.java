import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario, vendas, salariof;
		String nome; 
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Este programa ira calcular o valor de comissao do vendedor.");
		
		
		
		System.out.println("Digite o seu nome: ");
		nome = scanner.nextLine();
		
		
		System.out.println("Digite o seu salario: ");
		salario = scanner.nextDouble();
		
		
		System.out.println("Digite o total de vendas feitas no mes em R$: ");
		vendas = scanner.nextDouble();
		
		
		scanner.close();
		
		salariof = vendas + (vendas * 0.15) + salario;
		
		System.out.println("O salario final de " + nome + " e de: " + salariof + "K");
	}

}
