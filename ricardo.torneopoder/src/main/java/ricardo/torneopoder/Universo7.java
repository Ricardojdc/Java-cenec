package ricardo.torneopoder;

public class Universo7 extends Luchador {
	
	int ki;
	byte[] estado ={1,2,4,20,100};

	
	
	public Universo7(String nombre, int puntosVida, int ataqueFisico, int resistencia, int ki) {
		super(nombre, puntosVida, ataqueFisico, resistencia);
		this.ki = ki;
		// TODO Auto-generated constructor stub
	}
	
	

	public byte[] getEstado() {
		return estado;
	}



	public void setEstado(byte[] estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "\nUniverso7 ki=" + ki + ", nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataqueFisico="
				+ ataqueFisico + ", resistencia=" + resistencia;
	}

	public int getKi() {
		return ki;
	}

	public void setKi(int ki) {
		this.ki = ki;
	}
	

}
