package it.isosistemi.shapes;

public class Quadrato implements Forma{

	private int lato;

	public Quadrato(){

	}

	public Quadrato(int lato){
		this.lato = lato;
	}
	
	public void finalize() throws Throwable {

	}

	public int calcolaArea(){
		return lato;
	}

	public int calcolaPerimetro(){
		return 0;
	}

}