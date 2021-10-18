package ProjetoAdote;

import java.util.ArrayList;
import java.util.Scanner;

public class adote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARAÇÃO DE VARIAVEIS
		Scanner input = new Scanner(System.in);
		int animal;
		String cast;
		String sexo;
		String ambc = null;
		String amba = null;
		String porte;
		int qtd = 0;
		int op;
		int aj = 0;

		// OBJETOS
		// Conter info dos animais cadastrados no sistema
		cachorroegato cachorro1 = new cachorroegato("CACHORRO", "Bini", "Macho", "Castrado", "Vacinado", "Sim", "Não",
				"Marrom", "Dobermann", "Grande");
		cachorroegato cachorro2 = new cachorroegato("CACHORRO", "Amelia", "Femea", "Não Castrado", "Vacinado", "Sim",
				"Não", "Preto", "Viralata", "Pequeno");
		cachorroegato cachorro3 = new cachorroegato("CACHORRO", "Claudinho", "Macho", " Não Castrado", "Não Vacinado",
				"Não", "Sim", "Branco/Preto", "Dalmata", "Pequeno");
		cachorroegato cachorro4 = new cachorroegato("CACHORRO", "Estrela", "Femea", "Castrado", "Não Vacinado", "Sim",
				"Não", "Branco", "Viralata", "Grande");

		cachorroegato gato1 = new cachorroegato("GATO", "Gio", "Macho", "Castrado", "Vacinado", "Sim", "Não", "Branco",
				"Viralata", "Grande");
		cachorroegato gato2 = new cachorroegato("GATO", "Shie", "Femea", "Não Castrado", "Vacinado", "Não", "Não",
				"Listrado", "Viralata", "Pequeno");
		cachorroegato gato3 = new cachorroegato("GATO", "Andreia", "Femea", "Castrado", "Não Vacinado", "Não", "Sim",
				"Marrom", "Viralata", "Grande");
		cachorroegato gato4 = new cachorroegato("GATO", "Kevin", "Macho", "Não Castrado", "Não Vacinado", "Não", "Não",
				"Preto", "Viralata", "Grande");

		// ARRAYLIST
		// Separa os objetos do tipo gato e cachorro
		ArrayList<cachorroegato> cachorros = new ArrayList<>();
		ArrayList<cachorroegato> gatos = new ArrayList<>();
		// ADICIONAMENTO OBJETOS DENTRO DO ARRAYLIST
		cachorros.add(cachorro1);
		cachorros.add(cachorro2);
		cachorros.add(cachorro3);
		cachorros.add(cachorro4);

		gatos.add(gato1);
		gatos.add(gato2);
		gatos.add(gato3);
		gatos.add(gato4);

		System.out.println("==================================================================================");
		System.out.println("==========================BEM-VINDE À <VIRALA-TÁ/>!!!=============================");
		System.out.println("==================================================================================\n\n");
		System.out.println("Você deseja adotar Cachorro ou Gato?\n");
		System.out.println("(1)CACHORRO\n");
		System.out.println("(2)GATO\n");
		System.out.println("Opção: ");
		animal = input.nextInt();

		switch (animal) {
		case 1: // CACHORROS
			// IMPRIME LISTA DE CACHORROS DISPONÍVEIS
			System.out.println("\n\nLista de Cachorrinhos para adoção: ");
			for (int i = 0; i < cachorros.size(); i++) {
				System.out.println("id = " + i + " // " + cachorros.get(i));
				System.out.println("\n-----------------------------------");
			}
			System.out.println("\n-----------------------------------");
			System.out.println("\n\nDeseja adotar quantos?");
			qtd = input.nextInt();
			String aq1[] = new String[qtd];
			// FILTRAR LISTA POR CARACTERISTICAS ESPECIFICAS
			System.out.println("\nDeseja filtrar por caracteristicas?");
			System.out.println("\n-----------------------------------");
			System.out.println("\n(1) SIM");
			System.out.println("\n(2) NãO");
			System.out.println("\nOPÇÃO:");
			op = input.nextInt();
			System.out.println("\n-----------------------------------");

			switch (op) {
			case 1:

				for (int i = 0; qtd != i; i++) {
					System.out.println("\nFiltrar se esta castrado?");
					System.out.println("Sim = 1");
					System.out.println("Não = 0");
					int r = input.nextInt();

					switch (r) {
					case 0 -> cast = "Não Castrado";
					case 1 -> cast = "Castrado";
					default -> throw new IllegalStateException("Unexpected value: " + r);
					}

					System.out.println("Macho = 1");
					System.out.println("Femea = 2");
					int s = input.nextInt();
					switch (s) {
					case 1 -> sexo = "Macho";
					case 2 -> sexo = "Femea";
					default -> throw new IllegalStateException("Unexpected value: " + s);
					}

					System.out.println("Preferencialmente o cachorro seria bom para viver em que ambiente?");
					System.out.println("Apto = 0");
					System.out.println("Casa = 1");
					System.out.println("Ambos = 2");
					int a = input.nextInt();
					if (a == 0) {
						ambc = "Não";
						amba = "Sim";
					} else if (a == 1) {
						ambc = "Sim";
						amba = "Não";
					} else if (a == 2) {
						amba = "Sim";
						ambc = "Sim";
					}

					System.out.println("Preferencialmente o cachorro seria de qual Porte?");
					System.out.println("Pequeno = 0");
					System.out.println("Grande = 1");
					System.out.println("Medio = 2");
					int c = input.nextInt();
					switch (c) {
					case 0 -> porte = "Pequeno";
					case 1 -> porte = "Grande";
					case 2 -> porte = "Medio";
					default -> throw new IllegalStateException("Unexpected value: " + c);
					}

					// ANALISE DAS CARACTERISTICAS SELECIONADAS PELO USUARIO
					for (int h = 0; h < cachorros.size(); h++) {

						if (cachorros.get(h).castrado == cast && cachorros.get(h).sexo == sexo
								&& cachorros.get(h).porte == porte && cachorros.get(h).Apto == amba
								&& cachorros.get(h).Casa == ambc) {
							System.out.println(cachorros.get(h));
							aq1[aj] = cachorros.get(h).nome;
							aj++;
						}

					}
					if (aq1[0] == null) {
						System.out.println("Características não correspondem...");
					} else {
						for (int k = 0; k < qtd; k++) {
							System.out.println("Parabens voce adotou os cachorros " + aq1[k]);
						}
					}
				}
				break;

			case 2:
				for (int jj = 0; jj < qtd; jj++) {
					System.out.println("Qual doguinho deseja adotar");
					System.out.println("Por favor insira o Id Do cachorro a ser Adotado.");
					int nomedog = input.nextInt();
					for (int l = 0; l < cachorros.size(); l++) {
						if (nomedog == l) {
							aq1[aj] = cachorros.get(l).nome;
							aj++;

						}
					}
				}
				for (int o = 0; o < qtd; o++)
					System.out
							.println("Parabéns aos Envolvidos agora o(s) " + aq1[o] + " Tera um novo lar! o seu Lar!");
				break;

			}

			break;

		case 2:// GATOS
				// IMPRIME LISTA DE GATOS DISPONÍVEIS
			System.out.println("\n\nLista de Gatinhos para adoção: ");
			for (int i = 0; i < gatos.size(); i++) {
				System.out.println("id = " + i + " // " + gatos.get(i));
				System.out.println("\n-----------------------------------");
			}
			System.out.println("\n-----------------------------------");
			System.out.println("\n\nDeseja adotar quantos?");
			qtd = input.nextInt();
			String aq2[] = new String[qtd];
			// FILTRAR LISTA POR CARACTERISTICAS ESPECIFICAS
			System.out.println("\nDeseja filtrar por caracteristicas?");
			System.out.println("\n-----------------------------------");
			System.out.println("\n(1) SIM");
			System.out.println("\n(2) NãO");
			System.out.println("\nOPÇÃO:");
			op = input.nextInt();
			System.out.println("\n-----------------------------------");

			switch (op) {
			case 1:

				for (int i = 0; qtd != i; i++) {
					System.out.println("\nFiltrar se esta castrado?");
					System.out.println("Sim = 1");
					System.out.println("Não = 0");
					int r = input.nextInt();

					switch (r) {
					case 0 -> cast = "Não Castrado";
					case 1 -> cast = "Castrado";
					default -> throw new IllegalStateException("Unexpected value: " + r);
					}

					System.out.println("Macho = 1");
					System.out.println("Femea = 2");
					int s = input.nextInt();
					switch (s) {
					case 1 -> sexo = "Macho";
					case 2 -> sexo = "Femea";
					default -> throw new IllegalStateException("Unexpected value: " + s);
					}

					System.out.println("Preferencialmente o gatinho seria bom para viver em qual ambiente?");
					System.out.println("Apto = 0");
					System.out.println("Casa = 1");
					System.out.println("Ambos = 2");
					int a = input.nextInt();
					if (a == 0) {
						ambc = "Não";
						amba = "Sim";
					} else if (a == 1) {
						ambc = "Sim";
						amba = "Não";
					} else if (a == 2) {
						amba = "Sim";
						ambc = "Sim";
					}

					System.out.println("Preferencialmente o gato seria de qual Porte?");
					System.out.println("Pequeno = 0");
					System.out.println("Grande = 1");
					System.out.println("Medio = 2");
					int c = input.nextInt();
					switch (c) {
					case 0 -> porte = "Pequeno";
					case 1 -> porte = "Grande";
					case 2 -> porte = "Medio";
					default -> throw new IllegalStateException("Unexpected value: " + c);
					}

					// ANALISE DAS CARACTERISTICAS SELECIONADAS PELO USUARIO
					for (int h = 0; h < gatos.size(); h++) {

						if (gatos.get(h).castrado == cast && gatos.get(h).sexo == sexo && gatos.get(h).porte == porte
								&& gatos.get(h).Apto == amba && gatos.get(h).Casa == ambc) {
							System.out.println(gatos.get(h));
							aq2[aj] = gatos.get(h).nome;
							aj++;
						}

					}
					if (aq2[0] == null) {
						System.out.println("Características não correspondem...");
					} else {
						for (int k = 0; k < qtd; k++) {
							System.out.println("Parabens voce adotou os cachorros " + aq2[k]);
						}
					}
				}
				break;

			case 2:
				for (int jj = 0; jj < qtd; jj++) {
					System.out.println("Qual gatinho deseja adotar");
					System.out.println("Por favor insira o Id Do gatinho a ser Adotado.");
					int nomecat = input.nextInt();
					for (int l = 0; l < gatos.size(); l++) {
						if (nomecat == l) {
							aq2[aj] = gatos.get(l).nome;
							aj++;

						}
					}
				}
				for (int o = 0; o < qtd; o++)
					System.out
							.println("Parabéns aos Envolvidos agora o(s) " + aq2[o] + " Terá um novo lar! o seu Lar!");
				break;

			}
			break;

		}

	}

}
