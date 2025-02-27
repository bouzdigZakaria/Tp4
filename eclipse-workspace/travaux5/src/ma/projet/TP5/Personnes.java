package ma.projet.TP5;

public abstract class Personnes {
	protected int id;
	protected String prenom;
	private static int comp;
	public Personnes(String prenom) {
		this.id = ++comp;
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Je suis " + this.getClass().getSimpleName() + " " + " " + this.prenom;
	}
	public abstract void affiche();
}
