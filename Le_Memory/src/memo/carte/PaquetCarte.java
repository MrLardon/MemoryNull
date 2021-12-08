package memo.carte;

import java.util.ArrayList;
import java.util.List;

public class PaquetCarte {
	
	public static final int NBR_PAIRES=10;
	
	private List<Carte> paquetcartes= new ArrayList<Carte>();

	public PaquetCarte() {
		super();
		for (int j = 1; j <= NBR_PAIRES ; j++) {
			Carte incroyablecarte2 = new Carte(j);
			//System.out.println(incroyablecarte2);
			paquetcartes.add(incroyablecarte2);
			
			//paquetcartes.add(new Carte(j));
		}
	}

	public List<Carte> getPaquetcartes() {
		return paquetcartes;
	}

	public void setPaquetcartes(List<Carte> paquetcartes) {
		this.paquetcartes = paquetcartes;
	}

	@Override
	public String toString() {
		return "PaquetCarte [paquetcartes=" + paquetcartes + "]";
	}
	
	

}
