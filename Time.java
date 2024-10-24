import java.util.HashSet;

public class Time {
	private String nome;
	private int pontos;
	private int vitorias;
	private int empates;
	private int derrotas;
	private int golspro;
	private int golscontra;
	public Time (String nome, int pointsless) {
		this.nome = nome;
		this.pontos = -pointsless;
		this.vitorias = 0;
		this.empates = 0;
		this.derrotas = 0;
		this.golspro = 0;
		this.golscontra = 0;
	}
	public Time (String nome) {
		this (nome, 0);
	}
	private void incluiPartida (Partida partida) {
		ExcecoesUtilitario.checkCondition (
				!partida.getMandante().equals (this.nome) && !partida.getVisitante().equals (this.nome)
				, "Partida invalida para incluir como resultado deste time"
		);
		int meusgols = partida.getMandante().equals (this.nome)? partida.getGolsmandante() : partida.getGolsvisitante();
		int golsdomeurival = partida.getMandante().equals (this.nome)? partida.getGolsvisitante() : partida.getGolsmandante();
		boolean venci = meusgols > golsdomeurival;
		boolean empatei = meusgols == golsdomeurival;
		this.adicionaGolscontra(golsdomeurival);
		this.adicionaGolspro(meusgols);
		if (venci) {
			this.pontos += 3;
			this.vitorias += 1;
		}
		else if (empatei) {
			this.pontos += 1;
			this.empates += 1;
		}
		else {
			this.derrotas += 1;
			//Nao faz nada
		}
	}
	public void incluiRodada (Rodada rodada) {
		HashSet <Partida> partidas = rodada.getPartidas();
		for (Partida p : partidas) {
			boolean cond = p.getMandante().equals (this.nome) || p.getVisitante().equals (this.nome);
			if (cond) {
				this.incluiPartida(p);
			}
		}
	}
	public int getPontos() {
		return pontos;
	}
	public int getVitorias() {
		return vitorias;
	}
	public int getEmpates() {
		return empates;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public int getGolspro() {
		return golspro;
	}
	public void adicionaGolspro (int x) {
		this.golspro = this.golspro + x;
	}
	public int getGolscontra() {
		return golscontra;
	}
	public void adicionaGolscontra (int x) {
		this.golscontra = this.golscontra + x;
	}
	public String getNome() {
		return nome;
	}
	public String toString () {
		return "(" + this.nome + ", " + this.pontos + " pontos, " + this.vitorias + " vitorias, " + this.empates + " empates, " + this.derrotas + " derrotas, " + this.golspro + " gols pro, " + this.golscontra + " gols contra)";
	}
}