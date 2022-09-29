import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raio, volume;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Para que o aplicativo calcule o valume da esfera");
		System.out.println("Informe o raio: ");
		raio = scanner.nextDouble();
		
		scanner.close();
		
		volume = ((4 * 3.14) * Math.pow(raio, 3)) / 3;
		
		System.out.printf("O volume da esfera é de: " + volume);
				
		
	}

}
