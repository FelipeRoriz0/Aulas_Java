package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int opcao;
		Cliente cliente;
		String nome, telefone, excluir;
		int idade;

		// Cria��o do array list
		List<Cliente> banco = new ArrayList<Cliente>();
		App app = new App();

		Scanner teclado = new Scanner(System.in);

		// inicio do loop
		do {
			System.out.println("-------Menu------");
			System.out.println("1 - Ler Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Media das idades");
			System.out.println("4 - Alterar cliente");
			System.out.println("5 - Excluir cliente");
			System.out.println("6 - Fim");
			System.out.println("-----------------");
			System.out.println("Digite uma op��o:");

			opcao = teclado.nextInt();

			// incluindo o cliente
			if (opcao == 1) {
				cliente = new Cliente();

				System.out.println("------------------");
				System.out.println("informe o nome do cliente");
				// colocando o nome cliente direto na class Cliente
				// cliente.setNome(teclado.nextLine());
				nome = teclado.next();

				System.out.println("Informe o telefone ");
				telefone = teclado.next();

				System.out.println("Qual a idade do cliente");
				idade = teclado.nextInt();

				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setTelefone(telefone);

				// Adicionando o cliente no banco de dados
				banco.add(cliente);

				// Listar Clientes
			} else if (opcao == 2)
				for (Cliente c : banco) {
					System.out.println(c.getNome() + " - " + c.getTelefone() + " - " + c.getIdade());
					// Calcular Media das idades
				}
			else if (opcao == 3) {
				System.out.println("A media das idades e: " + app.calcularMedia(banco));
			} else if (opcao == 4) {
				System.out.println();
			} else if (opcao == 5) {
				System.out.println("Qual  desejar deletar");
				nome = teclado.next();
				
				banco.remove(nome);

			}

		} while (opcao < 6);
		teclado.close();

	}

	public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0;
		for (Cliente c : lista) {
			// somaIdade = somaIdade + c.getIdade();
			somaIdade += c.getIdade();
		}

		return (somaIdade / lista.size());
	}

}
