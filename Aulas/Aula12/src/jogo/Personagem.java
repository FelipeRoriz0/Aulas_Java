package jogo;

public class Personagem implements Ataque, Defesa {

	@Override
	public String fogo() {
		return "Lan�a fogo";
	}

	@Override
	public String terra() {
		return "Lan�a Terra";
	}

	@Override
	public String defesaTerra() {
		return "Se defende ";
	}

	@Override
	public String defesaFogo() {
		return "";
	}

}
