package loja;

public class Cliente {
	private int idade;
	private String nome;
	private String telefone;
	private int classi;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getClassi() {
		return classi;
	}

	public void setClassi(int classi) {
		this.classi = classi;
	}

	@Override
	public String toString() {
		return nome + " tem  " + idade + " anos " + " Seu telefone e " + telefone;
	}

}
