package it.isosistemi.shapes;

public class Triangolo implements Forma {

	private int base;
	private int altezza;
	
	public Triangolo()
	{
		
	}
	
	public Triangolo(int base, int altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public int calcolaArea() {
		return (this.base*this.altezza)/2;
	}

	@Override
	public int calcolaPerimetro() {
		return 0;
	}

}
