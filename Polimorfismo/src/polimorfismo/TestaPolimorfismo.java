package polimorfismo;

import javax.swing.JOptionPane;

public class TestaPolimorfismo extends Aluno {

	public static void main(String [] args) {
		pessoa p = new pessoa("Anakin Skywalker","CPF de Pessoa");
		mostraDados(p);
		
		Aluno a = new Aluno("Yoda","CPF de Pessoa", "ra");
		mostraDados(a);
	}
	
	private static void mostraDados(pessoa pessoa) {
		JOptionPane.showMessageDialog(null, pessoa.toString());
	}
}
