package amigo;

import java.util.Date;

public class Participante {
	private String nome;
	private String presente;
	private Date data;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPresente() {
		return presente;
	}
	public void setPresente(String presente) {
		this.presente = presente;
	}
	@Override
	public String toString() {
		return "O sorteado foi " + nome + " e o presente e " + presente + " e o seu nascimento e " + data;
	}
	
}
