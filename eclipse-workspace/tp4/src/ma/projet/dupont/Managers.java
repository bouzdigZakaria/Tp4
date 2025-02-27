package ma.projet.dupont;
	import ma.projet1.Personnes;
	public class Managers extends Personnes {
		private String service;
		public Managers(int id, String nom, String prenom, String mail, String telephone, double salaire, String service) {
			super(id, nom, prenom, mail, telephone, salaire);
			this.service = service;
		}
		@Override
		public double calculerSalaire() {
			return salaire * 1.35;
		}
		@Override
		public String afficher() {
			return "Le salaire du manager " + nom + " " + prenom + " est : " + calculerSalaire() + " dh, son service : "
					+ service;
		}
	}