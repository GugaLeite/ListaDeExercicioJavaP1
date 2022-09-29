import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int seg, h, m, s;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Este program ira converter o tempo de segundos para horas, minutos e segundos;");
		
		
		System.out.println("Digite o tempo de duracao do evento da fabrica em segundos: ");
		seg = scanner.nextInt();
		
		scanner.close();
		
		h = seg / 3600;
		m = (seg % 3600) / 60;
		s = (seg % 3600 ) % 60;
		
		System.out.println("O tempo do evento da fabrica e de: " + h + "h" + m + "m" + s + "s");
		
	
		
	}

}
