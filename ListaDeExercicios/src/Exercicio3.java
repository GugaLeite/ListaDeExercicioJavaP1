
import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String tamanho;
		double tam;
		double tempo;
		int velo = 2000000;
		
		tamanho = JOptionPane.showInputDialog(args,"Digite o tamanho do arquivo em bytes: ");
		
		
		
		System.out.println("Este program ira calcular o tempo de download de um arquivo");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Qual o tamanho do seu arquivo? ");
		tam = Double.parseDouble(tamanho);
		
		
		
		tempo = tam / ( velo / 8 );
		
		JOptionPane.showMessageDialog(null, "Tempo de download sera de: " + tempo + " segundos.");


		
	}

}
