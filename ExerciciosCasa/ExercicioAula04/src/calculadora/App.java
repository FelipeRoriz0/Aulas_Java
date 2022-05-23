package calculadora;

public class App {

	public static void main(String[] args) {
		double calculo = 0;

		Calculos contas = new Calculos();
		
		System.out.println(contas.somar());

		System.out.println("O Resultado da soma e " + contas.somar(100, 64));

		contas.setreceberValor1(5);

		contas.setreceberValor2(9);

		System.out.println("O Resultado da Multiplicacao e " + contas.multi());
		
		//System.out.println("O Resultado da Divisao e " + contas.divisao(9, 2));
		
		calculo = contas.divisao(6, 0);
		if (calculo == 0) {
			System.out.println("Não e Permitido usar 0 na divisao");
		} else {
			System.out.println("Dividir " + calculo);
		} 
		

		
		System.out.println("O Resultado da subtracao e " + contas.subtracao(2, 5));
		
		

	} 
	}
		
