package ma.projet.TP5;

public class Plombier extends Personnes {
	public Plombier(String prenom) {
		super(prenom);
	}
	@Override
	public void affiche() {
		System.out.println("Je suis " + getPrenom() + " le Plombier");
	}

}
