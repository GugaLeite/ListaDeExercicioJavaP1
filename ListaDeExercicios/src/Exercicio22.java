import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o valor inteiro de A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o valor inteiro de B: ");
		b = scanner.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		scanner.close();
		
		System.out.println("O valo de A e: " + a);
		System.out.println("O valor de B e: " + b);
		
		
		
	}

}
