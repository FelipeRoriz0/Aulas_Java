package zoologico;

import animais.Gato;
import animais.Leao;

public class App {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Leao leao = new Leao();

		gato.setcapturaCor("Branco e Preto");
		gato.setcapturaPeso(30);
		gato.setcapturaTamanho(5);
		gato.setNome("Afonso");
		leao.dormir();

		System.out.println(gato.getNome() + " " + gato.dormir());

	}

}
