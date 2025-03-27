package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom,int argent) {
		super(nom,"shochu",argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = getArgent();
		double coeff = 0.1;
		int temp = (int) (coeff*(argent));
		parler(beneficiaire.getNom() + " prend ces " + temp + " sous.");
		beneficiaire.recevoir(temp);
		perdreArgent(temp);
		
	}
	
	private void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\r\n"
				+ "marchand!");
		int force = 2*honneur;
		int argentAd = adversaire.getArgent();
		int argent = getArgent();
		if(force>=adversaire.getReputation()) {
			gagnerArgent(argentAd);
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
			honneur += 1;
		}else {
			perdreArgent(argent);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			honneur -= 1;
		}
	}
	
	
}
