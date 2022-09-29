import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double real, dolar;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("HORARIO E DATA LOCAL // 20:53 //21/09/2022 // JOAO PESSOA - BRASIL //");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Este programa ira converter a sua moeda de REAIS (R$) para DOLAR (U$)!");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("A cotacao atual e de: R$ 5,17");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Digite sua quantia em REAIS (R$): ");
		real = scanner.nextDouble();
		
		scanner.close();
		
		dolar = real * 5.17;
		
		System.out.println("Voce possui R$ " + real + " que convertidos para DOLAR(U$) fica: U$ " + dolar);
		
		
	}

}
