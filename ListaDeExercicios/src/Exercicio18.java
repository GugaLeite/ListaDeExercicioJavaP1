import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome;
		double valorfab, valorfinal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome do veiculo: ");
		nome = scanner.nextLine();
		
		System.out.println("Digite o valor de fabrica do veiculo: ");
		valorfab = scanner.nextDouble();
		
		scanner.close();
		
		valorfinal = valorfab + (valorfab * 0.45) + (valorfab * 0.28);
		
		
		System.out.println("O valor do veiculo modelo " + nome + " e de R$: " + valorfinal);

	}

}
