package it.isosistemi.shapes;

import java.util.ArrayList;
import java.util.List;


public class Canvas {

	private List<Forma> forme;
	
	public Canvas(){
		forme = new ArrayList<>();
	}

	public void finalize() throws Throwable {

	}

	public int calcolaAreaTotale(){
		int area = 0;
		
		for (Forma forma : forme) {
			area += forma.calcolaArea();
		}
		
		return area;
	}

	public int calcolaPerimetroTotale(){
		return 0;
	}

	public void add(Forma r) {
		forme.add(r);
	}

	public int size() {	
		return forme.size();
	}
}