import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hash ejemplo = new Hash();
        Hash2 ejemplo2 = new Hash2();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Actualizar elemento");
            System.out.println("5. Obtener tamaño del HashMap");
            System.out.println("6. Vaciar HashMap");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la clave (entero): ");
                    int claveAgregar = scanner.nextInt();
                    System.out.print("Ingresa el valor (String): ");
                    String valorAgregar = scanner.next();
                    ejemplo.agregarElemento(claveAgregar, valorAgregar);
                    break;
                case 2:
                    System.out.print("Ingresa la clave a eliminar: ");
                    int claveEliminar = scanner.nextInt();
                    ejemplo.eliminarElemento(claveEliminar);
                    break;
                case 3:
                    System.out.print("Ingresa la clave a buscar: ");
                    int claveBuscar = scanner.nextInt();
                    ejemplo.buscarElemento(claveBuscar);
                    break;
                case 4:
                    System.out.print("Ingresa la clave a actualizar: ");
                    int claveActualizar = scanner.nextInt();
                    System.out.print("Ingresa el nuevo valor: ");
                    String nuevoValor = scanner.next();
                    ejemplo2.actualizarElemento(claveActualizar, nuevoValor);
                    break;
                case 5:
                    System.out.println("El tamaño del HashMap es: " + ejemplo2.obtenerTamaño());
                    break;
                case 6:
                    ejemplo2.vaciarMapa();
                    break;
                case 7:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }
}