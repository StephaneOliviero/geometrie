package geometrie;

public abstract class FormeDeBoite {

	private int largeur;

	public FormeDeBoite(int largeur) {
		setLargeur(largeur);
	}

	public int getLargeur() {
		return largeur;
	}

	private void setLargeur(int largeur) {
		if (largeur > 0){
			this.largeur = largeur;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
}