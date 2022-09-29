import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a, b, c, d, e, f, x, yps;
		
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Digite o valor de A: ");
		a = scanner.nextDouble();
		
		
		System.out.println("Digite o valor B: ");
		b = scanner.nextDouble();
		
		
		System.out.println("Digite o valor C: ");
		c = scanner.nextDouble();
		
		
		System.out.println("Digite o valor D: ");
		d = scanner.nextDouble();
		
		
		System.out.println("Digite o valor E: ");
		e = scanner.nextDouble();
		
		
		System.out.println("Digite o valor F: ");
		f = scanner.nextDouble();
		
		scanner.close();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		
		yps = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de X e: " + x);
		System.out.println("O valor de Y e: " + yps);
		
		
	}

}
