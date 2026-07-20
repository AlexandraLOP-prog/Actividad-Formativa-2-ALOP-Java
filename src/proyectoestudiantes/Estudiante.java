package proyectoestudiantes;

// Clase base que representa a un estudiante
public class Estudiante {

    // Atributos protegidos para que las clases derivadas puedan usarlos
    protected String nombre;
    protected int edad;
    protected double promedio;

    // Constructor de la clase base
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }

    // Método para actualizar el promedio
    public void actualizarPromedio(double nuevoPromedio) {
        promedio = nuevoPromedio;
    }

    // Método para verificar si aprobó
    public boolean aprobo() {
        return promedio >= 70;
    }
}

