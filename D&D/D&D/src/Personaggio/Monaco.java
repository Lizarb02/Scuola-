package Personaggio;

public class Monaco {
	private int Livello;
	private String Nome;
	private String Classe;
	private String Razza;
	private int HP;
	private int Difesa;
	private Arma spada;
	private Armatura Armatura;
	//attributi fisici 
	private int Forza;
	private int ModForza;
	private int Destrezza;
	private int ModDestrezza;
	private int Costituzione;
	private int ModCostituzione;
	//attributi Mentali
	private int Intelligenza;
	private int ModIntelligenza;
	private int Saggezza;
	private int ModSaggezza;
	private int Carisma;
	private int ModCarisma;

	public Monaco(String n,String r,String s,String a) {
		Livello=(int) (Math.random()*20+1);
		Nome=n;
		Classe="Monaco";
		Razza=r;
		HP=0;
		Difesa=0;
		spada= new Arma(s);
		spada.GradoMagico();
		spada.Elemento();
		Armatura= new Armatura(a);
		Armatura.CA=(int) (Math.random()*2+1);
		Armatura.Tipo();
		//attributi fisici
		Forza=0;
		ModForza=0;
		Destrezza=0;
		ModDestrezza=0;
		Costituzione=0;
		ModCostituzione=0;
		//attributi Mentali
		Intelligenza=0;
		ModIntelligenza=0;
		Saggezza=0;
		ModSaggezza=0;
		Carisma=0;
		ModCarisma=0;
	}
	public void Assegnazione() {
		int a=0,b=0,c=0;
		//MOD FORZA
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Forza=a+b+c+2;
		ModForza=(Forza-10)/2;
		ModForza=(int) Math.floor(ModForza);
		//MOD DESTREZZA
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Destrezza=a+b+c+4;
		ModDestrezza=(Destrezza-10)/2;
		ModDestrezza=(int) Math.floor(ModDestrezza);
		//calcolo difesa
		Difesa=10+ModDestrezza+Armatura.CA+2;
		//MOD COSTITUZIONE 
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Costituzione=a+b+c;
		ModCostituzione=(Costituzione-10)/2;
		ModCostituzione=(int) Math.floor(ModCostituzione);
		//calcolo hp
		a=(int) (Math.random()*8+1);
		HP=(a+ModCostituzione)*Livello;
		//MOD INTELLIGENZA
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Intelligenza=a+b+c;
		ModIntelligenza=(Intelligenza-10)/2;
		ModIntelligenza=(int) Math.floor(ModIntelligenza);
		//MOD SAGGEZZA
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Saggezza=a+b+c;
		ModSaggezza=(Saggezza-10)/2;
		ModSaggezza=(int) Math.floor(ModSaggezza);
		//MOD CARISMA 
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Carisma=a+b+c;
		ModCarisma=(Carisma-10)/2;
		ModCarisma=(int) Math.floor(ModCarisma);
	}

	public int TxC() {
		int a=(int) (Math.random()*20+1);
		return a+Livello+ModForza+spada.Magia;
	}
}
