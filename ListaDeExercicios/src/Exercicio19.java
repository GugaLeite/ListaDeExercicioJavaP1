import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, media, mediaf;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Este program ira calcular a media de 3 notas, com peso 2, 3 e 5, respectivamente");
		System.out.println("Digite sua primeira nota: ");
		a = scanner.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		b = scanner.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		c = scanner.nextDouble();
		
		scanner.close();
		
		media = (a * 2) + (b * 3) + (c * 5);
		mediaf = media / 10;
		
		System.out.println("A nota final do aluno e de: " + mediaf);
		
		
		
	}

}
