public class Registro_estud {

    public static void main(String[] args) throws Exception {
        Estudiante e1 = new Estudiante("María", "Torres", "Ingeniería", 8.5);
        e1.imprimirDetalles();
        Estudiante e2 = new Estudiante("Pablo", "Gonzáles", "Contaduría");
        e2.imprimirDetalles();
        Escuela escuela = new Escuela();
        System.out.println(escuela.imprimirRegistro(e1));
        System.out.println(escuela.imprimirRegistro(e2));
    }
}
