package animais;

public class Animal {
	private double tamanho;
	private double peso;
	private String nome;
	private String cor;

	public double gettamanho() {
		return tamanho;

	}

	public void settamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getpeso() {
		return peso;
	}

	public void setpeso(double peso) {
		this.peso = peso;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getcor() {
		return cor;
	}

	public void setcor(String cor) {
		this.cor = cor;
	}

	public String comer() {
		return "ira comer";
	}

	public String dormir() {
		return "ira dormir";
	}

}
