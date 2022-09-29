import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int frango;
		double total;
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Este programa ira calcular o valor para implementar um sistema de automatizacao em sua granja.");
		System.out.println("Digite a quantidade de frangos que voce possui: ");
		frango = scanner.nextInt();
		
		scanner.close();
		
		total = (frango * 3) + (frango * 5);
		
		System.out.println("Voce tera que investir R$ " + total + " para implementar o controle automatizado na sua granja.");
		
		
	}

}
