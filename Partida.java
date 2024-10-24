public class Partida {
	private String mandante;
	private int golsmandante;
	private String visitante;
	private int golsvisitante;
	private void init (String mandante, int golsmandante, int golsvisitante, String visitante) {
		this.mandante = mandante;
		this.visitante = visitante;
		this.golsmandante = golsmandante;
		this.golsvisitante = golsvisitante;
	}
	public Partida (String mandante, int golsmandante, int golsvisitante, String visitante) {
		init (mandante, golsmandante, golsvisitante, visitante);
	}
	public Partida (String partida) {
		String [] tokens = partida.split (" ");
		ExcecoesUtilitario.checkCondition(tokens.length != 5, "Formato inesperado para String de partida");
		String mandante = tokens [0];
		int golsmandante = Integer.parseInt (tokens [1]);
		int golsvisitante = Integer.parseInt (tokens [3]);
		String visitante = tokens [4];
		init (mandante, golsmandante, golsvisitante, visitante);
	}
	public String getMandante() {
		return mandante;
	}
	public void setMandante(String mandante) {
		this.mandante = mandante;
	}
	public String getVisitante() {
		return visitante;
	}
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	public int getGolsmandante() {
		return golsmandante;
	}
	public void setGolsmandante(int golsmandante) {
		this.golsmandante = golsmandante;
	}
	public int getGolsvisitante() {
		return golsvisitante;
	}
	public void setGolsvisitante(int golsvisitante) {
		this.golsvisitante = golsvisitante;
	}
}