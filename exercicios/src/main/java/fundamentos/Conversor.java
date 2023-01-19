package fundamentos;

import javax.swing.JOptionPane;

public class Conversor {
	public static void main(String[] args) {
		final double DIV = 5.0/9.0;
		final int AJUSTE = 32;
		double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura"));
		double convertendo = (fahrenheit - AJUSTE) * DIV;
		System.out.println(convertendo + "�C");
	}
}
