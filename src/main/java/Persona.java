public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String fechadenacimiento;
    protected String genero;
    protected double estatura;
    protected double peso;

    // Constructor
    public Persona(String nombre, String apellido, String fechadenacimiento, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechadenacimiento = fechadenacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void MostrarInfomacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de Nacimiento: " + fechadenacimiento);
        System.out.println("Género: " + genero);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}
