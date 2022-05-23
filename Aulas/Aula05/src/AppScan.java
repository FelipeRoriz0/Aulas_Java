import java.util.Scanner;

public class AppScan {

	public static void main(String[] args) {
		int numeroLido;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite Um numero: ");
		numeroLido = teclado.nextInt();

		
		System.out.println("O valor digitado foi: " + numeroLido);
		
	}

}
