package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String opcion;
        String cadenaPrestamoAutos = "Listado de préstamos de automóviles\n\n";
        String cadenaPrestamoEducativos = "Listado de préstamos educativos\n\n";
        int contadorPrestamoAutos = 1;
        int contadorPrestamoEducativos = 1;

        System.out.println("Gestor de Préstamos");

        while (bandera) {
            System.out.print("\nIngrese 1 para crear un préstamo automóvil.\n"
                    + "Ingrese 2 para crear un préstamo de estudiante.\n> ");
            opcion = entrada.nextLine();

            if (opcion.equals("1") || opcion.equals("2")) {

                System.out.print("Ingrese el nombre del Beneficiario.\n> ");
                String nombreBenef = entrada.nextLine();
                System.out.print("Ingrese el apellido del Beneficiario.\n> ");
                String apellidoBenef = entrada.nextLine();
                System.out.print("Ingrese el username del Beneficiario.\n> ");
                String usernameBenef = entrada.nextLine();

                Persona benificiario = new Persona(nombreBenef,
                        apellidoBenef, usernameBenef);

                System.out.print("Ingrese el tiempo del préstamo en meses.\n> ");
                int tiempoMeses = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Ingrese la ciudad del préstamo.\n> ");
                String ciudad = entrada.nextLine();

                if (opcion.equals("1")) {

                    System.out.print("Ingrese el tipo de auto.\n> ");
                    String tipo = entrada.nextLine();
                    System.out.print("Ingrese la marca del auto.\n> ");
                    String marca = entrada.nextLine();

                    System.out.print("Ingrese el nombre del Garante.\n> ");
                    String nombreGarante = entrada.nextLine();
                    System.out.print("Ingrese el apellido del Garante.\n> ");
                    String apellidoGarante = entrada.nextLine();
                    System.out.print("Ingrese el username del Garante.\n> ");
                    String usernameGarante = entrada.nextLine();

                    Persona garante = new Persona(nombreGarante,
                            apellidoGarante, usernameGarante);

                    System.out.print("Ingrese el valor del auto.\n> ");
                    double valorAuto = entrada.nextDouble();
                    entrada.nextLine();

                    PrestamoAutomovil p = new PrestamoAutomovil(benificiario,
                            tiempoMeses, ciudad, tipo, marca, garante,
                            valorAuto);
                    p.establecerValorMensualPago();

                    cadenaPrestamoAutos = String.format("%sPréstamo (%d)\n\n%s", cadenaPrestamoAutos, contadorPrestamoAutos, p);

                    System.out.println("\nPréstamo de automóvil creado correctamente\n");
                    contadorPrestamoAutos++;
                } else {

                    System.out.print("Ingrese el nivel de estudio.\n> ");
                    String nivel = entrada.nextLine();

                    System.out.print("Ingrese el nombre de la institución educativa.\n> ");
                    String nombreIns = entrada.nextLine();
                    System.out.print("Ingrese las siglas de la institución educativa.\n> ");
                    String siglasIns = entrada.nextLine();

                    InstitucionEducativa ins = new InstitucionEducativa(nombreIns, siglasIns);

                    System.out.print("Ingrese el valor de la carrera.\n> ");
                    double valorCarrera = entrada.nextDouble();
                    entrada.nextLine();

                    PrestamoEducativo p = new PrestamoEducativo(benificiario,
                            tiempoMeses, ciudad, nivel, ins,
                            valorCarrera);

                    p.establecerValorMensualPago();

                    cadenaPrestamoEducativos = String.format("%sPréstamo (%d)\n\n%s", cadenaPrestamoEducativos, contadorPrestamoEducativos, p);

                    System.out.println("\nPréstamo educativo creado correctamente\n");
                    contadorPrestamoEducativos++;
                }

            } else {
                System.out.println("\nOpcion incorrecta.\n");
            }

            System.out.print("Si desea dejar de ingresar, pulse S.\n> ");
            String salida = entrada.nextLine();
            if (salida.equals("S")) {
                bandera = false;
            }
        }
        
        System.out.printf("%s\n%s",cadenaPrestamoAutos,cadenaPrestamoEducativos);
        
    }

}
