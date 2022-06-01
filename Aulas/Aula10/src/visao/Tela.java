package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import util.Util;

public class Tela {
	String nome, telefone;
	int idade, avali;
	Scanner teclado = new Scanner(System.in);
	Cliente cliente = new Cliente();

	public Cliente desenharIncluir() {

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

		return cliente;
	}

	public Cliente listarCliente(List<Cliente> banco) {
		// Listar Clientes
		for (Cliente c : banco) {
			System.out.println(banco.indexOf(c) + " - " + c.getTelefone() + " - " + c.getIdade());
			// Calcular Media das idades

		}

		return cliente;
	}

	public void exbirMedia(List<Cliente> banco) {
		Util util = new Util();

		System.out.println("A media das idades e: " + util.calcularMedia(banco));

	}

	public void alteraCliente(List<Cliente> banco) {
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
	}

	public void excluirCliente(List<Cliente> banco) {
		System.out.println("Quem voce desejar deletar");
		banco.remove(teclado.nextInt());
	}

	public void classificaCliente(List<Cliente> banco) {
		System.out.println("Quem voce deseja classificar ?");
		int a = teclado.nextInt();

		Cliente classificao = banco.get(a);

		System.out.println(banco.get(a));

		System.out.println("Qual e a classificacao do " + banco.get(a) + " 1 ao 5");
		avali = teclado.nextInt();

		classificao.setClassi(avali);
	}

	public void melhorCliente(List<Cliente> banco) {
		for (Cliente cla : banco) {
			if (cla.getClassi() > 4) {
				System.out.println("Melhor cliente " + cla.getNome());

			}

		}
	}

}
