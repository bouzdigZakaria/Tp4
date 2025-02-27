package ma.projet.TP5;
public class Carre extends Forme {
	private double cote;
	public Carre(double d) {
		cote = d;
	}
	@Override
	public double caculerSurface() {
		return cote * cote;
	
	}
}