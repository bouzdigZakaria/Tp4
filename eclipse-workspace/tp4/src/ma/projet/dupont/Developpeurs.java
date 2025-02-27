package ma.projet.dupont;
	import ma.projet1.Personnes;
	public class Developpeurs extends Personnes {
		private String specialite;
		public Developpeurs(int id, String nom, String prenom, String mail, String telephone, double salaire,
				String specialite) {
			super(id, nom, prenom, mail, telephone, salaire);
			this.specialite = specialite;
		}
		@Override
		public double calculerSalaire() {
			// TODO Auto-generated method stub
			return salaire * 1.2;
		}
		@Override
		public String afficher() {
			// TODO Auto-generated method stub
			return "Le salaire du développeur " + nom + " " + prenom + " est : " + calculerSalaire()
					+ " dh, sa spécialité : " + specialite;
		}
	}