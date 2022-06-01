package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int opcao, estrela;
		Cliente cliente;
		String nome, telefone, excluir;
		int idade;
		int avali;

		// Criacao do array list
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
			System.out.println("6 - Classifique cliente");
			System.out.println("7 - Melhores Clientes");
			System.out.println("8 - F I M ");
			System.out.println("-----------------");
			System.out.println("Digite uma opcao:");

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

				System.out.println("Quem voce deseja alterar ?");
				int i = teclado.nextInt();

				Cliente alteraCliente = banco.get(i);

				System.out.println("Digite o novo nome");
				nome = teclado.next();

				System.out.println("Digite o nome telefone");
				telefone = teclado.next();

				System.out.println("Digite a idade");
				idade = teclado.nextInt();

				alteraCliente.setNome(nome);
				alteraCliente.setTelefone(telefone);
				alteraCliente.setIdade(idade);

			} else if (opcao == 5) {
				System.out.println("Quem voce desejar deletar");
				banco.remove(teclado.nextInt());

			} else if (opcao == 6) {

				System.out.println("Quem voce deseja classificar ?");
				int a = teclado.nextInt();

				Cliente classificao = banco.get(a);

				System.out.println(banco.get(a));

				System.out.println("Qual e a classificacao do " + banco.get(a) + " 1 ao 5");
				avali = teclado.nextInt();

				classificao.setClassi(avali);

			}

			else if (opcao == 7) {
				for (Cliente cla : banco) {
					if (cla.getClassi() > 4) {
						System.out.println("Melhor cliente " + cla.getNome());

					}

				}
			}

		} while (opcao < 8);
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
