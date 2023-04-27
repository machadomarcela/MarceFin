package FinTP;

public class Participante {
	private String nombre;
	private String equipo1;
	private String goles1;
	private String goles2;
	private String equipo2;
	public Participante(String nombre, String equipo1, String goles1, String goles2, String equipo2) {
		super();
		this.nombre = nombre;
		this.equipo1 = equipo1;
		this.goles1 = goles1;
		this.goles2 = goles2;
		this.equipo2 = equipo2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public String getGoles1() {
		return goles1;
	}
	public void setGoles1(String goles1) {
		this.goles1 = goles1;
	}
	public String getGoles2() {
		return goles2;
	}
	public void setGoles2(String goles2) {
		this.goles2 = goles2;
	}
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	
	
	
	

}
