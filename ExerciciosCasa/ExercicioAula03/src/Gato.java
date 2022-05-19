
public class Gato {
	private String cor;
	private int peso;
	private int tamanho;
	
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
	/// Metodos
	
	public void comer() {
		System.out.println("O gato esta comendo");
	}
	
	public void dormir() {
		System.out.println("O gato esta dormindo");
	}
	
	public void brincar() {
		System.out.println("O gato está brincando");
	}
	
	public void emitirSom() {
		System.out.println("MIAAUUUUUUU");
	}

}
