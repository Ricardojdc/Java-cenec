package ricardo.torneopoder;

import java.util.HashMap;


public class Saiyajin extends Luchador {
	private HashMap<String,Integer> estados;
	int ki;


	public Saiyajin(String nombre, int puntosVida, int ataqueFisico, int resistencia,byte universo) {
		super(nombre, puntosVida, ataqueFisico, resistencia);
		estados=new HashMap<String,Integer>();
		estados.put("Forma Base", 1);
		estados.put("ssj", 2);
		estados.put("ssj", 4);
		if(universo==7) {
			estados.put("dios rojo", 20);
			estados.put("dios azul", 100);
		}
		
	}
	public int getKi() {
		return ki;
	}

	public void setKi(int ki) {
		this.ki = ki;
	}
	
	
}
