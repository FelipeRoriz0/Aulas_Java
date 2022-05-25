package Desafio;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int tec;
		int temp;

		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();

		tec = 0;
		temp = 1;
		
		//if (tec != temp) {
			while (tec != temp) {
				System.out.println("Digite o numero a seguir: ");

				temp = gerador.nextInt(999999) + 1 ;
				System.out.println(temp);

				tec = teclado.nextInt();

				//System.out.println("Digite a palavra a cima");
			}System.out.println("FOI!");
		//} else {
			//System.out.println("AFONSO");
		}

	}

//}
