package ricardo.torneopoder;

import java.util.Random;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		byte taks = 5;
		boolean ganador = false;
		Random rand = new Random();
		byte[] luchadores = {0,0};
		
		
		
		//Equipo 1
		
		Universo7 goku = new Universo7("Goku", 4000, 500, 8000, 200);	
		Universo7 vegeta = new Universo7("Vegeta", 3000, 200, 8000, 600);
		Namekiano piccolo = new Namekiano("Piccolo", 1500, 300, 8000,300);
		
		Equipo eq = new Equipo("Beerus", "Universo 7");
		
		eq.addLuchador(goku);
		eq.addLuchador(vegeta);
		eq.addLuchador(piccolo);
		
	
		
		
		//Equipo 2
		DemonioFrio frost = new DemonioFrio("Frost", 2000, 150,3000,300);
		Universo6 caulifla = new Universo6("Caulifla", 5000, 500, 6000,300);
		Universo6 kale = new Universo6("Kale", 4000, 500, 100000, 900);
		
		Equipo eq2 = new Equipo("Champa", "Universo 6");
		
		eq2.addLuchador(frost);
		eq2.addLuchador(caulifla);
		eq2.addLuchador(kale);
				
		//Comienzo del torneo
		
		while(taks>0 || ganador) {
			
			luchadores[0] = (byte) rand.nextInt(eq.equipo.size());
			luchadores[1] = (byte) rand.nextInt(eq2.equipo.size());
		
			
			
			
			taks--;
		}
		
	
	
		
		
	}

}
