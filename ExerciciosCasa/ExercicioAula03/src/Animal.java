
public class Animal {

	public static void main(String[] args) {

		Leao[] leaozinho = new Leao[5];

		Leao l1 = new Leao();
		Leao l2 = new Leao();
		Leao l3 = new Leao();
		Leao l4 = new Leao();
		Leao l5 = new Leao();

		leaozinho[0] = l1;
		leaozinho[1] = l2;
		leaozinho[2] = l3;
		leaozinho[3] = l4;
		leaozinho[4] = l5;

		l2.setcapturacor("Rosa");
		l3.setcapturacor("Vinho");
		l4.setcapturacor("Branco");
		l5.setcapturacor("Amarelo");
		l1.setcapturacor("Preto");
		
		leaozinho[2].dormir();
		
		for (Leao leoa : leaozinho) {
			System.out.println("A cor do Leao é " + leoa.getretornacor());
		}

	}

}
