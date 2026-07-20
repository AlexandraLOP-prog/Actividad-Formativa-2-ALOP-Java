package proyectoestudiantes;

// Clase principal donde se prueban las clases derivadas
public class Main {

    public static void main(String[] args) {

        // Crear un estudiante de licenciatura
        EstudianteLicenciatura estudiante1 =
                new EstudianteLicenciatura(
                        "Alexandra",
                        20,
                        95,
                        "Ingenieria en Software");

        // Crear un estudiante de posgrado
        EstudiantePosgrado estudiante2 =
                new EstudiantePosgrado(
                        "Armin",
                        25,
                        92,
                        "Inteligencia Artificial");

        // Mostrar información del estudiante de licenciatura
        System.out.println("===== ESTUDIANTE DE LICENCIATURA =====");

        estudiante1.mostrarInformacion();

        if (estudiante1.aprobo()) {
            System.out.println("Resultado: El estudiante aprobo.");
        } else {
            System.out.println("Resultado: El estudiante no aprobo.");
        }

        estudiante1.realizarServicioSocial();

        System.out.println();

        // Mostrar información del estudiante de posgrado
        System.out.println("===== ESTUDIANTE DE POSGRADO =====");

        estudiante2.mostrarInformacion();

        if (estudiante2.aprobo()) {
            System.out.println("Resultado: El estudiante aprobo.");
        } else {
            System.out.println("Resultado: El estudiante no aprobo.");
        }

        estudiante2.realizarInvestigacion();

    }

}