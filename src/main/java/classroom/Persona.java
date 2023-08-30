package classroom;
public class Persona {
	private static int totalPersonas = 0;
    private long cedula;
    private String nombre;
    public Persona(String nombre, long cedula) {
    	this.cedula = cedula;
    	this.nombre = nombre;
    }
    public Persona(long cedula) {
    	this.cedula = cedula;
    	this.nombre = "";
    	totalPersonas++;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
        totalPersonas++;
    }
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
