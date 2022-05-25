package amigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioAmigoOculto {

	public static void main(String[] args) {
		System.out.println("Amigo Oculto");

		Random posicao = new Random();
		List<String> amigo = new ArrayList<String>();
		amigo.add("Felipe");
		amigo.add("Arian");
		amigo.add("Bia");
		amigo.add("Danilo");
		amigo.add("Henrique");
		amigo.add("Joao");
		amigo.add("Matheus");

		System.out.println("O nome e " + amigo.get(posicao.nextInt(amigo.size())));

	}

}
