package ma.projet1;
import ma.projet.dupont.Developpeurs;
import ma.projet.dupont.Managers;
public class Tests {
	public static void main(String[] args) {
		Developpeurs dev1 = new Developpeurs(1, "Amellah", "Ali", "Amelleh@gmail.com", "", 3494959, "C");
		Developpeurs dev2 = new Developpeurs(2, "Rida", "Hamza", "Managers.com", "", 848444, "PHP");
		Managers man1 = new Managers(3, "Lacheb", "Rida", "Rida@gmail.com", "", 838383, "Maths");
		Managers man2 = new Managers(4, "Nawal", "Moutawakil", "Moutawakil@gmail.com", "", 48382, "Bureautique");
		System.out.println(man1.afficher());
		System.out.println(dev1.afficher());
	}
}