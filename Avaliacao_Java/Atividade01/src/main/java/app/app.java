package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		Integer tabu = 2;
		Integer resul = 0;		
		List<Integer>tabuada = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			 resul = tabu * +i;
			 tabuada.add(resul);
		}

		System.out.print(tabuada);

	}
}
