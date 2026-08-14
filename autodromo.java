import java.util.Scanner;
public class autodromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] pilotos = new String[10];
        String[] numerosVehiculo = new String[10];
        String[] marcas = new String[10];
        String[] modelos = new String[10];
        String[] categorias = new String[10];
        double[] tiempos = new double[10];
        int[] posiciones = new int[10];
        int total = 0;
        int opcion;
        //---------------------------------//
        //--|menu_principal_de_autodromo|--//
        //---------------------------------//
        do {
            System.out.println("menu principal de autodromo");
            System.out.println("1) Registrar competidor");
            System.out.println("2) Editar competidor");
            System.out.println("3) Listar competidores");
            System.out.println("4) Buscar competidor");
            System.out.println("5) Eliminar competidor");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------------//
                //--|registrar_competidor|--//
                //--------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del competidor");
                    System.out.println("id del competidor a registrar: " + id);
                    System.out.print("nombre del piloto: ");
                    pilotos[total] = entrada.nextLine();
                    System.out.print("numero del vehiculo: ");
                    numerosVehiculo[total] = entrada.nextLine();
                    System.out.print("marca del vehiculo: ");
                    marcas[total] = entrada.nextLine();
                    System.out.print("modelo del vehiculo: ");
                    modelos[total] = entrada.nextLine();
                    System.out.print("categoria de competencia: ");
                    categorias[total] = entrada.nextLine();
                    System.out.print("tiempo obtenido en minutos: ");
                    tiempos[total] = entrada.nextDouble();
                    System.out.print("posicion alcanzada: ");
                    posiciones[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Competidor registrado correctamente.");
                    total++;
                    break;
                //-----------------------//
                //--|editar_competidor|--//
                //-----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen competidores registrados.");
                        break;
                    }
                    System.out.println("Datos de los competidores");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Piloto: " + pilotos[i] + " | Vehiculo: " + numerosVehiculo[i] + " | Marca: " + marcas[i] + " | Modelo: " + modelos[i] + " | Categoria: " + categorias[i] + " | Tiempo: " + tiempos[i] + " minutos | Posicion: " + posiciones[i]);
                    }
                    System.out.print("Ingrese el ID del competidor: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del competidor");
                        System.out.print("Nuevo nombre del piloto: ");
                        pilotos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo numero del vehiculo: ");
                        numerosVehiculo[posicion] = entrada.nextLine();
                        System.out.print("Nueva marca del vehiculo: ");
                        marcas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo modelo del vehiculo: ");
                        modelos[posicion] = entrada.nextLine();
                        System.out.print("Nueva categoria de competencia: ");
                        categorias[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tiempo obtenido en minutos: ");
                        tiempos[posicion] = entrada.nextDouble();
                        System.out.print("Nueva posicion alcanzada: ");
                        posiciones[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Competidor actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|listar_competidores|--//
                //-------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen competidores registrados.");
                    } else {
                        System.out.println("Lista de competidores");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Piloto: " + pilotos[i] + " | Vehiculo: " + numerosVehiculo[i] + " | Marca: " + marcas[i] + " | Modelo: " + modelos[i] + " | Categoria: " + categorias[i] + " | Tiempo: " + tiempos[i] + " minutos | Posicion: " + posiciones[i]);
                        }
                    }
                    break;
                //-----------------------//
                //--|buscar_competidor|--//
                //-----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen competidores registrados.");
                        break;
                    }
                    System.out.println("busqueda de competidor");
                    System.out.print("ingresa la id para buscar competidor: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del competidor encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Piloto: " + pilotos[posicion] + " | Vehiculo: " + numerosVehiculo[posicion] + " | Marca: " + marcas[posicion] + " | Modelo: " + modelos[posicion] + " | Categoria: " + categorias[posicion] + " | Tiempo: " + tiempos[posicion] + " minutos | Posicion: " + posiciones[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|eliminar_competidor|--//
                //-------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen competidores registrados.");
                        break;
                    }
                    System.out.println("Datos de los competidores");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Piloto: " + pilotos[i] + " | Vehiculo: " + numerosVehiculo[i] + " | Marca: " + marcas[i] + " | Modelo: " + modelos[i] + " | Categoria: " + categorias[i] + " | Tiempo: " + tiempos[i] + " minutos | Posicion: " + posiciones[i]);
                    }
                    System.out.print("Ingrese el ID del competidor a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            pilotos[i] = pilotos[i + 1];
                            numerosVehiculo[i] = numerosVehiculo[i + 1];
                            marcas[i] = marcas[i + 1];
                            modelos[i] = modelos[i + 1];
                            categorias[i] = categorias[i + 1];
                            tiempos[i] = tiempos[i + 1];
                            posiciones[i] = posiciones[i + 1];
                        }
                        total--;
                        System.out.println("Competidor eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Autodromo.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}