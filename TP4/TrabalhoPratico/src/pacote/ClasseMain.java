package pacote;

import java.util.Scanner;

public class ClasseMain {

	public static void main(String[] args) {
		int opcao;
		
			Scanner ler = new Scanner(System.in);
		
			Unidade uni1 = new Unidade("Norte", "Rua 3, Bairro das aves", "Boulevard");
			Unidade uni2 = new Unidade("Sul", "Rua7, Avenida do Gostares", "Iguatemi");
			
			Funcionario func1 = new Funcionario("Jorge", "05648315783", 24, uni1, "jorge@gmail.com", "Tarde", "R$ 1400,00");
			Funcionario func2 = new Funcionario("Eust�cio","65483242975", 72, uni2, "eustacio1984@gmail.com", "Tarde e Noite", "R$ 2100,00");
			
			Filme film1 = new Filme("O Grande Hotel Budapeste", ": 3/07/2014", 100, "Legendado", 14, "Com�dia/Crime");
			Filme film2 = new Filme("Baby Driver", "27/06/2017", 115, "Dublado", 14, "A��o/Thriller");		
			
			Sessao sess1 = new Sessao(4, film1, "19:30", uni2, false);
			Sessao sess2 = new Sessao(5, film2, "22:00", uni1, true);
			
			Cliente cli1 = new Cliente("Andr�", "65484235128", 19, uni2, "dre@gmail.com", 1);
			Cliente cli2 = new Cliente("S�rgio","68452257879", 53, uni1, "email@email.com", 3);
		
		do {
		imprimeMenu();
		opcao =
		}while (opcao!=7);
		
		
	}

	static void imprimeMenu() {
		System.out.println("\tEscolha a op��o do menu");
		System.out.println("1 - Configura��es de filme");
		System.out.println("2 - Configura��es de sess�o");
		System.out.println("");
	}

	
}