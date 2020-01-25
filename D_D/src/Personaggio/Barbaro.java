package Personaggio;

public class Barbaro {
	public int Livello;
	public String Nome;
	public String Classe;
	public String Razza;
	public float HP;
	public int Difesa;
	public Arma spada;
	public Armatura armatura;
	//attributi fisici 
	public int Forza;
	private int ModForza;
	public int Destrezza;
	private int ModDestrezza;
	public int Costituzione;
	private int ModCostituzione;
	//attributi Mentali
	public int Intelligenza;
	private int ModIntelligenza;
	public int Saggezza;
	private int ModSaggezza;
	public int Carisma;
	private int ModCarisma;

	public Barbaro(String n,String r) {
		Livello=(int) (Math.random()*20+1);
		Nome=n;
		Classe="Barbaro";
		Razza=r;
		HP=0;
		Difesa=0;
		spada= new Arma("AsciaBipenne");
		spada.Bimani=true;
		spada.GradoMagico();
		spada.Elemento();
		armatura= new Armatura("bo il tipo");
		armatura.Tipo();
		armatura.Nome=armatura.Tipo;
		//attributi fisici
		int a=0,b=0,c=0;
		//MOD FORZA
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Forza=a+b+c+6;
		ModForza=(Forza-10)/2;
		ModForza=(int) Math.floor(ModForza);
		//MOD DESTREZZA
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Destrezza=a+b+c;
		ModDestrezza=(Destrezza-10)/2;
		ModDestrezza=(int) Math.floor(ModDestrezza);
		//calcolo difesa
		a=(int) (Math.random()*10+1);
		Difesa=10+ModDestrezza+armatura.CA;
		//MOD COSTITUZIONE 
		a=(int) (Math.random()*8+1);
		b=(int) (Math.random()*8+1);
		c=(int) (Math.random()*8+1);
		Costituzione=a+b+c+4;
		ModCostituzione=(Costituzione-10)/2;
		ModCostituzione=(int) Math.floor(ModCostituzione);
		//calcolo hp
		a=(int) (Math.random()*12+1);
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
