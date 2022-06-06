package jogo;

public class Personagem implements Ataque, Defesa {

	@Override
	public String fogo() {
		return "Lança fogo";
	}

	@Override
	public String terra() {
		return "Lança Terra";
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
