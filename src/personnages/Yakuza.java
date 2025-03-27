package personnages;

public class Yakuza extends Humain {

	private int reputation = 0;
	private String clan;

	public Yakuza(String nom, String clan, int argent) {
		super(nom, "whisky", argent);
		this.clan = clan;

	}
	
	public String getClan() {
		return this.clan;
	}
	

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + " si tu tiens � la vie donne moi ta bourse !");
		int argent = victime.getArgent();
		int temp = victime.getArgent();
		victime.seFaireExtorquer();
		gagnerArgent(argent);
		parler("J'ai pique les " + temp + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi Hi!");
		this.reputation += 1;
	}

	private void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);
	}
	
	public int perdre() {
		int argent = getArgent();
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + getClan()
				+ ".");
		perdreArgent(argent);
		reputation -= 1;
		return argent;
	}

	public int gagner(int gain) {
		int argent = getArgent();
		parler("Ce ronin pensait vraiment battre " +  getNom() + " du clan de "  + getClan()
				+ " Je l'ai dépouillé de ses " + gain + " sous." );
		gagnerArgent(gain);
		return argent;
		
	}
	
	public int getReputation() {
		return this.reputation;
	}
}
