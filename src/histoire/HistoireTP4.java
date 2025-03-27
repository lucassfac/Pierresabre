package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof", "kombucha", 54);

		Commercant marco = new Commercant("Marco", 0);

		Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", 45);

		Ronin roro = new Ronin("Roro",54);
		
		roro.provoquer(yaku);
		
		
		
		

	}

}
