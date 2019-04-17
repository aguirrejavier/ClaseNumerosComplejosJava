package complejo.ejer;

import java.util.BitSet;
import java.util.Comparator;

public class ComplejosPorParteReal implements Comparator<Complejo> {

	
	@Override
	public int compare(Complejo uno, Complejo dos) {
		return uno.real.compareTo(dos.real);
	}
	
	
	
}
