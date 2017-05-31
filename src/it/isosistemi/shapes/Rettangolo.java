package it.isosistemi.shapes;

public class Rettangolo implements Forma{

	private int altezza;
	private int larghezza;

	public Rettangolo(){

	}

	public Rettangolo(int height, int width) {
		this.altezza = height;
		this.larghezza = width;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaArea(){
		return altezza*larghezza;
	}

	public int calcolaPerimetro(){
		return (altezza*2)+(larghezza*2);
	}

}