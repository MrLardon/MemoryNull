package memo.carte;

public enum EnumSymbole {
SOLEIL(" Sun"), CHAT("Chat"), MAISON("Tipi"), OURS("Ours"), CHIEN(" Dog"), ETOILE("Star"), NEIGE("Snow"), GRAINE("Seed"), LAC(" Lac"), DOS("Back"), VIDE("Vide") ;
	//[liste de 0 a 10]
	private static final EnumSymbole[] LES_SYMBOLES = EnumSymbole.values();
	public static final int NBR_SYMBOLES = LES_SYMBOLES.length;
	
	private String Blablou;
	
	private EnumSymbole(String Blabla) {
		this.Blablou = Blabla;
	}

	public String toString() {
		return this.Blablou;
	}
	
	public static EnumSymbole get(int  i) {
		return LES_SYMBOLES[i-1];
	}



	public String getBlablou() {
		return Blablou;
	}



	
	
	
}

