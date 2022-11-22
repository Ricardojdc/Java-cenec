package ricardo.torneopoder;

public class DemonioFrio extends Universo7 {
	


	byte[] estado ={1,120};

	public DemonioFrio(String nombre, int puntosVida, int ataqueFisico, int resistencia, int ki) {
		super(nombre, puntosVida, ataqueFisico, resistencia, ki);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "\nDemonioFrio ki=" + ki + ", nombre=" + nombre + ", puntosVida="
				+ puntosVida + ", ataqueFisico=" + ataqueFisico + ", resistencia=" + resistencia;
	}
	
	

}
