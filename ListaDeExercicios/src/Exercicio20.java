import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, at, ac, atr, aq;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o valor A: ");
		a = scanner.nextDouble();
		
		
		System.out.println("Digite o valor B: ");
		b = scanner.nextDouble();
		
		
		System.out.println("Digite o valor C: ");
		c = scanner.nextDouble();
		
		scanner.close();
		
		at = (a * c) / 2;
		ac = (3.14159 * (Math.pow(c, 2))); 
		atr = ((a + b) * c) / 2;
		aq = b * b;
		
		System.out.println("A area do triangulo retangulo é de: " + at);
		System.out.println("A area do circulo do raio é de: " + ac);
		System.out.println("A area do trapezio e de: " + atr);
		System.out.println("A area do quadrado é de: " + aq);
	}

}
