package proyectoestudiantes;

// Clase derivada que se hereda de Estudiante
public class EstudianteLicenciatura extends Estudiante {

    // Atributo de la clase derivada
    private String carrera;

    // Constructor
    public EstudianteLicenciatura(String nombre, int edad, double promedio, String carrera) {

        // Llama al constructor de la clase base
        super(nombre, edad, promedio);

        this.carrera = carrera;
    }

    // Método sobrescrito para mostrar información adicional
    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Carrera: " + carrera);
    }

    // Método exclusivo de esta clase
    public void realizarServicioSocial() {

        System.out.println("El estudiante realiza su servicio social.");
    }

}