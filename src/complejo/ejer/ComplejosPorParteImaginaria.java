package complejo.ejer;

import java.util.Comparator;

public class ComplejosPorParteImaginaria implements Comparator<Complejo> {

	@Override
	public int compare(Complejo uno, Complejo dos) {
		
		return uno.imaginario.compareTo(dos.imaginario);
	}

	
}
