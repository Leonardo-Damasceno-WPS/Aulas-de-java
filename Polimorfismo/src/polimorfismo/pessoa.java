package polimorfismo;

public class pessoa {
	//Atributos
	private String nome;
	private String cpf;

	//Métodos Acessores
	public String getNome()
	{
		return nome;		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF()
	{
		return cpf;		
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	//Construtores
	public pessoa() {
		setNome("João Ninguém");
		setCPF("Sem CPF");
	}
	
	//Sobrecarga de construtor
	public pessoa(String nome, String cpf) {
		setNome(nome);
		setCPF(cpf);
	}
	
	//Sobrescrita do método toString
	@Override //Compila para checar se tem um método herdado
	public String toString() {//deixar o toString com o "T" maiúsculo pode causar problemas na superclasse
		String mensagem = this.getClass().toString();
		mensagem += "\nNome: " + getNome() +
				"\nCPF: " + getCPF();
		
		return mensagem;
	}
}
