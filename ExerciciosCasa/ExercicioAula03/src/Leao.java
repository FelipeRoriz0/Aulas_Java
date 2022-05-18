
public class Leao {
	private String cor;
	private int tamanho;
	private int peso;
	
	public String getretornacor() {
		return cor;
	}
	
	public void setcapturacor(String cor) {
		this.cor = cor;
	}
	
	public int getretornaTamanho() {
		return tamanho; 
	}
	
	public void setcapturaTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void dormir() {
		System.out.println("O leao esta com sono e ira dormir");
	}
	
	public void comer() {
		System.out.println("O leao esta com fome ele ira comer, Cuidado!");
	}
	
	public void emitirSom() {
		if (tamanho > 200) {
			System.out.println("BRRUMMMMM");
		} else if (tamanho > 100) {
			System.out.println(" GRRAURRRR");
		} else {
			System.out.println("ROARRR");
		}
	}

}
