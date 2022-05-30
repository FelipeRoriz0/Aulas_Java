package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import amigo.Participante;

public class App {

	public static void main(String[] args) {
		String nome, telefone, idade;
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = 3;
		int respo;

		List<String> Clientes = new ArrayList<String>();

		System.out.println("1 - Ler Cliente");
		System.out.println("2 - Listar Clientes");
		System.out.println("3 - Fim");

		Scanner teclado = new Scanner(System.in);
		respo = teclado.nextInt();

		if (respo == 1) {
			System.out.println("Nome Cliente");
			nome = teclado.next();

			Clientes.add(nome);

		}

	}

}
