import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] palabras = {"computadora", "refrigeradora", "carro", "moto"};
        String palabra = palabras[random.nextInt(palabras.length)];
        String palabra_modificada = palabra.replaceAll("(?!^|.$)[^ ]", "_");
        int intentos = 0;
        String palabra_insertada;


        System.out.println("Bienvenido a Descubre la Palabra!");
        System.out.println("Adivina la siguiente palabra: ");
        System.out.println(palabra_modificada);

        mostrar_pista(palabra, intentos);
        palabra_insertada = sc.nextLine().toLowerCase();

        while (!palabra_insertada.equals(palabra)) {
            intentos++;

            if (intentos == 3) break;

            mostrar_pista(palabra, intentos);
            palabra_insertada = sc.nextLine().toLowerCase();
        }

        if (intentos == 1 ) {
            System.out.println("Felicidades, usted obtuvo 80 creditos!");
        } else if (intentos == 2) {
            System.out.println("Felicidades, usted obtuvo 60 creditos!");
        } else if (intentos == 3) {
            System.out.println("No adivino, obtuvo 0 creditos!");
        } else {
           System.out.println("Felicidades, usted obtuvo 100 creditos!");
        }
    }

    static void mostrar_pista(String palabra, int intentos) {
        System.out.println("Pista: ");

        switch (palabra) {
            case "computadora": {
                if (intentos == 0) {
                    System.out.println("Es una maquina digital");
                }
                if (intentos == 1) {
                    System.out.println("Tiene una pantalla");
                }
                if (intentos == 2) {
                    System.out.println("Esta con un raton");
                }
                break;
            }

            case "refrigeradora": {
                if (intentos == 0) {
                    System.out.println("Es un electrodomestico");
                }
                if (intentos == 1) {
                    System.out.println("Tiene puerta");
                }
                if (intentos == 2) {
                    System.out.println("Es frio por dentro");
                }
                break;
            }

            case "carro": {
                if (intentos == 0) {
                    System.out.println("Tiene ruedas");
                }
                if (intentos == 1) {
                    System.out.println("Tiene puertas");
                }
                if (intentos == 2) {
                    System.out.println("Hay muchos en las calles");
                }
                break;
            }

            case "moto": {
                if (intentos == 0) {
                    System.out.println("Tiene ruedas");
                }
                if (intentos == 1) {
                    System.out.println("No tiene puertas");
                }
                if (intentos == 2) {
                    System.out.println("Mayormente usaras casco");
                }
                break;
            }

            default: {
                System.out.println("Desafortunadamente aun no hay pistas para esa palabra :(");
                break;
            }
        }
    }
}
