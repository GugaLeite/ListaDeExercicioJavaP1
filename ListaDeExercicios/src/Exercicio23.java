import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double valor, valorf;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do carro: R$:  ");
		valor = scanner.nextDouble();
		
		System.out.println("Digite o modelo de combustivel do veiculo: ");
		System.out.println("------------------------------------------------");
		System.out.println("Digite 1 - ALCOOL // 2 - GASOLINA // 3 - DIESEL");
		num = scanner.nextInt();
		
		scanner.close();
		
		switch(num) {
		
		case 1: 
			
			valorf = valor - (valor * 0.28);
			System.out.println("Voce escolheu um veiculo a ALCOOL, seu desconto sera de 28%");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Voce pagara: R$: " + valorf);
			break;
			
		case 2: 
			
			valorf = valor - (valor * 0.22);
			System.out.println("Voce escolheu um veiculo a GASOLINA, seu desconto sera de 22%");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Voce pagara: R$: " + valorf);
			break;
			
		case 3: 
	
			valorf = valor - (valor * 0.12);
			System.out.println("Voce escolheu um veiculo a DIESEL, seu desconto sera de 12%");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Voce pagara: R$: " + valorf);
			break;
			
		
			
		
		}
		
	}

}
