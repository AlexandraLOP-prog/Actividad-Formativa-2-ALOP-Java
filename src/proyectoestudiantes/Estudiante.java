package proyectoestudiantes;
//Clase que representa un estudiante
public class Estudiante {

 // Atributos del estudiante
 private String nombre;
 private int edad;
 private double promedio;

 // Constructor
 public Estudiante(String nombre, int edad, double promedio) {
     this.nombre = nombre;
     this.edad = edad;
     this.promedio = promedio;
 }

 // Método para mostrar la información
 public void mostrarInformacion() {
     System.out.println("Nombre: " + nombre);
     System.out.println("Edad: " + edad);
     System.out.println("Promedio: " + promedio);
     System.out.println("----------------");
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

