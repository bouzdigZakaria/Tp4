package ma.projet.TP5;
	public class Menuisiers extends Personnes {
		public Menuisiers(String prenom) {
			super(prenom);
		}
		@Override
		public void affiche() {
			System.out.println("Je suis " + getPrenom() + " le Menuisier");
		}
		}