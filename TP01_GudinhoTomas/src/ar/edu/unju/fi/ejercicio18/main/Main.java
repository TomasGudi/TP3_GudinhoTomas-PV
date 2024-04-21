package ar.edu.unju.fi.ejercicio18.main;

import ar.edu.unju.fi.ejercicio18.model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pais> paises = cargarPaises(); 

        List<DestinoTuristico> destinos= new ArrayList<>();

        int opcion;
        do {
        	System.out.println("\n****** Menu ******");
            System.out.println("1)- Alta de destino turístico");
            System.out.println("2)- Mostrar todos los destinos turísticos");
            System.out.println("3)- Modificar el país de un destino turístico");
            System.out.println("4)- Limpiar lista de destinos turísticos");
            System.out.println("5)- Eliminar un destino turístico");
            System.out.println("6)- Mostrar destinos turísticos ordenados por nombre");
            System.out.println("7)- Mostrar todos los países");
            System.out.println("8)- Mostrar destinos turísticos por país");
            System.out.println("9)- Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        altaDestinoTuristico(destinos, paises, scanner);
                        break;
                    case 2:
                        mostrarTodosDestinos(destinos);
                        break;
                    case 3:
                        modificarPaisDestino(destinos, paises, scanner);
                        break;
                    case 4:
                        limpiarDestinos(destinos);
                        break;
                    case 5:
                        eliminarDestino(destinos, scanner);
                        break;
                    case 6:
                        destinosOrdenadosPorNombre(destinos);
                        break;
                    case 7:
                        mostrarPaises(paises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(destinos, scanner);
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor válido.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperado: "+e.getMessage());
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static List<Pais> cargarPaises() {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("ARG", "Argentina"));
        paises.add(new Pais("BRA", "Brasil"));
        paises.add(new Pais("COL", "Colombia"));
        paises.add(new Pais("CHL", "Chile"));
        paises.add(new Pais("URY", "Uruguay"));
        paises.add(new Pais("MEX", "Mexico"));
        paises.add(new Pais("USA", "Estados Unidos"));
        return paises;
    }

    private static void altaDestinoTuristico(List<DestinoTuristico> destinos, List<Pais> paises, Scanner scanner) {
        System.out.print("Ingrese codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese codigo de pais: ");
        String codigoPais = scanner.nextLine();

        Pais pais = buscarPaisPorCodigo(paises, codigoPais);
        if (pais == null) {
            System.out.println("País no encontrado.");
        } else {
            System.out.print("Ingrese cantidad de días: ");
            int cantidadDias = scanner.nextInt();

            DestinoTuristico nuevoDestino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
            destinos.add(nuevoDestino);
            System.out.println("Destino turístico agregado");
        }
    }

    private static void mostrarTodosDestinos(List<DestinoTuristico> destinos) {
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void modificarPaisDestino(List<DestinoTuristico> destinos, List<Pais> paises, Scanner scanner) {
        System.out.print("Ingrese codigo de destino turistico: ");
        String codigoDestino = scanner.nextLine();

        DestinoTuristico destino = buscarDestinoPorCodigo(destinos, codigoDestino);
        if (destino == null) {
            System.out.println("Destino turistico no encontrado.");
        } else {
            System.out.print("Ingrese nuevo codigo de pais: ");
            String nuevoCodigoPais = scanner.nextLine();

            Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);
            if (nuevoPais == null) {
                System.out.println("País no encontrado");
            } else {
                destino.setPais(nuevoPais);
                System.out.println("País modificado correctamente.");
            }
        }
        scanner.next();
    }

    private static void limpiarDestinos(List<DestinoTuristico> destinos) {
        destinos.clear();
        System.out.println("Lista vacia");
    }

    private static void eliminarDestino(List<DestinoTuristico> destinos, Scanner scanner) {
        System.out.print("Ingrese codigo a eliminar: ");
        String codigoEliminar = scanner.nextLine();

        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo().equals(codigoEliminar)) {
                iterator.remove();
                System.out.println("Destino turistico eliminado");
                return;
            }
        }
        System.out.println("Destino turistico no encontrado.");
    }

    private static void destinosOrdenadosPorNombre(List<DestinoTuristico> destinos) {
        Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));
        mostrarTodosDestinos(destinos);
    }

    private static void mostrarPaises(List<Pais> paises) {
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    private static void mostrarDestinosPorPais(List<DestinoTuristico> destinos, Scanner scanner) {
        System.out.print("Ingrese codigo de país: ");
        String codigoPais = scanner.nextLine();

        System.out.println();
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo().equals(codigoPais)) {
                System.out.println(destino);
            }
        }
    }

    private static Pais buscarPaisPorCodigo(List<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equalsIgnoreCase(codigo)) {
                return pais;
            }
        }
        return null;
    }

    private static DestinoTuristico buscarDestinoPorCodigo(List<DestinoTuristico> destinos, String codigo) {
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo().equalsIgnoreCase(codigo)) {
                return destino;
            }
        }
        return null;
    }
}

