package Desafio;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String tec;
		String temp;
		
		Scanner teclado = new Scanner(System.in);
		
		temp = "Casa";
		
		System.out.println(temp);
		
		do {
		System.out.println("Digite a palavra a cima");
		tec = teclado.next();
		
		if (tec.equals("Casa") ) {
			
			System.out.println (temp);
		}
		}while(tec.equals(""));
		}
	
	}

			
		
