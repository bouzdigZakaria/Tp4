package ma.projet.TP5;
public class Cercle extends Forme {
	private double rayon;
	public Cercle(int i) {
		rayon = i;
	}
	@Override
	public double caculerSurface() {
	return Math.PI * Math.pow(rayon, 2);
	}
}