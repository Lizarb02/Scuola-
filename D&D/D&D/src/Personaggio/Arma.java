package Personaggio;

public class Arma {
	public int DannoBase;
	public int Magia;
	public String Nome;
	public String Elemento;
	public String GradoMagico;
	public boolean Bimani;
	
	public Arma(String n) {
		Nome=n;
		Elemento=null;
		DannoBase=(int) (Math.random()*8+1);
		Magia=(int) (Math.random()*5+0);
		Bimani=false;
		GradoMagico=null;
	}
	public void GradoMagico() {
		if(Magia>0) {
			switch(Magia) {
			case 1:
				GradoMagico="GingilloMagico";
				break;
			case 2:
				GradoMagico="OggettoIncantata";
				break;
			case 3:
				GradoMagico="ArmaMagica";
				break;
			case 4:
				GradoMagico="ArmamentoFatato";
				break;
			case 5:
				GradoMagico="ArtefattoMagico";
				break;
				
			}
		}
	}
	
	public void Elemento() {
		if(Magia>0) {
			int a=(int) (Math.random()*8+1);
			switch(a) {
			case 1:
				Elemento="Fuoco";
				break;
			case 2:
				Elemento="Acqua";
				break;
			case 3:
				Elemento="Aria";
				break;
			case 4:
				Elemento="Terra";
				break;
			case 5:
				Elemento="Elettro";
				break;
			case 6:
				Elemento="Oscurità";
				break;
			case 7:
				Elemento="Ghiaccio";
				break;
			case 8:
				Elemento="Erba";
				break;
	
			}
		}
	}
	
	public void Bimano(){
		int b=(int) (Math.random()*10+1);
		if(b%2==0) {
			Bimani=true;
		}
	}
}
