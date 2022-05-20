
public class Animal {

	public static void main(String[] args) {

		// Leao[] leaozinho;
		// leaozinho = new Leao[5];

		Leao[] leaozinho = new Leao[2];

		Leao l0 = new Leao();
		Leao l1 = new Leao();

		leaozinho[0] = l0;
		leaozinho[1] = l1;

		l0.setcapturacor("Rosa");

		l1.setcapturacor("Preto");

		leaozinho[1].dormir();

		// System.out.println(l1.comer());

		for (Leao leoa : leaozinho) {
			System.out.println("A cor do Leao do " + leoa.getretornacor());
		}

		Gato[] miau = new Gato[3];

		Gato g1 = new Gato();
		Gato g2 = new Gato();

		miau[0] = g1;
		miau[1] = g2;

	}

}
