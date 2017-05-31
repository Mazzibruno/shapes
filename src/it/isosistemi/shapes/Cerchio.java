package it.isosistemi.shapes;

public class Cerchio implements Forma{

	private int raggio;

	public Cerchio(){

	}

	public Cerchio(int rag) {
		this.raggio = rag;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaArea(){
		return (raggio*raggio)*3;
	}

	public int calcolaPerimetro(){
		return 0;
	}

}