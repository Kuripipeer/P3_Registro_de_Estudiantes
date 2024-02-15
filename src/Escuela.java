public class Escuela {
    
    public String imprimirRegistro(Estudiante estudiante){
        return "Estudiante registrado: " + estudiante.getNombre() + " " + estudiante.getApellido() + ", " +
         estudiante.getCarrera() + ", " + estudiante.getPromedio();

    }
}
