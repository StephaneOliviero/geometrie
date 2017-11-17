package geometrie;

public class Cube implements iFormes3D {
	private Carre base;
	
	public Cube(int arete) {
		super();
		base = new Carre(arete);
	}

	@Override
	public double volume() {
		return base.surface() * base.getLargeur();
	}
}
