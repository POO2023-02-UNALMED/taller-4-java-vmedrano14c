package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Disiplinar"),FUNDAMENTACION(20, "Fundamentacio"),ELECTIVA(30, "Electiva");
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
}
