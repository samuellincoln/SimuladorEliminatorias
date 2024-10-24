public class SimuladorEliminatorias {
	public static void main (String [] args) {
		TabelaEliminatorias tabela
			= new TabelaEliminatorias (
					new String [] {
							"Brasil", "Argentina", "Uruguai"
							, "Colombia", "Paraguai", "Peru"
							, "Bolivia", "Venezuela", "Chile"
					}
					, new String [] {"Equador"}
					, 3
			)
		;
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Paraguai 0 x 0 Peru "
						,"Colombia 1 x 0 Venezuela"
						, "Argentina 1 x 0 Equador"
						, "Uruguai 3 x 1 Chile"
						, "Brasil 5 x 1 Bolivia"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Bolivia 0 x 3 Argentina"
						, "Equador 2 x 1 Uruguai"
						, "Venezuela 1 x 0 Paraguai"
						, "Chile 0 x 0 Colombia"
						, "Peru 0 x 1 Brasil"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Colombia 2 x 2 Uruguai"
						, "Bolivia 1 x 2 Equador"
						, "Argentina 1 x 0 Paraguai"
						, "Chile 2 x 0 Peru"
						, "Brasil 1 x 1 Venezuela"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Venezuela 3 x 0 Chile"
						, "Paraguai 1 x 0 Bolivia"
						, "Equador 0 x 0 Colombia"
						, "Uruguai 2 x 0 Brasil"
						, "Peru 0 x 2 Argentina"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Bolivia 2 x 0 Peru"
						, "Venezuela 0 x 0 Equador"
						, "Colombia 2 x 1 Brasil"
						, "Argentina 0 x 2 Uruguai"
						, "Chile 0 x 0 Paraguai"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Paraguai 0 x 1 Colombia"
						, "Uruguai 3 x 0 Bolivia"
						, "Equador 1 x 0 Chile"
						, "Brasil 0 x 1 Argentina"
						, "Peru 1 x 1 Venezuela"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Bolivia 4 x 0 Venezuela"
						, "Argentina 3 x 0 Chile"
						, "Uruguai 0 x 0 Paraguai"
						, "Brasil 1 x 0 Equador"
						, "Peru 1 x 1 Colombia"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Colombia 2 x 1 Argentina"
						, "Chile 1 x 2 Bolivia"
						, "Equador 1 x 0 Peru"
						, "Venezuela 0 x 0 Uruguai"
						, "Paraguai 1 x 0 Brasil"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Bolivia 1 x 0 Colombia"
						, "Venezuela 1 x 1 Argentina"
						, "Equador 0 x 0 Paraguai"
						, "Chile 1 x 2 Brasil"
						, "Peru 1 x 0 Uruguai"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Colombia 4 x 0 Chile"
						, "Paraguai 2 x 1 Venezuela"
						, "Uruguai 0 x 0 Equador"
						, "Argentina 6 x 0 Bolivia"
						, "Brasil 4 x 0 Peru"
				})
			);
		//A PARTIR DE AGORA, SERAO SIMULACOES, E NÃO OS RESULTADOS REAIS 
		//DAS ELIMINATORIAS DA AMERICA DO SUL DE 2026
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Venezuela 1 x 2 Brasil"
						, "Equador 0 x 0 Bolivia"
						, "Paraguai 1 x 1 Argentina"
						, "Peru 1 x 0 Chile"
						, "Uruguai 3 x 2 Colombia"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Bolivia 1 x 1 Paraguai"
						, "Colombia 3 x 0 Equador"
						, "Argentina 4 x 0 Peru"
						, "Chile 1 x 1 Venezuela"
						, "Brasil 2 x 1 Uruguai"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Uruguai 1 x 1 Argentina"
						, "Peru 1 x 1 Bolivia"
						, "Brasil 1 x 1 Colombia"
						, "Paraguai 2 x 0 Chile"
						, "Equador 0 x 0 Venezuela"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Colombia 2 x 0 Paraguai"
						, "Venezuela 1 x 0 Peru"
						, "Bolivia 2 x 0 Uruguai"
						, "Argentina 2 x 1 Brasil"
						, "Chile 1 x 3 Equador"
				})
			);
		tabela.adicionarRodada (
				new Rodada (new String [] {
					"Colombia 2 x 0 Peru"
						, "Venezuela 1 x 1 Bolivia"
						, "Paraguai 2 x 0 Uruguai"
						, "Chile 0 x 3 Argentina"
						, "Equador 1 x 1 Brasil"
				})
			);
		
		System.out.println (tabela.toString());
	}
}