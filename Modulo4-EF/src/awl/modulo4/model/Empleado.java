package awl.modulo4.model;

public class Empleado {

	private int idempleado;
	private String nombreempleado;
	private String especialidad;
	
	
	
	public Empleado(String nombreempleado, String especialidad) {
		this.nombreempleado = nombreempleado;
		this.especialidad = especialidad;
	}



	public int getIdempleado() {
		return idempleado;
	}



	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}



	public String getNombreempleado() {
		return nombreempleado;
	}



	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}



	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", nombreempleado=" + nombreempleado + ", especialidad="
				+ especialidad + "]";
	}
	
	
	
}
