package ricardo.torneopoder;

public class Luchador {
	
	String nombre;
	int puntosVida;
	int puntosVidaActual;
	
	int ataqueFisico;
	int resistencia;
	public Luchador() {
		
		
	}
	
	public Luchador(String nombre, int puntosVida, int ataqueFisico, int resistencia) {
		super();
		this.nombre = nombre;
		this.puntosVida = puntosVida;
		this.ataqueFisico = ataqueFisico;
		this.resistencia = resistencia;
		this.puntosVidaActual = puntosVida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getAtaqueFisico() {
		return ataqueFisico;
	}

	public void setAtaqueFisico(int ataqueFisico) {
		this.ataqueFisico = ataqueFisico;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getPuntosVidaActual() {
		return puntosVidaActual;
	}

	public void setPuntosVidaActual(int puntosVidaActual) {
		this.puntosVidaActual = puntosVidaActual;
	}

	
	

	

}
