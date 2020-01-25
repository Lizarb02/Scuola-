package Personaggio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreaPersonaggio {
	private static int classe;
	private int classe2;
	private Barbaro b1;
	private Monaco m1;
	private Guerriero g2;
	private Barbaro b2;
	private Monaco m2;
	private Guerriero g1;
	public CreaPersonaggio() throws NumberFormatException, IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		String r = null;
		classe=0;
		classe2=0;
		System.out.print("INSERIRE NICKNAME>> ");
		String n = tastiera.readLine();

		spazio();
		System.out.println("			RAZZE DISPONIBILI:");
		System.out.println("1-Umano");
		System.out.println("	2-Elfo");
		System.out.println("3-Halfling");
		System.out.println("	4-Nano");
		System.out.println("5-DragonBorn");
		System.out.println("	6-Gnomo");
		System.out.println("7-MezzElfo");
		System.out.println("	8-MezzOrco");
		System.out.println("9-Tiefling");
		System.out.print("				>>>");
		int a = Integer.valueOf(tastiera.readLine()).intValue();
		switch (a) {
		case 1:
			r = "Umano";
			break;
		case 2:
			r = "Elfo";
			break;
		case 3:
			r = "Helfling";
			break;
		case 4:
			r = "Nano";
			break;
		case 5:
			r = "DragonBorn";
			break;
		case 6:
			r = "Gnomo";
			break;
		case 7:
			r = "MezzElfo";
			break;
		case 8:
			r = "MezzOrco";
			break;
		case 9:
			r = "Tielflig";
			break;
		}
		b1 = new Barbaro(n, r);
		g1 = new Guerriero(n, r);
		m1 = new Monaco(n, r);
		System.out.println("	      ")	;
		System.out.println("		 ")	;
		System.out.println("		SECONDO PERSONAGGIO ")	;
		System.out.println("	      ")	;
		System.out.println("		 ")	;
		System.out.println("	      ")	;
		String R = null;
		classe=0;
		System.out.print("INSERIRE NICKNAME>> ");
		String N = tastiera.readLine();

		spazio();
		System.out.println("			RAZZE DISPONIBILI:");
		System.out.println("1-Umano");
		System.out.println("	2-Elfo");
		System.out.println("3-Halfling");
		System.out.println("	4-Nano");
		System.out.println("5-DragonBorn");
		System.out.println("	6-Gnomo");
		System.out.println("7-MezzElfo");
		System.out.println("	8-MezzOrco");
		System.out.println("9-Tiefling");
		System.out.print("				>>>");
		 a = Integer.valueOf(tastiera.readLine()).intValue();
		switch (a) {
		case 1:
			R= "Umano";
			break;
		case 2:
			R = "Elfo";
			break;
		case 3:
			R = "Helfling";
			break;
		case 4:
			R = "Nano";
			break;
		case 5:
			R = "DragonBorn";
			break;
		case 6:
			R = "Gnomo";
			break;
		case 7:
			R = "MezzElfo";
			break;
		case 8:
			R = "MezzOrco";
			break;
		case 9:
			R = "Tielflig";
			break;
		}
		b2= new Barbaro(N, R);
		g2 = new Guerriero(N, R);
		m2 = new Monaco(N, R);
		
	}
	public static void spazio() {
		System.out.println("");
		System.out.println("	");
		System.out.println("");
		System.out.println("	");
		System.out.println("");
		System.out.println("	");
		System.out.println("");
		System.out.println("	");
		System.out.println("");
		System.out.println("	");
		System.out.println("");
		System.out.println("");

	}

	public  void Creazione() throws IOException, InterruptedException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int exit = 0, c = 0, i;
		
				
		spazio();
		do {
			System.out.println("			CLASSI DISPONIBILI:");
			System.out.println("1-Barbaro         [Bonus Costituzione-Forza]");
			System.out.println("	2-Bardo");
			System.out.println("3-Chierico");
			System.out.println("	4-Druido");
			System.out.println("5-Guerriero       [ClasseBase]");
			System.out.println("	6-Ladro");
			System.out.println("7-Mago");
			System.out.println("	8-Monaco      [Bonus Destrezza]");
			System.out.println("9-Paladino");
			System.out.println("	10-Ranger");
			System.out.println("11-Stregone");
			System.out.println("	12-Warlock");
			System.out.print("				>>>");
			c = Integer.valueOf(tastiera.readLine()).intValue();
			switch (c) {
			case 1:
				System.out.println("Vuoi dare un nome ad: " + b1.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA = tastiera.readLine();
					Thread.sleep(500);
					b1.spada.Nome = ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: " + b1.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: " + b1.armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				int e = Integer.valueOf(tastiera.readLine()).intValue();
				if (e == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String weapon = tastiera.readLine();
					Thread.sleep(500);
					b1.armatura.Nome = weapon;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: " + b1.armatura.Nome);
					Thread.sleep(1000);
				}
				classe=1;
				exit = 1;
				break;
			case 2:
				System.out.println(
						"Il Bardo è troppo impengato a molestare la barista per poter essere giocato, ci dispiace");
				exit = 0;
				break;
			case 3:
				System.out.println("");
				System.out.println("");
				Thread.sleep(900);
				System.out.println("Mai più sembrerà idea da cretino, Ma nel gruppo a far più casino ");
				Thread.sleep(900);
				System.out.println("E' quello con la croce, che picchia a gran voce ");
				Thread.sleep(900);
				System.out.println("Distribuendo lo schiaffo divino  ");
				Thread.sleep(900);
				System.out.println("Con la mazza gli ogre colpì, Con magie i cragni aprì  ");
				Thread.sleep(900);
				System.out.println("Pochi ne provano timore, ma sono tanto in errore  ");
				Thread.sleep(900);
				System.out.println("Questa è una pessima poesia su D&D  ");
				Thread.sleep(900);
				System.out.println("");
				System.out.println("Comunque non puoi giocarlo....Mi spiace");
				Thread.sleep(900);
				exit = 0;
				break;
			case 4:
				System.out.println("Sta litigando con quella gigantesca stronza di Madre Natura ");
				exit = 0;
				break;
			case 5:
				
				System.out.println("Vuoi dare un nome ad: " + g1.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA = tastiera.readLine();
					Thread.sleep(500);
					g1.spada.Nome = ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: " + g1.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: " + g1.armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				 i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String weapon = tastiera.readLine();
					Thread.sleep(500);
					g1.armatura.Nome = weapon;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: " + g1.armatura.Nome);
					Thread.sleep(1000);
				}
				exit = 1;
				classe=2;
				break;
			case 6:
				System.out.println("E' così difficilmente accoltellabile che non riesci a selezionarlo..che sfiga");
				System.out.println("");
				exit = 0;
				break;
			case 7:
				System.out.println("Sta studiando, ho provato a chiamarlo ma.....mi ha tiraro una palla di fuco...ho avuto paura");
				System.out.println("");
				exit = 0;
				break;
			case 8:
				
				System.out.println("Vuoi dare un nome ad: " +m1.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA = tastiera.readLine();
					Thread.sleep(500);
					m1.spada.Nome = ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: " + m1.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: " + m1.armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				 i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String weapon = tastiera.readLine();
					Thread.sleep(500);
					m1.armatura.Nome = weapon;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: " + m1.armatura.Nome);
					Thread.sleep(1000);
				}
				exit = 1;
				classe=3;
				break;
			case 9:
				System.out.println("DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!!");
				System.out.println("");
				exit = 0;
				break;
			case 10:
				System.out.println("Gioco un gerriero con un arco è molto meglio");
				System.out.println("");
				exit = 0;
				break;
			case 11:
				System.out.println("Il suo Paparino Drago Cromatico lo ha messo in punizione mi spiace ");
				System.out.println("");
				exit = 0;
				break;
			case 12:
				System.out.println("ELDRIK BLASTTTTTTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!");
				Thread.sleep(900);
				System.out.println("... ");
				Thread.sleep(900);
				System.out.println("... ");
				Thread.sleep(900);
				System.out.println("");
				System.out.println("Il suo shugar Daddy ha detto di no...");
				System.out.println("");
				exit = 0;
				break;
			default: // debug
				System.out.println("Maronna cagna");
			}
		} while (!(exit == 1));
		
		exit=0;
		spazio();
		do {
			System.out.println("			CLASSI DISPONIBILI:");
			System.out.println("1-Barbaro         [Bonus Costituzione-Forza]");
			System.out.println("	2-Bardo");
			System.out.println("3-Chierico");
			System.out.println("	4-Druido");
			System.out.println("5-Guerriero       [ClasseBase]");
			System.out.println("	6-Ladro");
			System.out.println("7-Mago");
			System.out.println("	8-Monaco      [Bonus Destrezza]");
			System.out.println("9-Paladino");
			System.out.println("	10-Ranger");
			System.out.println("11-Stregone");
			System.out.println("	12-Warlock");
			System.out.print("				>>>");
			c = Integer.valueOf(tastiera.readLine()).intValue();
			switch (c) {
			case 1:
				System.out.println("Vuoi dare un nome ad: " + b2.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA = tastiera.readLine();
					Thread.sleep(500);
					b2.spada.Nome = ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: " + b2.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: " + b2.armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				int e = Integer.valueOf(tastiera.readLine()).intValue();
				if (e == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String weapon = tastiera.readLine();
					Thread.sleep(500);
					b2.armatura.Nome = weapon;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: " + b2.armatura.Nome);
					Thread.sleep(1000);
				}
				classe2=1;
				exit = 1;
				break;
			case 2:
				System.out.println(
						"Il Bardo è troppo impengato a molestare la barista per poter essere giocato, ci dispiace");
				exit = 0;
				break;
			case 3:
				System.out.println("");
				System.out.println("");
				Thread.sleep(900);
				System.out.println("Mai più sembrerà idea da cretino, Ma nel gruppo a far più casino ");
				Thread.sleep(900);
				System.out.println("E' quello con la croce, che picchia a gran voce ");
				Thread.sleep(900);
				System.out.println("Distribuendo lo schiaffo divino  ");
				Thread.sleep(900);
				System.out.println("Con la mazza gli ogre colpì, Con magie i cragni aprì  ");
				Thread.sleep(900);
				System.out.println("Pochi ne provano timore, ma sono tanto in errore  ");
				Thread.sleep(900);
				System.out.println("Questa è una pessima poesia su D&D  ");
				Thread.sleep(900);
				System.out.println("");
				System.out.println("Comunque non puoi giocarlo....Mi spiace");
				Thread.sleep(900);
				exit = 0;
				break;
			case 4:
				System.out.println("Sta litigando con quella gigantesca stronza di Madre Natura ");
				exit = 0;
				break;
			case 5:
				
				System.out.println("Vuoi dare un nome ad: " + g2.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA = tastiera.readLine();
					Thread.sleep(500);
					g2.spada.Nome = ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: " + g2.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: " + g2.armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				 i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String weapon = tastiera.readLine();
					Thread.sleep(500);
					g2.armatura.Nome = weapon;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: " + g2.armatura.Nome);
					Thread.sleep(1000);
				}
				exit = 1;
				classe2=2;
				break;
			case 6:
				System.out.println("E' così difficilmente accoltellabile che non riesci a selezionarlo..che sfiga");
				System.out.println("");
				exit = 0;
				break;
			case 7:
				System.out.println("Sta studiando, ho provato a chiamarlo ma.....mi ha tiraro una palla di fuco...ho avuto paura");
				System.out.println("");
				exit = 0;
				break;
			case 8:
				
				System.out.println("Vuoi dare un nome ad: " +m2.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA = tastiera.readLine();
					Thread.sleep(500);
					m2.spada.Nome = ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: " + m2.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: " + m2.armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				 i = Integer.valueOf(tastiera.readLine()).intValue();
				if (i == 1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String weapon = tastiera.readLine();
					Thread.sleep(500);
					m2.armatura.Nome = weapon;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: " + m2.armatura.Nome);
					Thread.sleep(1000);
				}
				exit = 1;
				classe2=3;
				break;
			case 9:
				System.out.println("DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!! DEUS VULT !!!");
				System.out.println("");
				exit = 0;
				break;
			case 10:
				System.out.println("Gioco un gerriero con un arco è molto meglio");
				System.out.println("");
				exit = 0;
				break;
			case 11:
				System.out.println("Il suo Paparino Drago Cromatico lo ha messo in punizione mi spiace ");
				System.out.println("");
				exit = 0;
				break;
			case 12:
				System.out.println("ELDRIK BLASTTTTTTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!");
				Thread.sleep(900);
				System.out.println("... ");
				Thread.sleep(900);
				System.out.println("... ");
				Thread.sleep(900);
				System.out.println("");
				System.out.println("Il suo shugar Daddy ha detto di no...");
				System.out.println("");
				exit = 0;
				break;
			default: // debug
				System.out.println("Maronna cagna");
			}
		} while (!(exit == 1));

	}

	public void MostraPersonaggio() {
		spazio();
		System.out.println("			PRIMO PERSONAGGIO ");
		switch(classe) {
		case 1:
			
			System.out.println("**********************************");
			System.out.println("	NOME: "+b1.Nome+" LIVELLO: "+b1.Livello);
			System.out.println("RAZZA: "+b1.Razza);
			System.out.println("	CASSE: "+b1.Classe);
			System.out.println("ARMATURA: "+b1.armatura.Nome+" ARMA: "+b1.spada.Nome);
			System.out.println("STATISTICHE:");
			System.out.println("		-HP>>"+b1.HP);
			System.out.println("		-DIFESA>>"+b1.Difesa);
			System.out.println("		-FORZA>>"+b1.Forza);
			System.out.println("		-COSTITUZIONE>>"+b1.Costituzione);
			System.out.println("		-DESTREZZA>>"+b1.Destrezza);
			System.out.println("		-CARISMA>>"+b1.Carisma);
			System.out.println("		-INTELLIGENZA>>"+b1.Intelligenza);
			System.out.println("		-SAGGEZZA>>"+b1.Saggezza);
			System.out.println("**********************************");
			break;
		case 2:
			
			System.out.println("**********************************");
			System.out.println("	NOME: "+g1.Nome+" LIVELLO: "+g1.Livello);
			System.out.println("RAZZA: "+g1.Razza);
			System.out.println("	CASSE: "+g1.Classe);
			System.out.println("ARMATURA: "+g1.armatura.Nome+" ARMA: "+g1.spada.Nome);
			System.out.println("STATISTICHE:");
			System.out.println("		-HP>>"+g1.HP);
			System.out.println("		-DIFESA>>"+g1.Difesa);
			System.out.println("		-FORZA>>"+g1.Forza);
			System.out.println("		-COSTITUZIONE>>"+g1.Costituzione);
			System.out.println("		-DESTREZZA>>"+g1.Destrezza);
			System.out.println("		-CARISMA>>"+g1.Carisma);
			System.out.println("		-INTELLIGENZA>>"+g1.Intelligenza);
			System.out.println("		-SAGGEZZA>>"+g1.Saggezza);
			System.out.println("**********************************");
			break;
		case 3:
			
			System.out.println("**********************************");
			
			System.out.println("	NOME: "+m1.Nome+" LIVELLO: "+m1.Livello);
			System.out.println("RAZZA: "+m1.Razza);
			System.out.println("	CASSE: "+m1.Classe);
			System.out.println("ARMATURA: "+m1.armatura.Nome+" ARMA: "+m1.spada.Nome);
			System.out.println("STATISTICHE:");
			System.out.println("		-HP>>"+m1.HP);
			System.out.println("		-DIFESA>>"+m1.Difesa);
			System.out.println("		-FORZA>>"+m1.Forza);
			System.out.println("		-COSTITUZIONE>>"+m1.Costituzione);
			System.out.println("		-DESTREZZA>>"+m1.Destrezza);
			System.out.println("		-CARISMA>>"+m1.Carisma);
			System.out.println("		-INTELLIGENZA>>"+m1.Intelligenza);
			System.out.println("		-SAGGEZZA>>"+m1.Saggezza);
			System.out.println("**********************************");
			break;
		}
		System.out.println("			 ");
		System.out.println("			 ");
		spazio();
		System.out.println("			SECONDO PERSONAGGIO ");
		
		switch(classe2) {
		case 1:
			
			System.out.println("**********************************");
			System.out.println("	NOME: "+b2.Nome+" LIVELLO: "+b2.Livello);
			System.out.println("RAZZA: "+b2.Razza);
			System.out.println("	CASSE: "+b2.Classe);
			System.out.println("ARMATURA: "+b2.armatura.Nome+" ARMA: "+b2.spada.Nome);
			System.out.println("STATISTICHE:");
			System.out.println("		-HP>>"+b2.HP);
			System.out.println("		-DIFESA>>"+b2.Difesa);
			System.out.println("		-FORZA>>"+b2.Forza);
			System.out.println("		-COSTITUZIONE>>"+b2.Costituzione);
			System.out.println("		-DESTREZZA>>"+b2.Destrezza);
			System.out.println("		-CARISMA>>"+b2.Carisma);
			System.out.println("		-INTELLIGENZA>>"+b2.Intelligenza);
			System.out.println("		-SAGGEZZA>>"+b2.Saggezza);
			System.out.println("**********************************");
			break;
		case 2:
			
			System.out.println("**********************************");
			System.out.println("	NOME: "+g2.Nome+" LIVELLO: "+g2.Livello);
			System.out.println("RAZZA: "+g2.Razza);
			System.out.println("	CASSE: "+g2.Classe);
			System.out.println("ARMATURA: "+g2.armatura.Nome+" ARMA: "+g2.spada.Nome);
			System.out.println("STATISTICHE:");
			System.out.println("		-HP>>"+g2.HP);
			System.out.println("		-DIFESA>>"+g2.Difesa);
			System.out.println("		-FORZA>>"+g2.Forza);
			System.out.println("		-COSTITUZIONE>>"+g2.Costituzione);
			System.out.println("		-DESTREZZA>>"+g2.Destrezza);
			System.out.println("		-CARISMA>>"+g2.Carisma);
			System.out.println("		-INTELLIGENZA>>"+g1.Intelligenza);
			System.out.println("		-SAGGEZZA>>"+g1.Saggezza);
			System.out.println("**********************************");
			break;
		case 3:
			
			System.out.println("**********************************");
			
			System.out.println("	NOME: "+m2.Nome+" LIVELLO: "+m2.Livello);
			System.out.println("RAZZA: "+m2.Razza);
			System.out.println("	CASSE: "+m2.Classe);
			System.out.println("ARMATURA: "+m2.armatura.Nome+" ARMA: "+m2.spada.Nome);
			System.out.println("STATISTICHE:");
			System.out.println("		-HP>>"+m2.HP);
			System.out.println("		-DIFESA>>"+m2.Difesa);
			System.out.println("		-FORZA>>"+m2.Forza);
			System.out.println("		-COSTITUZIONE>>"+m2.Costituzione);
			System.out.println("		-DESTREZZA>>"+m2.Destrezza);
			System.out.println("		-CARISMA>>"+m2.Carisma);
			System.out.println("		-INTELLIGENZA>>"+m2.Intelligenza);
			System.out.println("		-SAGGEZZA>>"+m2.Saggezza);
			System.out.println("**********************************");
			break;
		}
		

	}
	public  void Guerra() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int a=0;
		String Colpo;
		do {
			spazio();
			System.out.println("		ATTACCO PLAYER");
			System.out.println("***********************************");
			switch(classe) {
			case 1:
				

				a=b1.TxC();
				System.out.println("");
				System.out.print("MetodoAttacco>> ");
				Colpo=tastiera.readLine();
				switch(classe2) {
				case 1:
					if(b1.TxC()>b2.Difesa) {
						float x= (float) (b1.spada.DannoSpada()*1.5);
						b2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+b2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+b2.HP);
					}
					break;
				case 2:
					if(b1.TxC()>g2.Difesa) {
						float x= (float) (b1.spada.DannoSpada()*1.5);
						g2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+g2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+g2.HP);
					}
					break;
				case 3:
					if(b1.TxC()>m2.Difesa) {
						float x= (float) (b1.spada.DannoSpada()*1.5);
						m2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+m2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+m2.HP);
					}
					break;
				}break;
			case 2:
				a=g1.TxC();
				System.out.println("");
				System.out.print("MetodoAttacco>> ");
				Colpo=tastiera.readLine();
				switch(classe2) {
				case 1:
					if(g1.TxC()>b2.Difesa) {
						int x=g1.spada.DannoSpada();
						b2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+b2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+b2.HP);
					}
					break;
				case 2:
					if(g1.TxC()>g2.Difesa) {
						int x=g1.spada.DannoSpada();
						g2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+g2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+g2.HP);
					}
					break;
				case 3:
					if(g1.TxC()>m2.Difesa) {
						int x=g1.spada.DannoSpada();
						m2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+m2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+m2.HP);
					}
					break;
				}break;
			case 3:

				a=m1.TxC();
				System.out.println("");
				System.out.print("MetodoAttacco>> ");
				Colpo=tastiera.readLine();
				switch(classe2) {
				case 1:
					if(m1.TxC()>b2.Difesa) {
						int x=m1.spada.DannoSpada();
						b2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+b2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+b2.HP);
					}
					break;
				case 2:
					if(m1.TxC()>g2.Difesa) {
						int x=m1.spada.DannoSpada();
						g2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+g2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+g2.HP);
					}
					break;
				case 3:
					if(m1.TxC()>m2.Difesa) {
						int x=m1.spada.DannoSpada();
						m2.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+m2.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+m2.HP);
					}
					break;
				}break;
			}
			System.out.println("		ATTACCO COMPUTER");
			System.out.println("***********************************");
			switch(classe) {
			case 1:
				

				a=b2.TxC();
				System.out.println("");
				switch(classe2) {
				case 1:
					if(b2.TxC()>b1.Difesa) {
						float x= (float) (b2.spada.DannoSpada()*1.5);
						b1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+b1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+b1.HP);
					}
					break;
				case 2:
					if(b2.TxC()>g1.Difesa) {
						float x= (float) (b2.spada.DannoSpada()*1.5);
						g1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+g1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+g1.HP);
					}
					break;
				case 3:
					if(b2.TxC()>m1.Difesa) {
						float x= (float) (b2.spada.DannoSpada()*1.5);
						m1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+m1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+m1.HP);					}
					break;
				}break;
			case 2:

				a=g2.TxC();
				Colpo=tastiera.readLine();
				switch(classe2) {
				case 1:
					if(g2.TxC()>b1.Difesa) {
						float x= g2.spada.DannoSpada();
						b1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+b1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+b1.HP);
					}
					break;
				case 2:
					if(g2.TxC()>g1.Difesa) {
						int x=g2.spada.DannoBase;
						g1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+g1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+g1.HP);
					}
					break;
				case 3:
					if(g2.TxC()>m1.Difesa) {
						float x= g2.spada.DannoSpada();
						m1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+m1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+m1.HP);
					}
					break;
				}break;
			case 3:
				a=m2.TxC();
				Colpo=tastiera.readLine();
				switch(classe2) {
				case 1:
					if(m2.TxC()>b1.Difesa) {
						float x= m2.spada.DannoSpada();
						b1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+b1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+b1.HP);
					}
					break;
				case 2:
					if(m2.TxC()>g1.Difesa) {
						int x=g2.spada.DannoBase;
						g1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+g1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+g1.HP);
					}
					break;
				case 3:
					if(m2.TxC()>m1.Difesa) {
						float x= m2.spada.DannoSpada();
						m1.HP-= x;
						System.out.println("	<<<<<AVVERSSARIO COLPITO>>>>>");
						System.out.println("HP AVVERSARIO> "+m1.HP);
					}else {
						System.out.println("	<<<<<DIFESA NON PENETRATA>>>>>");
						System.out.println("HP AVVERSARIO> "+m1.HP);;
					}
					break;
				}
			}
		}while(b1.HP>=0||g1.HP>=0||m1.HP>=0||b2.HP>=0||g2.HP>=0||m2.HP>=0);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		CreaPersonaggio c1= new CreaPersonaggio();
		c1.Creazione();
		c1.MostraPersonaggio();
		c1.Guerra();
	}
}
