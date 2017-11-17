package geometrie;

public class Carre extends FormeDeBoite implements iFormes2D{
	public Carre(int arete) {
		super(arete);
	}

	@Override
	public double perimetre() {
		return getLargeur() * 4;
	}

	@Override
	public double surface() {
		return getLargeur() * getLargeur();
	}
}