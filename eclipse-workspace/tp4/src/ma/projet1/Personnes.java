package ma.projet1;
	public abstract class Personnes {
		protected int id;
		protected String nom;
		protected String prenom;
		protected String mail;
		protected String telephone;
		protected double salaire;
		public Personnes(int id, String nom, String prenom, String mail, String telephone, double salaire) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.mail = mail;
			this.telephone = telephone;
			this.salaire = salaire;
		}
		public abstract double calculerSalaire();
		public String afficher() {
			return "Nom : " + nom + " " + prenom + ", Salaire : " + calculerSalaire() + " dh";
		}
	}