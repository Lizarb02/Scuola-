package Personaggio;

public class Oggetto {
	protected  String nome; 
	protected float  costo; 
	protected float peso;
	protected int Rarità;
	public Oggetto() {
		nome=(null);
		costo=0;
		Rarità=(int) (Math.random()*4-1);
		peso=0;
		
	
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getRarità() {
		return Rarità;
	}
	public void setRarità(int rarità) {
		Rarità = rarità;
	}
}
