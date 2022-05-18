package Animal;

public class Cachorro {
	int peso;
	int tamanho;
	private String cor;
	
	//Declarando Variavel Atraves do proprio metodo
	public void nomecachorro(String nome) {
		System.out.println("O nome desse cachorrinho e " + nome);
		
	}

	// Encapsulamento
	// Getter(Captura)
	public String getmostraCor() {
		return cor;
	}
	
	//Setter(de configuracao)
	//public void setchamaCor(String cor) {
	//this.cor = cor;
	//}

	 //Setter (de configuracao)
	public void setchamaCor(String corzao) {
		cor = corzao;
	}

	// Outra forma de retornar cor
	public String iraRetornaraCor() {
		return cor;
	}

	// Metodo emitir som muda conforme o tamanho do cachoro
	public void emitirSom() {
		if (tamanho > 80) {
			System.out.println("RUFF RUFF!");
		} else if (tamanho > 60) {
			System.out.println("WooF WooF! ");
		} else {
			System.out.println("hif hif!");
		}
	}

	public void comer() {
		System.out.println("O cachorro esta comendo");
	}

	public void dormir() {
		System.out.println("O cachorro esta dormindo");
	}

}
