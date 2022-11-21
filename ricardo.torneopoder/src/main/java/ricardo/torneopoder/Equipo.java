package ricardo.torneopoder;

import java.util.ArrayList;
import java.util.Queue;
import java.util.List;

public class Equipo {
	
	String nombreDios;
	String universo;
	List<Luchador> equipo =  new ArrayList<Luchador>();

	
	
	public Equipo(String nombreDios, String universo) {
		super();
		this.nombreDios = nombreDios;
		this.universo = universo;
	}
	public void addLuchador (Luchador luchador) {
		
		equipo.add(luchador);
		
	}
		
}
