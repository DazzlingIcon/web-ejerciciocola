import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sistema {

    
    private Queue<String> colaClientes;

    public sistema() {
        colaClientes = new LinkedList<>();
    }

    
    public void add(String cliente) {
        colaClientes.add(cliente);
        System.out.println("Cliente " + cliente + " ha sido agregado a la cola.");
    }

    
    public void poll() {
        if (!colaClientes.isEmpty()) {
            String cliente = colaClientes.poll();
            System.out.println("Atendiendo al cliente: " + cliente);
        } else {
            System.out.println("No hay clientes en la cola para atender.");
        }
    }

   
    public void peek() {
        if (!colaClientes.isEmpty()) {
            String siguienteCliente = colaClientes.peek();
            System.out.println("El siguiente cliente para ser atendido es: " + siguienteCliente);
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }

    
    public void size() {
        int cantidad = colaClientes.size();
        System.out.println("Quedan " + cantidad + " cliente(s) en la cola.");
    }

    
    public void vaciarCola() {
        colaClientes.clear();
        System.out.println("La cola ha sido vaciada.");
    }

    
    public void imprimirCola() {
        if (!colaClientes.isEmpty()) {
            System.out.println("Clientes en espera: " + colaClientes);
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }

    public static void main(String[] args) {
        sistema sistema = new sistema();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Atención al Cliente ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver siguiente cliente");
            System.out.println("4. Ver cantidad de clientes en la cola");
            System.out.println("5. Vaciar cola");
            System.out.println("6. Imprimir cola");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    sistema.add(cliente);
                    break;
                case 2:
                    sistema.poll();
                    break;
                case 3:
                    sistema.peek();
                    break;
                case 4:
                    sistema.size();
                    break;
                case 5:
                    sistema.vaciarCola();
                    break;
                case 6:
                    sistema.imprimirCola();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}

