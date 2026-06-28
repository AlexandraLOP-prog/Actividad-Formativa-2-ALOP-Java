package proyectoestudiantes;

public class Main {

	public static void main(String[] args) {

		        // Crear objetos de la clase Estudiante
		        Estudiante estudiante1 =
		                new Estudiante("Alexandra", 20, 95);

		        Estudiante estudiante2 =
		                new Estudiante("Armin", 19, 68);

		        Estudiante estudiante3 =
		                new Estudiante("Claire", 21, 88);

		        // Mostrar información inicial
		        System.out.println("LISTA DE ESTUDIANTES");

		        estudiante1.mostrarInformacion();
		        estudiante2.mostrarInformacion();
		        estudiante3.mostrarInformacion();

		        // Actualizar promedio
		        estudiante2.actualizarPromedio(75);

		        System.out.println("PROMEDIO ACTUALIZADO");

		        estudiante2.mostrarInformacion();

		        // Verificar aprobación
		        if (estudiante1.aprobo()) {
		            System.out.println("Alexandra aprobo.");
		        }

		        if (estudiante2.aprobo()) {
		            System.out.println("Armin aprobo.");
		        }

		        if (estudiante3.aprobo()) {
		            System.out.println("Claire aprobo.");
		        }
		    }

		}
	
