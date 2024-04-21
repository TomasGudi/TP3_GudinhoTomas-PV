package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jugador> jugadores = new ArrayList<>();

        int opcion;
        do {
        	System.out.println("\n****** Menu ******");
            System.out.println("1)- Alta de jugador");
            System.out.println("2)- Mostrar datos del jugador");
            System.out.println("3)- Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4)- Modificar los datos de un jugador");
            System.out.println("5)- Eliminar un jugador");
            System.out.println("6)- Mostrar cantidad total de jugadores");
            System.out.println("7)- Mostrar cantidad de jugadores por nacionalidad");
            System.out.println("8)- Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            try {
                switch (opcion) {
                    case 1:
                        altaJugador(jugadores, scanner);
                        break;
                    case 2:
                        mostrarDatosJugador(jugadores, scanner);
                        break;
                    case 3:
                        jugadoresPorApellido(jugadores);
                        break;
                    case 4:
                        modificarJugador(jugadores, scanner);
                        break;
                    case 5:
                        eliminarJugador(jugadores, scanner);
                        break;
                    case 6:
                        mostrarCantidadJugadores(jugadores);
                        break;
                    case 7:
                        jugadoresPorNacionalidad(jugadores, scanner);
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor valido");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperado: "+e.getMessage());
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void altaJugador(List<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese fecha de nacimiento (yyyy-MM-dd): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Ingrese nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        System.out.print("Ingrese estatura: ");
        double estatura = scanner.nextDouble();
        System.out.print("Ingrese peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese posición (delantero, medio, defensa, arquero): ");
        String posicion = scanner.nextLine();

        Jugador nuevoJugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
        jugadores.add(nuevoJugador);
        System.out.println("Jugador agregado");
    }

    private static void mostrarDatosJugador(List<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        for (Jugador jugador:jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println(jugador);
                scanner.next();
                return;
            }
        }
        
        System.out.println("No existe este jugador");
    }

    private static void jugadoresPorApellido(List<Jugador> jugadores) {
        Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    private static void modificarJugador(List<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.print("Ingrese nacionalidad: ");
                jugador.setNacionalidad(scanner.nextLine());
                System.out.print("Ingrese fecha de nacimiento (yyyy-MM-dd): ");
                jugador.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
                System.out.print("Ingrese posición (delantero, medio, defensa, arquero): ");
                jugador.setPosicion(scanner.nextLine());
                System.out.print("Ingrese nueva estatura (en metros): ");
                jugador.setEstatura(scanner.nextDouble());
                System.out.print("Ingrese nuevo peso (en kg): ");
                jugador.setPeso(scanner.nextDouble());
                scanner.next();
                return;
            }
        }
        System.out.println("No existe este jugador");
    }

    private static void eliminarJugador(List<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        Iterator<Jugador> iterator = jugadores.iterator();
        
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove();
                System.out.println("Jugador eliminado");
                scanner.next();
                return;
            }
        }
        
        System.out.println("Jugador no encontrado.");
    }

    private static void mostrarCantidadJugadores(List<Jugador> jugadores) {
        System.out.println("Cantidad de jugadores: " + jugadores.size());
    }

    private static void jugadoresPorNacionalidad(List<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        int cantidad = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                cantidad++;
            }
        }
        
        System.out.println("Jugadores de la nacionalidad '"+nacionalidad+"': "+cantidad);
        scanner.next();
    }
}
