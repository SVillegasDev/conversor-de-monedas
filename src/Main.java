import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuOpciones menu = new MenuOpciones();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            menu.mostrarMenu();
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 7) {
                if (opcion == 7) {
                    System.out.print("Ingresa la sigla de la primera moneda (ejemplo: EUR): ");
                    String moneda1 = scanner.next().toUpperCase();
                    System.out.print("Ingresa la sigla de la segunda moneda (ejemplo: EUR): ");
                    String moneda2 = scanner.next().toUpperCase();

                    if (moneda1.equals(moneda2)) {
                        System.out.println("Error: No se pueden convertir dos monedas iguales. Regresando al menú...");
                        System.out.println("*****************************");
                    } else {
                        System.out.print("Ingresa el monto a convertir: ");
                        float monto = scanner.nextFloat();
                        if (!menu.conversionPersonalizada(moneda1, moneda2, monto)) {
                            System.out.println("Error: Una o ambas monedas no son válidas. Regresando al menú...");
                            System.out.println("*****************************");
                        }
                    }
                } else {
                    System.out.print("Ingresa el monto a convertir: ");
                    float monto = scanner.nextFloat();
                    menu.ejecutarOpcion(opcion, monto);
                }
            } else if (opcion == 8) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Intenta nuevamente.");
                System.out.println("*****************************");
            }
        } while (opcion != 8);

        scanner.close();
    }
}