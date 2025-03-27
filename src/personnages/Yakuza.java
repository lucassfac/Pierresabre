package personnages;

public class Yakuza extends Humain {

	private int reputaion = 0;
	private String clan;

	public Yakuza(String nom, String clan, int argent) {
		super(nom, "whisky", argent);
		this.clan = clan;

	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse !");
		int argent = victime.getArgent();
		victime.seFaireExtorquer();
		gagnerArgent(argent);
		this.reputaion += 1;
	}

	private void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);
	}

}
