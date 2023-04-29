package modelo.DAO;

public class Rol {

	private int id_Rol;
	private String titulo;
	
	public Rol() {
		
	}
	
	public Rol(int id_Rol, String titulo) {
		super();
		this.id_Rol = id_Rol;
		this.titulo = titulo;
	}
	public int getId_Rol() {
		return id_Rol;
	}
	public void setId_Rol(int id_Rol) {
		this.id_Rol = id_Rol;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
