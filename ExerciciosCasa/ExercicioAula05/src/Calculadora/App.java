package Calculadora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		String operacao;
		double resultado;
		
		
		Scanner conta = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = conta.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		numero2 = conta.nextDouble();
		
		System.out.println("Qual Operacao voce deseja fazer (- + * / ");
		operacao = conta.next();
		
		System.out.println(numero1 + numero2);
		
		
	}

}
