import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double valor, desconto, salario, salariodesc;
		int aulas;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Este programa ira calcular o salario liquido de um professor.");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Disponibilize algumas informacoes!");
		System.out.println("------------------------------------------------------------------------");
		
		
		System.out.println("Diga o valor da hora-aula: ");
		valor = scanner.nextDouble();
		
		
		
		System.out.println("Diga o numero de aulas dadas no mes: ");
		aulas = scanner.nextInt();
		
		
		
		System.out.println("Informe o percentual de desconto abatido pelo INSS: ");
		desconto = scanner.nextDouble();
		
	
		scanner.close();
		
		
		salario = (aulas * valor);
		
		salariodesc = salario - ((salario * desconto) / 100 );
		
		System.out.println("O seu salario com professor e de: R$ " + salariodesc);
		
		
	}

}
