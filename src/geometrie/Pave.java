package geometrie;

public class Pave implements iFormes3D{

	private int profondeur;
	private Rectangle base;
	
	public int getProfondeur() {
		return profondeur;
	}
	
	private void setProfondeur(int profondeur) {
		if (profondeur > 0){
			this.profondeur = profondeur;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public Pave(int largeur, int hauteur, int profondeur)  {
		super();
		base = new Rectangle(largeur, hauteur);
		setProfondeur(profondeur);
	}

	@Override
	public double volume(){
		return (base.surface() * profondeur);
	}

	public Rectangle getBase() {
		return base;
	}
	
	
}
