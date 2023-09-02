package polimorfismo;

public class Aluno extends pessoa{
	//Atributos
	public String ra;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	
	//Construtores
	public Aluno() {
		super();
		setRa("Sem RA");
	}
	
	public Aluno (String nome, String cpf, String ra) {
		super(nome, cpf);
		setRa(ra);
	}
	
	//Métodos
	@Override
	public String toString() {
		String mensagem = super.toString();
		mensagem += "\nRA: " + getRa();
		return mensagem;
	}
}
