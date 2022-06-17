package app;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		int noite;
		double conta = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("---------HOTEL SÃO PATRÍCIO---------");
		System.out.println("Quantas noites irá ficar no nosso hotel?");
		noite = teclado.nextInt();

		for (int i = 1; i <= noite; i++) {
			conta += (100 / i);
		}

		System.out.print("Custo: R$" + conta);

		teclado.close();

	}
}
