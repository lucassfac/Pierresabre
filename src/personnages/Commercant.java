package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer() {
		int argent = getArgent();
		perdreArgent(argent);
		parler("J'ai tout perdu! Le monde est rop injuste..");
		return argent;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(getArgent() + " sous ! Je te remercie généreux donateur !");
	}

	@Override
	private void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);
	}

}
