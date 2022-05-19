
public class AppString {

	public static void main(String[] args) {

		//String item = "Frio";
		//String item2 = "Frio";
		//String resu = "Congelado";
		//if (item  == item2) {
		//System.out.println(resu);
		//}
		
		//Pelicano[] filhotes;
		//filhotes = new Pelicano[3];
		
		Pelicano[] filhotes = new Pelicano[3];
		
		Pelicano p1 = new Pelicano();
		Pelicano p2 = new Pelicano();
		
		p1.setCor("Azul");
		p2.setCor("Marrom");

		filhotes[0] = p1;
		filhotes[1] = p2;
		filhotes[2] = new Pelicano();
		filhotes[2].setPeso(50);
		filhotes[2].setCor("Verde");

		
		System.out.println(filhotes[0].getcor());
		System.out.println(filhotes[2].getPeso());
		filhotes[2].voar();
		
		for(Pelicano exemplo: filhotes) {
			System.out.println("O pelicano tem a cor :" + exemplo.getcor());
		}
	}
}
