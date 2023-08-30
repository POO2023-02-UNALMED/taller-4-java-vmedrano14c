package classroom;

public class Asignatura {
    private String nombre;
    private int codigoExterno;
    private Tipo tipo;
    public Asignatura() {
    	this.nombre = "";
    	this.tipo = Tipo.FUNDAMENTACION;
    	this.codigoExterno = 0;
    }
    public Asignatura(String nombre) {
    	this.nombre = nombre;
    	this.tipo = Tipo.FUNDAMENTACION;
    	this.codigoExterno = 0;
    }
    public Asignatura(int codigoExterno) {
    	this.nombre = "";
    	this.tipo = Tipo.FUNDAMENTACION;
    	this.codigoExterno = codigoExterno;
    }
    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0;
    }
    public void cambiarDatos(String nombre, Tipo tipo, int codigoExterno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
    }
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public Tipo getTipo() {
    	return tipo;
    }
    public void setTipo(Tipo tipo) {
    	this.tipo = tipo;
    }
    public int getCodigoExterno() {
    	return codigoExterno;
    }
    public void setCodigoExterno(int codigoExterno) {
    	this.codigoExterno = codigoExterno;
    }
    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", codigoExterno=" + codigoExterno +
                '}';
    }
}
