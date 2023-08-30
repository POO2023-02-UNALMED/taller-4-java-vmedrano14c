package classroom;
public class Grupo {
    private Persona[] estudiantes;
    private Persona profesor;
    private Asignatura asignatura;
    private final int codigo;
    private String horario;
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
    	this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }
    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Persona[]personas = new Persona[cantidadEstudiantes];
        this(personas, profesor, asignatura, codigo, horario);
    }
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.codigo = 0;
    	this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    public void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    public void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
    public Persona[] getEstudiantes() {
    	return estudiantes;
    }
    public void setEstudiantes(Persona[] estudiantes) {
    	this.estudiantes = estudiantes;
    }
    public Persona getProfesor() {
    	return profesor;
    }
    public void setProfesor(Persona profesor) {
    	this.profesor = profesor;
    }
    public Asignatura getAsignatura() {
    	return asignatura;
    }
    public void setAsignatura(Asignatura asignatura) {
    	this.asignatura = asignatura;
    }
    public int getCodigo() {
    	return codigo;
    }
    public String getHorario() {
    	return horario;
    }
    public void setHorario(String horario) {
    	this.horario = horario;
    }
}
