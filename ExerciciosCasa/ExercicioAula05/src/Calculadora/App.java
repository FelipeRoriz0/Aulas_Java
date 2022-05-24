package Calculadora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double numero1, numero2;
		String operacao;
		String escolha;
		
		Calculos calculadora = new Calculos();
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = teclado.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		numero2 = teclado.nextDouble();
		
		do {
		System.out.println("Escolha uma das operacoes (+, -, *, /");
		
		operacao = teclado.next();
		
		if(operacao.equals("+") ) {
		System.out.println("A soma e: " + calculadora.somar(numero1, numero2));
		} else if(operacao.equals("-")) {
			System.out.println("A subtracao e " + calculadora.subtracao(numero1, numero2));
		} else if(operacao.equals("*")) {
			System.out.println("A multiplicao e " + calculadora.multi(numero1, numero2));
		} else {
			System.out.println("A divisao e: " + calculadora.divisao(numero1, numero2));
		}
		System.out.println("Deseja realizar outra operacao(S/N)");
		 escolha = teclado.next();
		} while(escolha.equals("S"));
		

	
		
		teclado.close();
		
		
	}

}
