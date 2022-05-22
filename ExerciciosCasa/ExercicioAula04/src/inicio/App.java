package inicio;

import animais.Cachorro;
import animais.Gato;

public class App {

	public static void main(String[] args) {

		Gato miau = new Gato();
		Cachorro auau = new Cachorro();

		miau.setcor("Azul");
		miau.setnome("Ted");
		miau.setpeso(50);
		miau.settamanho(20);
		auau.setnome("Afonsinho");

		System.out.println("O nome do gato e " + miau.getnome() + " e o peso do dele e " + miau.getpeso() + " e faz "
				+ miau.emitirSom());
		
		System.out.println("O Nome do cachorro e " + auau.getnome() + " ele esta "+ auau.brincar() + " e faz " + auau.emitirSom());

	}

}
