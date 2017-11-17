package geometrie;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests2D {
	@Test
	public void perimetreCarre_largeur4_egale_16() {
		// Given
		Carre carre = new Carre(4);
		// When
		double perimetre = carre.perimetre();
		// Then
		assertEquals(16D, perimetre, 0.1);
	}

	@Test
	public void perimetreCarre_largeur5_egale_20() {
		// Given
		Carre carre = new Carre(5);
		// When
		double perimetre = carre.perimetre();
		// Then
		assertEquals(20D, perimetre, 0.1);
	}
	
	@Test
	public void surfaceCarre_largeur5_egale_25() {
		// Given
		Carre carre = new Carre(5);
		// When
		double perimetre = carre.surface();
		// Then
		assertEquals(25D, perimetre, 0.1);
	}
	
	@Test
	public void surfaceCarre_largeur4_egale_16() {
		// Given
		Carre carre = new Carre(4);
		// When
		double perimetre = carre.surface();
		// Then
		assertEquals(16D, perimetre, 0.1);
	}
}