import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char quiere_ingresar = 'S';
        int total_estudiantes = 0;

        while (quiere_ingresar == 'S') {
            ingresar_estudiante(sc);
            total_estudiantes++;

            System.out.println("Desea ingresar otro estudiante? (S o N): ");
            quiere_ingresar = sc.nextLine().toUpperCase().charAt(0);
        }

        System.out.printf("Total de estudiantes ingresados: %d", total_estudiantes);
    }
    static void ingresar_estudiante(Scanner sc) {
        int cedula, edad;
        String nombres, apellidos, nivel_estudio, cedula_string, edad_string;
        final String string_regex = "^[a-zA-Z ]+$";

        System.out.println("Ingrese numero de cedula: ");
        cedula_string = sc.nextLine();

        while (!cedula_string.matches("^[0-9]{1,10}$")) {
            System.out.println("Ingrese numero de cedula (solo numeros, maximo 10): ");
            cedula_string = sc.nextLine();
        }
        cedula = Integer.parseInt(cedula_string);

        System.out.println("Ingrese su nombre: ");
        nombres = sc.nextLine();

        while (!nombres.matches(string_regex)) {
            System.out.println("Ingrese su nombre (solo letras): ");
            nombres = sc.nextLine();
        }

        System.out.println("Ingrese sus apellidos: ");
        apellidos = sc.nextLine();

        while (!apellidos.matches(string_regex)) {
            System.out.println("Ingrese sus apellidos (solo letras): ");
            apellidos = sc.nextLine();
        }

        System.out.println("Ingrese su edad: ");
        edad_string = sc.nextLine();

        while (!edad_string.matches("^[0-9]{1,3}$")) {
            System.out.println("Ingrese su edad (solo numeros): ");
            edad_string = sc.nextLine();
        }
        edad = Integer.parseInt(edad_string);

        System.out.println("Ingrese su nivel de estudio (inicial, basica o bachillerato): ");
        nivel_estudio = sc.nextLine();

        while (!nivel_estudio.matches("(?i)^(inicial|basica|bachillerato)$")) {
            System.out.println("Ingrese su nivel de estudio (inicial, basica o bachillerato): ");
            nivel_estudio = sc.nextLine();
        }
    }
}