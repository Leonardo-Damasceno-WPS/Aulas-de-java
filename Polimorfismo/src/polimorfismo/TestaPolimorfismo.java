package polimorfismo;

import javax.swing.JOptionPane;

public class TestaPolimorfismo extends Aluno {

	public static void main(String [] args) {
		pessoa p = new pessoa("Anakin Skywalker","CPF de Pessoa");
		mostraDados(p);
	}
	
	private static void mostraDados(pessoa pessoa) {
		JOptionPane.showMessageDialog(null, pessoa.toString());
	}
}
