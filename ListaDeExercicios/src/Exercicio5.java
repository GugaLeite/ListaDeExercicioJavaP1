import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raio, area;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Este programa ira calcular a area de uma superficie esferica!");
		System.out.println("Forneca o raio da superficie esferica: ");
		raio = scanner.nextDouble();
		
		scanner.close();
		
		area = ((4 * 3.14) * Math.pow(raio, 2)); 
		
		System.out.println("O valor da area da sua superficie esferica e : " + area + " m2");
	}

}
