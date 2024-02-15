public class Estudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String apellido, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Constructor sin el parámetro promedio
    public Estudiante(String nombre, String apellido, String carrera) {
        this(nombre, apellido, carrera, 0.0); // Se usa la constante 0.0 como valor por defecto para predio
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setPromedio(double promedio) {

        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void imprimirDetalles() {
        System.out.println("Estudiante registrado: " + this.nombre + " " + this.apellido + ", " + this.carrera + ", "
                + this.promedio);
    }

}
