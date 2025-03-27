package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

	public String getNom() {
		return this.nom;
	}

	public String getBoisson() {
		return this.boisson;
	}

	public int getArgent() {
		return this.argent;
	}

	public void direBonjour() {
		System.out.println("(" + getNom() + ")" + " - " + "Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du "
				+ getBoisson());
	}

	private void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);
	}

	public void boire() {
		System.out.println("(" + getNom() + ")" + " - " + "Mmmm, un bon verre de " + getBoisson() + " !" + " GLOUPS !");
	}

	public void perdreArgent(int perte) {
		this.argent -= perte;
	}

	public void gagnerArgent(int gain) {
		this.argent += gain;
	}

	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à " + prix);
			perdreArgent(prix);
		} else {
			parler("je n'ai plus que " + getArgent() + " .Je ne peux m'offrir un " + bien + " à " + prix + " sous.");

		}

	}

}
