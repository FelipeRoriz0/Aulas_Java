package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import visao.Tela;

public class Controle {
	List<Cliente> banco = new ArrayList<Cliente>();

	Tela tela = new Tela();

	public void avaliarOpcao(int opcao) {
		// incluindo o cliente
		if (opcao == 1) {

			// Adicionando o cliente no banco de dados
			banco.add(tela.desenharIncluir());

		} else if (opcao == 2) {
			// Listar Clientes
			tela.listarCliente(banco);
		} else if (opcao == 3) {
			// Calcular a m�dia da idade
			tela.exbirMedia(banco);
		} else if (opcao == 4) {
			// Alterar Cliente
			tela.alteraCliente(banco);
		} else if (opcao == 5) {
			// Excluir Cliente
			tela.excluirCliente(banco);
		} else if (opcao == 6) {
			// Classifique Clientes
			tela.classificaCliente(banco);
		}
		else if (opcao == 7) {
			// Melhores Clientes
			tela.melhorCliente(banco);
		}
	}
}
