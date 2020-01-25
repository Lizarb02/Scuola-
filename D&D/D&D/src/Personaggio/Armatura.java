package Personaggio;

public class Armatura {
	public int CA;
	public String Tipo;
	public String Nome;
	public Armatura(String n) {
		CA=(int) (Math.random()*8+1);
		Nome=n;
		Tipo=null;
	}
	public void Tipo() {
		switch(CA) {
		case 1:
			Tipo="PigiamaDiFlanellaConBorchie";
			break;
		case 2:
			Tipo="CottaDiPelle";
			break;
		case 3:
			Tipo="CottaDiMaglia";
			break;
		case 4:
			Tipo="CottaDiMagliRinforzata";
			break;
		case 5:
			Tipo="SetDiMaglia";
			break;
		case 6:
			Tipo="CorazzaInMetalloMaledetto";
			break;
		case 7:
			Tipo="ArmaturaDaCavDiAnorLondo";
			break;
		case 8:
			Tipo="ArmaturaHavelPotenziataConNokia";
			break;
		}
	}

}
