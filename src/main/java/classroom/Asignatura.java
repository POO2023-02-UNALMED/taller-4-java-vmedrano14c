package classroom;

public class Asignatura {
    private String nombre;
    private int codigoInterno;
    private int codigoExterno;
    private Tipo tipo;
    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }
    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre, Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
