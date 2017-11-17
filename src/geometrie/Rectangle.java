package geometrie;

public class Rectangle extends FormeDeBoite implements iFormes2D{

	private int hauteur;
	
	public int getHauteur() {
		return hauteur;
	}

	private void setHauteur(int hauteur) {
		if (hauteur > 0){
			this.hauteur = hauteur;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public Rectangle(int largeur, int hauteur)  {
		super(largeur);
		setHauteur(hauteur);
	}

	
	@Override
	public double perimetre(){
		return (getLargeur() + getHauteur()) *2;
	}

	@Override
	public double surface(){
		return (getLargeur() * getHauteur());
	}	
}