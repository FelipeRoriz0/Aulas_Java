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
			banco.add(tela.listarCliente(banco));
		} else if (opcao == 3) {
			// Calcular a média da idade
		} else if (opcao == 4) {
			// Alterar Cliente
		} else if (opcao == 5) {
			// Excluir Cliente
		} else if (opcao == 6) {
			// Classifique Clientes
		}
		else if (opcao == 7) {
			// Melhores Clientes
		}
	}
}
