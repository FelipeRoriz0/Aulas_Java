import java.util.ArrayList;
import java.util.List;

/*
 * Demonstração do uso de ArrayList
 */
public class App {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Felipe");
		lista.add("Danilo");
		lista.add("Beatriz");
		
		
		for(String temp: lista) {
			System.out.println(temp);
		}
		
		//Procurando Beatriz
		System.out.println("O Array tem " + lista.size() + " elementos");
		System.out.println(lista.contains("Beatriz"));
		System.out.println("O Valor está no indice " + lista.indexOf("Felipe"));
		System.out.println("O conteudo do indice 2 e " + lista.get(2));
	}

}
