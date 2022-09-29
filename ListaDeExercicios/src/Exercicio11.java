import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 5;
		int raz = 3;
		int n, somapa;
		int an;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Este program ira calcular asoma dos termos de uma PA que tem a1 = 5 e razao = 3. Forneca os dados abaixo!");
		System.out.println("======================================================================================");
		
		System.out.println("Digite o valor de N: ");
		n = scanner.nextInt();
		
		scanner.close();
		
		an = a1 + (n-1) * raz;
		System.out.println("======================================================================================");
		System.out.println("Descoberto o an que e: " + an + ", agora iremos calcular a soma dos termos da PA");
		
		somapa = ((a1 + an) * n) / 2;
		System.out.println("======================================================================================");
		System.out.printf("A soma dos termos da PA e: " + somapa);
		
		
	}

}
