package ricardo.torneopoder;

public class Universo7 extends Luchador {
	
	int ki;
	String[] estado ={"Forma base x1","Ssj x2","Ssj2 x4","Ssj dios rojo x20","Ssj dios azul x100"};

	
	
	public Universo7(String nombre, int puntosVida, int ataqueFisico, int resistencia, int ki) {
		super(nombre, puntosVida, ataqueFisico, resistencia);
		this.ki = ki;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nUniverso7 ki=" + ki + ", nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataqueFisico="
				+ ataqueFisico + ", resistencia=" + resistencia + "";
	}
	

}
