package classroom;
public class Grupo {
    private String nombre;
    private List<Estudiante> estudiantes;
    private List<Asignatura> asignaturas;
    public Grupo() {
        this.nombre = "";
        this.estudiantes = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }
    public Grupo(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + estudiantes +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
