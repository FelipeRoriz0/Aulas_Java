package animais;

public class Gato {
	private String cor;
	private int peso;
	private int tamanho;
	private String nome;

	public String getretornaCor() {
		return cor;
	}

	public void setcapturaCor(String cor) {
		this.cor = cor;
	}

	public int getretornaTamanho() {
		return tamanho;
	}

	public void setcapturaTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getretornaPeso() {
		return peso;
	}

	public void setcapturaPeso(int peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/// Metodos


	public String comer() {
		return "O gato está comendo...";
	}

	public String dormir() {
		return "O gato esta dormindo";
	}

	public String brincar() {
		return "O gato esta brincando";
	}

	public String emitirSom() {
		return "MIAAUUUUUUU";
	}

}
