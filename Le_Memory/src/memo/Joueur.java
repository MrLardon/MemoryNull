package memo;

import memo.carte.PaquetCarte;

public class Joueur {
	
	
	private final String pseudo;
	
	private PaquetCarte pc;
	
	

	public Joueur(String pseudo, PaquetCarte pc) {
		super();
		this.pseudo = pseudo;
		this.pc = pc;
	}
	
	public String getPseudo() {
		return pseudo;
	}

}
