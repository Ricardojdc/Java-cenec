package ricardo.torneopoder;

public class Universo6 extends Universo7 {
	
	byte[] estado ={1,2,4};

	public Universo6(String nombre, int puntosVida, int ataqueFisico, int resistencia, int ki) {
		super(nombre, puntosVida, ataqueFisico, resistencia, ki);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nUniverso6 ki=" + ki + ", nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataqueFisico="
				+ ataqueFisico + ", resistencia=" + resistencia;
	}

	

	
}
