package calculadora;

public class App {

	public static void main(String[] args) {

		Calculos contas = new Calculos();

		System.out.println("O Resultado da soma e " + contas.somar(100, 64));

		contas.setreceberValor1(5);

		contas.setreceberValor2(9);

		System.out.println("O Resultado da Multiplicacao e " + contas.multi());
		
		//System.out.println("O Resultado da Divisao e " + contas.divisao(9, 2));
		
		contas.divisao(3,0);

		System.out.println("O Resultado da subtracao e " + contas.subtracao(2, 5));

	}

}
