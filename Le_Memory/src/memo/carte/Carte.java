package memo.carte;

public class Carte {

	public  EnumSymbole dos ;
	public  EnumSymbole face ;
	public boolean visible = true;
	
	
	
	
	public Carte(int face) {
		super();
		this.face = EnumSymbole.get(face);
		this.dos = EnumSymbole.DOS;
		
	}
	
	public Carte() {
		super();
		this.face = EnumSymbole.VIDE;
		this.dos = EnumSymbole.VIDE;
	}



	public static EnumSymbole getDos() {
		return dos;
	}

	public static EnumSymbole getFace() {
		return face;
	}

	public static boolean isVisible() {
		return visible;
	}

	@Override
	public String toString() {
		return "Carte [" + face + " : "+ dos + " : "+ visible + "]";
	}
	
}
