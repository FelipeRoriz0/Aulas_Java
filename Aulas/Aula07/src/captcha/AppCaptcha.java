package captcha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppCaptcha {

	public static void main(String[] args) {
		String entrada;
		String captcha ;
		boolean continua = true;
		Scanner teclado = new Scanner(System.in);
		AppCaptcha app = new AppCaptcha();
		do {
			
		captcha = app.gerarCaptcha();
			
		System.out.println("--------");
		System.out.println(captcha);
		System.out.println("Digite o codigo acima: ");
		entrada = teclado.next();
		if(captcha.equals(entrada)) {
			System.out.println("Parabens ! Voce nao e um robo!");
			continua = false;
		}else {
			//System.out.println("Robos nao sao permitidios");
		}
		} while (continua);
		
		teclado.close();
	}
	
	public String gerarCaptcha() {
		String captcha = "";
		int valor;
			
		List<String> urna = new ArrayList<String>();
		urna.add("A");
		urna.add("B");
		urna.add("C");
		urna.add("D");
		urna.add("E");
		urna.add("F");
		urna.add("G");
		urna.add("H");
		urna.add("I");
		urna.add("J");
		urna.add("K");
		urna.add("L");
		urna.add("M");
		
		
		Random sorteio = new Random();
		
		for (int i = 0; i < 6; i++) {
			valor = sorteio.nextInt(urna.size());
			captcha += urna.get(valor);
		//captcha = String.valueOf(sorteio.nextInt(10));
		
	}
		return captcha;
}
}
