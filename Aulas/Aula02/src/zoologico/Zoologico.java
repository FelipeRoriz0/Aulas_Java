package zoologico;

public class Zoologico {

	public static void main(String[] args) {
		Pelicano p1;

		p1 = new Pelicano();

		p1.voar();

		p1.setCor("Branco");
		p1.setPeso(80);

		p1.voar();
		p1.definirNome("Felipe");

		System.out.println("O pelicano p1 e " + p1.getcor());

		System.out.println("Outro forma de retornar a cor " + p1.retornarCor());

		System.out.println("O peso do pelicano p1 e " + p1.getPeso());
	}

}
