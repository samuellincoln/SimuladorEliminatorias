import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collectors;

public class TabelaEliminatorias {
	private HashSet <Time> times;
	private HashSet <Rodada> rodadas;
	private ArrayList <Time> classificacao;
	private void init (HashSet <Time> times) {
		this.times = times;
		this.rodadas = new HashSet <Rodada> ();
		this.classificacao = new ArrayList <Time> ();
	}
	public TabelaEliminatorias (HashSet <Time> times) {
		init (times);
	}
	public TabelaEliminatorias (String [] nomestimes, String [] penalizados, int penalty) {
		HashSet <Time> times = new HashSet <Time> ();
		for (String nome : nomestimes) {
			times.add(new Time (nome));
		}
		for (String nome : penalizados) {
			times.add (new Time (nome, penalty));
		}
		init (times);
	}
	public TabelaEliminatorias (String [] nomestimes) {
		this (nomestimes, new String [] {}, 0);
	}
	public HashSet <Rodada> getRodadas() {
		return rodadas;
	}
	public void adicionarRodada (Rodada rodada) {
		this.rodadas.add(rodada);
		this.times.forEach(t -> t.incluiRodada(rodada));
	}
	private void montaClassificacao () {
		this.classificacao = (ArrayList <Time>)
			this.times.stream().sorted (
				(t1, t2) -> {
					int comparePontos = Integer.compare (t2.getPontos(), t1.getPontos ());
					if (comparePontos == 0) {
						int compareSaldogols = Integer.compare (t2.getGolspro() - t2.getGolscontra(), t1.getGolspro() - t1.getGolscontra());
						if (compareSaldogols == 0) {
							int compareVitorias = Integer.compare (t2.getVitorias(), t1.getVitorias ());
							if (compareVitorias == 0) {
								int compareGolspro = Integer.compare (t2.getGolspro(), t1.getGolspro());
								return compareGolspro;
							}
							return compareVitorias;
						}
						return compareSaldogols;
					}
					return comparePontos;
				}
			).collect (Collectors.toList())
		;
	}
	public String toString () {
		this.montaClassificacao();
		String str = "";
		for (Time time : this.classificacao) {
			str += time.toString() + "\n";
		}
		return str;
	}
}