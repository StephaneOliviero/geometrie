package geometrie;

public class BacASable {

	public BacASable() {
	}

	public static void main(String[] args) {
		Rectangle monRectangle = new Rectangle(12, 10);
		Carre monCarre = new Carre(25);
		Pave monPave = new Pave(10,15,20);
		Cube monCube = new Cube (15);
		monCarre.surface();
		monRectangle.perimetre();

	}
}
