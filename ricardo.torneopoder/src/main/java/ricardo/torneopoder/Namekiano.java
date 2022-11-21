/**
 * 
 */
package ricardo.torneopoder;

public class Namekiano extends Luchador {
	
	int masenko;

	public Namekiano(String nombre, int puntosVida, int ataqueFisico, int resistencia,int masenko) {
		super(nombre, puntosVida, ataqueFisico, resistencia);
		this.masenko = masenko;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nNamekiano masenko=" + masenko + ", nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataqueFisico="
				+ ataqueFisico + ", resistencia=" + resistencia + "";
	}

	
	
}
