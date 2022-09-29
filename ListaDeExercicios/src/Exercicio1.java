import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		double area, base, altura;
		
		System.out.println("Para calcular a area do triangulo, forneca os dados abaixo!");
		
		
		System.out.println("Digite o valor da base do triangulo: ");
		base = scanner.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo: ");
		altura = scanner.nextDouble();
		
		 scanner.close();
		
		area = (base * altura) / 2;
		
		System.out.println("O valor da area do seu triangulo e de: " + area);

	}

}
