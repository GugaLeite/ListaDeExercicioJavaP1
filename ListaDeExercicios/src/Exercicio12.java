import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	double a, b, c;	
		
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Este programa ira mostrar os valores digitados em ordem crescente!");
		
		
	System.out.println("Digite uma valor: ");
	a = scanner.nextDouble();
	
	System.out.println("Digite outro valor: ");
	b = scanner.nextDouble();
	
	System.out.println("Digite outro valor: ");
	c = scanner.nextDouble();
	
	scanner.close();
	
	if (a > b && b > c) {
		
		System.out.printf("%f, %f, %f", c,b,a);
	} 
	else if (a > b && b < c) {
		
		System.out.printf("%f, %f, %f", b,c,a);
	}
	else if (a < b && b < c) {
		
		System.out.printf("%f, %f, %f", a,b,c);
	}
	else if (b > a && a > c) {
		
		System.out.printf("%f, %f, %f", c,a,b);
	}
	else if (b > a && a < c) {
		
		System.out.printf("%f, %f, %f", a,c,b);
	}
	else if (b < a && a < c) {
		
		System.out.printf("%f, %f, %f", c,b,a);
	} 
	else if (c > a && a > b) {
		
		System.out.printf("%f, %f, %f", b,a,c);
	}
	else if (c > b  && b < a) {
		
		System.out.printf("%f, %f, %f", b,a,c);
	}
	else {
		
		System.out.println("Os valores tem que ser distintos!");
	}
	
	
	}

}