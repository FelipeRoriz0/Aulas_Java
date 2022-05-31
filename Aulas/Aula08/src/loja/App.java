package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int respo;
		String nome, telefone, idade;
		Dependencias dp;
		boolean teste = true;

		List<Dependencias> clientes = new ArrayList<Dependencias>();
		Scanner teclado = new Scanner(System.in);

	//	do {
			System.out.println("1 - Ler Cliente - 2 - Listar Clientes - 3 - Fim");
			respo = teclado.nextInt();

			if (respo == 1) {
				dp = new Dependencias();

				System.out.println("Nome Cliente");
				nome = teclado.next();

				System.out.println("Qual o telefone");
				telefone = teclado.next();

				System.out.println("Qual a idade ?");
				idade = teclado.next();

				dp.setNome(nome);
				dp.setTelefone(telefone);
				dp.setIdade(idade);

				clientes.add(dp);

			} else if (respo == 2) {
				for (Dependencias temp : clientes) {
					System.out.println(temp.getNome());
				}

			}
		//} while ();
	}

}
