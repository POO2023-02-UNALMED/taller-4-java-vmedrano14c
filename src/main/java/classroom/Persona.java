package classroom;
public class Persona {
    private long cedula;
    private String nombre;
    public Persona() {
    	this.cedula = 0;
    	this.nombre = "";
    }
    public Persona(long cedula) {
    	this.cedula = cedula;
    	this.nombre = "";
    }
    public Persona(String nombre) {
        this.cedula = 0;
        this.nombre = nombre;
    }
    public Persona(long cedula, String nombre) {
    	this.cedula = cedula;
    	this.nombre = nombre;
    }
    public Persona(String nombre, long cedula) {
    	this.cedula = cedula;
    	this.nombre = nombre;
    }
    public long getCedula() {
        return cedula;
    }
    public void setCedula(long cedula) {
    	this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
