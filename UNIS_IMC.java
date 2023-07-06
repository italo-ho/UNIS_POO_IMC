package unis_imc;

import javax.swing.JOptionPane;

public class Imc {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Digite seu peso: ");
    double peso = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Digite sua altura: ");
    double altura = Double.parseDouble(input);

    double imc = peso / (altura * altura);

    if (imc < 19) {
		  JOptionPane.showMessageDialog(null, "Seu IMC está abaixo do peso ideal: " + imc);
		} else if (imc >= 19 && imc < 26) {
			JOptionPane.showMessageDialog(null, "Seu IMC está dentro do peso ideal: " + imc);
		} else {
			JOptionPane.showMessageDialog(null, "Seu IMC está acima do peso ideal: " + imc);
		}
	}
}
