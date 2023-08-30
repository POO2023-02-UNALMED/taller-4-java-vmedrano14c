package classroom;

public enum Tipo {
	DISCIPLINAR(10, null),FUNDAMENTACION(20, null),ELECTIVA(30, null);
	
	public int codigo;
	public String nombre;
	private Tipo(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
