package it.isosistemi.shapes.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.isosistemi.shapes.Canvas;
import it.isosistemi.shapes.Cerchio;
import it.isosistemi.shapes.Quadrato;
import it.isosistemi.shapes.Rettangolo;
import it.isosistemi.shapes.Triangolo;

/**
 * @author Bruno Mazzarello
 * @company Iso Sistemi S.r.l.
 */
public class ShapesTest {

	private Canvas c;
	private Rettangolo r;
	private Quadrato q;
	private Cerchio ce;
	

	@Before
	public void setup(){
		int height = 4;
		int width = 5;
		int radius = 4;
		int lato = 3;
		c = new Canvas();
		r = new Rettangolo(height,width);
		q = new Quadrato(lato);
		ce = new Cerchio(radius);
	}
	
	@Test
	public void shouldAddShapeToCanvas() {
		
		assertEquals("Il canvas è vuoto",0, c.size());
		
		//Foglio aggiungere la forma al canvas
		c.add(r);
		
		assertEquals("Il canvas ha una forma",1, c.size());
	}

	@Test
	public void shouldAddAllShapesToCanvas(){
		
		assertEquals("Non ci sono forme nel canvas", 0, c.size());
		
		c.add(r);
		c.add(q);
		c.add(ce);
		
		assertEquals("Ci sono 3 forme nel canvas", 3, c.size());
	}

	@Test
	public void shouldCalculateAreaOnShape()
	{		
		
		int area = r.calcolaArea();
		assertTrue("L'area non è nulla",area > 0);
		
		area = ce.calcolaArea();
		assertTrue("L'area del Cerchio non è nulla",area > 0);
		
		area = q.calcolaArea();
		assertTrue("L'area del Quadrato non è nulla",area > 0);
		
	}

	@Test
	public void shouldCalculatePerimeterOnShape()
	{
		int perimetro = r.calcolaArea();	
		assertTrue("Il perimetro non è nullo",perimetro> 0);
	}
	
	@Test
	public void shoulCalculateCanvasArea()
	{
		c.add(ce);
		c.add(q);
		c.add(r);
		int areaTotale = c.calcolaAreaTotale();
		assertTrue("L'area totale è positiva",areaTotale > 0);
		assertEquals("L'area totale è pari a 71", 71, areaTotale);
	}
	
	@Test
	public void shouldCalculateTrinagles()
	{
		c.add(ce);
		c.add(q);
		c.add(r);
		Triangolo t = new Triangolo(2,2);
		c.add(t);
		int areaTotale = c.calcolaAreaTotale();
		assertTrue("L'area totale è positiva",areaTotale > 0);
		assertEquals("L'area totale è pari a 73", 73, areaTotale);
	}
}
