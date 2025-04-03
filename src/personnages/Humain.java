package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected Humain[] memoire = new Humain[30];
	protected int nbConnaissnce = 0;

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

	public void faireConnaisanceAvec(Humain homme2) {
		direBonjour();
		homme2.repondre(this); // this humain 1
		memoriser(homme2);

	}

	private void repondre(Humain homme1) {
		direBonjour();
		memoriser(homme1);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissnce < 30) {
			memoire[nbConnaissnce] = humain;
			nbConnaissnce++;
		} else {
			for (int i = 1; i < memoire.length; i++) {
				memoire[i - 1] = memoire[i];
			}
			memoire[memoire.length - 1] = humain;
		}

	}

	public void listerConnaisance() {
		for (int i = 0; i < memoire.length; i++) {
			System.out.println(memoire[i]);
		}
	}

}
