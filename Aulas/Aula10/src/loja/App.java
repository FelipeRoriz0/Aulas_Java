package loja;

import java.util.Scanner;

import controle.Controle;
import visao.Menu;
import visao.Tela;

public class App {
	public static void main(String[] args) {
		int opcao;

		Scanner teclado = new Scanner(System.in);

		Menu menu = new Menu();
		Controle controle = new Controle();
		Tela tela = new Tela();

		// inicio do loop
		do {
			menu.desenharMenu();
			opcao = teclado.nextInt();
			
			controle.avaliarOpcao(opcao);
		} while (opcao < 8);

		teclado.close();

	}

}
