package Animal;

public class Animal {

	public static void main(String[] args) {
		Cachorro c1, c2, c3;

		c1 = new Cachorro();
		c2 = new Cachorro();
		c3 = new Cachorro();

		c1.emitirSom();

		c3.dormir();

		// Não Funciona
		// System.out.println(c1.emitirSom());

		// Chamando o metodo nomecachorro()
		c1.nomecachorro("Afosinho");

		c1.comer();

		c1.tamanho = 100;
		c1.emitirSom();

		// Mostrando a cor por encapsulamento
		c2.setchamaCor("Esverdeada");
		c1.setchamaCor("Preta");

		// Mostrando sem encapsulamento
		// c2.cor = "Azul";
		// System.out.println(c2.cor);

		System.out.println("A cor do cachorro c2 e " + c2.getmostraCor());

		System.out.println("A cor do cachorro c1 e " + c1.iraRetornaraCor());

	}

}
