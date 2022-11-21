package ricardo.torneopoder;

public class Universo6 extends Universo7 {
	
	String[] estado ={"Forma base x1","Ssj x2","Ssj2 x4"};

	public Universo6(String nombre, int puntosVida, int ataqueFisico, int resistencia, int ki) {
		super(nombre, puntosVida, ataqueFisico, resistencia, ki);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nUniverso6 ki=" + ki + ", nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataqueFisico="
				+ ataqueFisico + ", resistencia=" + resistencia + "";
	}

	

	
}
