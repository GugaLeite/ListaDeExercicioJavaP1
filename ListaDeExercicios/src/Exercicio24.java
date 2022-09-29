import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Para saber em qual categoria voce ira competir, digite a sua idade:  ");
		idade = scanner.nextInt();
		
		scanner.close();
		
		if (idade >= 4 || idade <= 7) {
			
			System.out.printf("Voce ira dispputar na categoria INFANTIL A.");
		
		} else if ( idade >= 8 || idade <= 9) {
				
			System.out.printf("Voce ira disputar na categoria INFANTIL B.");
		
		} else if ( idade >= 10 || idade <= 12) {
			
			System.out.printf("Voce ira disputar na categoria JUVENIL A.");
			
		} else if ( idade >= 13 || idade <= 17) {
			
			System.out.printf("Voce ira disputar na categoria JUVENIL B.");
			
		} else if ( idade >= 18 || idade <= 25) {
			
			System.out.printf("Voce ira disputar na categoria SENIOR.");
			
		} else {
			
			
			System.out.printf("!!! IDADE FORA DA FAIXA ETARIA!!!");
			
		}
		
		
		
		
	}

}