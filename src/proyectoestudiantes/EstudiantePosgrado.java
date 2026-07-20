package proyectoestudiantes;

// Clase derivada que se hereda de Estudiante
public class EstudiantePosgrado extends Estudiante {

    // Atributo de la clase derivada
    private String especialidad;

    // Constructor
    public EstudiantePosgrado(String nombre, int edad, double promedio, String especialidad) {

        // Llama al constructor de la clase base
        super(nombre, edad, promedio);

        this.especialidad = especialidad;
    }

    // Metodo sobrescrito para mostrar informacion adicional
    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Especialidad: " + especialidad);
    }

    // Metodo exclusivo de esta clase
    public void realizarInvestigacion() {

        System.out.println("El estudiante participa en un proyecto de investigacion.");
    }

}