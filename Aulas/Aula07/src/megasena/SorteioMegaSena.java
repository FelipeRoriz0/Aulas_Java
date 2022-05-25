package megasena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioMegaSena {

	public static void main(String[] args) {

		System.out.println("Mega Sena");

		Random sorteio = new Random();
		List<Integer> valores = new ArrayList<Integer>();

		int temp;

		for (int i = 0; i < 6; i++) {
			temp = sorteio.nextInt(60) + 1;

			if (valores.contains(temp)) {
				i--;
			} else {
				valores.add(temp);
			}
		}

		for (int valor : valores) {
			System.out.println(valor);
		}

	}
}
