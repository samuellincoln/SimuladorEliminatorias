import java.util.HashSet;

public class Rodada {
	private HashSet <Partida> partidas;
	private void init (HashSet <Partida> partidas) {
		this.partidas = partidas;
	}
	private void init2 (Partida [] partidas) {
		this.partidas = new HashSet <Partida> ();
		for (Partida p : partidas) {
			this.partidas.add (p);
		}
	}
	private void init3 (String [] partidas) {
		this.partidas = new HashSet <Partida> ();
		for (String p : partidas) {
			this.partidas.add (new Partida (p));
		}
	}
	public Rodada (HashSet <Partida> partidas) {
		init (partidas);
	}
	public Rodada (Partida [] partidas) {
		init2 (partidas);
	}
	public Rodada (String [] strpartidas) {
		Partida [] partidas = new Partida [strpartidas.length];
		for (int i = 0; i < strpartidas.length; i++) {
			partidas [i] = new Partida (strpartidas [i]);
		}
		init2 (partidas);
	}
	public Rodada (String rodada) {
		String [] strpartidas = rodada.split ("|");
		init3 (strpartidas);
	}
	public HashSet <Partida> getPartidas () {
		return this.partidas;
	}
}