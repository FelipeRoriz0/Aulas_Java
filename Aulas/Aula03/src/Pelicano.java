

public class Pelicano {
	private boolean bico;
	private String cor;
	private int peso;

	public String getcor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void voar() {
		if (peso > 50) {
			System.out.println("O pelicano nao consegue voar, esta muito pesado");
		} else {
			System.out.println("O pelicano esta voando!");
		}
	}

	public void comer() {
		System.out.println("O pelicano esta comendo");
	}

	public void definirNome(String nome) {
		System.out.println("O nome deste pelicano e " + nome);
	}

	public String retornarCor() {
		return cor;
	}
}
