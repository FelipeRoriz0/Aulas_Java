package amigo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoOculto {

	public static void main(String[] args) throws ParseException {
		int numeroParticipantes;
		String nome, continua, presente, nasc;
		Participante participante;

		Scanner teclado = new Scanner(System.in);

		List<Participante> nomes = new ArrayList<Participante>();
		Random posicao = new Random();
				

		System.out.println("Quantas pessoas no sorteio ?");
		numeroParticipantes = teclado.nextInt();

		for (int i = 0; i < numeroParticipantes; i++) {
			participante = new Participante();

			System.out.println("Digite o nome do participante" + ( i + 1));
			nome = teclado.next();

			System.out.println("Qual presente você quer ?");
			presente = teclado.next();
			
			System.out.println("Qual o nascimento ?");
			nasc = teclado.next();
			
			participante.setNome(nome);
			participante.setPresente(presente);
			
			// Criando e convertendo um data
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			
			participante.setData(formato.parse(nasc));
	
			nomes.add(participante);

		}

		System.out.println("Deseja fazer o sorteio agora? S/N");
		continua = teclado.next();

		if (continua.equals("S")) {
			/*System.out.println("O nome sorteado e " + nomes.get(posicao.nextInt(nomes.size())).getNome() + " presente "
					+ nomes.get(posicao.nextInt(nomes.size())).getPresente());
					
			*/
			
			System.out.println(nomes.get(posicao.nextInt(nomes.size())));
		} else {
			System.out.println("O sorteio foi cancelado");
		}

	}

}
