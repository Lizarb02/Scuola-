package Personaggio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreaPersonaggio {
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
	public static void Creazione() throws IOException, InterruptedException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int exit=0,i=0;
		String r = null;
		System.out.print("INSERIRE NICKNAME>> ");
		String n=tastiera.readLine();
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
		int a=Integer.valueOf(tastiera.read()).intValue();
		switch(a) {
		case 1:
			 r="Umano";
			break;
		case 2:
			 r="Elfo";
			break;
		case 3:
			 r="Helfling";
			break;
		case 4:
			 r="Nano";
			break;
		case 5:
			 r="DragonBorn";
			break;
		case 6:
			 r="Gnomo";
			break;
		case 7:
			 r="MezzElfo";
			break;
		case 8:
			 r="MezzOrco";
			break;
		case 9:
			 r="Tielflig";
			break;
		}
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
			int c=Integer.valueOf(tastiera.read()).intValue();
			System.out.println("	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			switch(c) {
			case 1:
				Barbaro p1= new Barbaro(n,r);
				System.out.println("Vuoi dare un nome ad: "+p1.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i=Integer.valueOf(tastiera.read()).intValue();
				if(i==1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA=tastiera.readLine();
					Thread.sleep(500);
					p1.spada.Nome=ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: "+p1.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: "+p1.Armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i=Integer.valueOf(tastiera.read()).intValue();
				if(i==1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMATURA=tastiera.readLine();
					Thread.sleep(500);
					p1.Armatura.Nome=ARMATURA;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: "+p1.Armatura.Nome);
					Thread.sleep(1000);
				}
				exit=1;
				break;
			case 2: 
				System.out.println("Il Bardo è troppo impengato a molestare la barista per poter essere giocato, ci dispiace");
				exit=0;
				break;
			case 3: 
				System.out.println("Il Chierico sta pregando il suo inutile Dio,mrglio lasciarlo in pace");
				exit=0;
				break;
			case 4: 
				System.out.println("Il Druido sta sintetizzando metanfetamina, lascialo stare");
				exit=0;
				break;
			case 5:
				Guerriero p1= new Guerriero(n,r);
				System.out.println("Vuoi dare un nome ad: "+p1.spada.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i=Integer.valueOf(tastiera.read()).intValue();
				if(i==1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMA=tastiera.readLine();
					Thread.sleep(500);
					p1.spada.Nome=ARMA;
					System.out.println("");
					System.out.println("ARMA RINOMINATA IN: "+p1.spada.Nome);
				}
				Thread.sleep(1000);
				System.out.println("Vuoi dare un nome ad: "+p1.Armatura.Nome);
				System.out.println("	1-SI'");
				System.out.println("	2-NO");
				System.out.print(">>");
				i=Integer.valueOf(tastiera.read()).intValue();
				if(i==1) {
					System.out.println("");
					System.out.println("INSERIRE NUOVO NOME>> ");
					String ARMATURA=tastiera.readLine();
					Thread.sleep(500);
					p1.Armatura.Nome=ARMATURA;
					System.out.println("");
					System.out.println("ARMATURA RINOMINATA IN: "+p1.Armatura.Nome);
					Thread.sleep(1000);
				}
				exit=1;
				break;
			}
		}while(!(exit==1));

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		Creazione();
	}
}
