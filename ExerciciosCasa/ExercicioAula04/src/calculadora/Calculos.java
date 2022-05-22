package calculadora;

public class Calculos {
	private double valor1;
	private double valor2;

	/// Encapsulamento (ATRIBUTOS)
	public void setreceberValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getretornaValor() {
		return valor1;
	}

	public void setreceberValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getreceberValor2() {
		return valor2;
	}

	/// METODOS
	public double somar(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
		return a + b;
	}

	public double multi() {
		return valor1 * valor2;
	}

	// public double divisao(double a, double b) {
	/// this.valor1 = a;
	/// this.valor2 = b;

	/// return a / b;
	// }

	public void divisao(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;
		
		if (b == 0) {
			System.out.println("Não pode");
		} else {
			System.out.println("O Resultado da Divisao e " + a / b);
		}
		
	}

	public double subtracao(double a, double b) {
		this.valor1 = a;
		this.valor2 = b;

		return a - b;

	}	
	
	/*public void valida() {
		if (valor1 && valor2 == 0) {
			System.out.println( "Não Pode" != null);
		}
	}*/

}
