import java.util.ArrayList;

public class Profesor extends Persona {
    private String asignatura;
    private int idprofesor;

    public Profesor(String nombre, String apellido, String fechadenacimiento, String genero, double estatura, double peso, String asignatura, int idprofesor) {
        super(nombre, apellido, fechadenacimiento, genero, estatura, peso);
        this.asignatura = asignatura;
        this.idprofesor = idprofesor;
    }
    // Getters

    public String getAsignatura() {
        return asignatura;
    }

    public int getIdprofesor() {
        return idprofesor;
    }


    public void MostrarInfomacion() {
        super.MostrarInfomacion();
        System.out.println("Asignatura: " + asignatura);
        System.out.println("ID Profesor: " + idprofesor);
    }



}

