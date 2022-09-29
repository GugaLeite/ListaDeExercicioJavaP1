import javax.swing.JOptionPane;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kg, alt;
		double peso; 
		double altura, imc;
		 
		kg = JOptionPane.showInputDialog(args, "Insira o seu peso: ");
		
		alt = JOptionPane.showInputDialog(args, "Insira sua altura em metros: ");
	
		
		
		peso = Double.parseDouble(kg);
		altura = Double.parseDouble(alt);
		
		imc = peso / (altura * altura);
		
		if (imc < 18.5 ) {
			
			JOptionPane.showMessageDialog(null, "O sei imc e: " + imc);
		
		} else if (imc > 18.5 && imc < 24.9 ) {
			
			JOptionPane.showMessageDialog(null, "O sei imc e: " + imc);
		
		} else if (imc > 25.0 && imc > 29.9) {
			
			JOptionPane.showMessageDialog(null, "O sei imc e: " + imc);
		
		} else if (imc > 30.0 && imc > 30.4) {
			
			JOptionPane.showMessageDialog(null, "O sei imc e: " + imc);
		
		} else if (imc > 35.0 && imc > 39.9 ) {
			
			JOptionPane.showMessageDialog(null, "O sei imc e: " + imc);
		
		} else {
			
			JOptionPane.showMessageDialog(null, "O sei imc e: " + imc);			
		}
		
		
		
	}

}
