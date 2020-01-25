package Personaggio;

public class PozioneCura extends Oggetto {
	private float effetto;
	private int usi;
	private int Tipo;
	private Boolean lancio;
	public PozioneCura() {
		super();
		int b=0;
		lancio=false;
		Tipo=(int) (Math.random()*6-1);
		switch(Tipo) {
		case 1 : 
			setNome("PozioneCurativa");
		     b=(int) (Math.random()*2-1);
		    if(b==2) {
		    	lancio=true;
		    }
			break;
		case 2:
			setNome("PozioneDestrezza");
			b=(int) (Math.random()*2-1);
		    if(b==2) {
		    	lancio=true;
		    }
			break;
		case 3: 
			setNome("PozioneForza");
		     b=(int) (Math.random()*2-1);
		    if(b==2) {
		    	lancio=true;
		    }
			break;
		case 4:
			setNome("PozioneIntelligenza");
		     b=(int) (Math.random()*2-1);
		    if(b==2) {
		    	lancio=true;
		    }
			break;
		case 5:
			setNome("PozioneVeleno");
			lancio=true;
			break;
		case 6:
			setNome("PozioneEsposia");
			lancio=true;
			break;
		}
		setPeso((float) 0.33);
		usi=3;
		
	}
	public void Usa() {
		effetto= 4*this.getRarità();
		switch(Tipo) {
		case 1 : 
			

			break;
		case 2:


			break;
		case 3: 


			break;
		case 4:


			break;
		case 5:

			break;
		case 6:

			break;
		}
	}
}
