/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi_primer_proyecto_en_java;
import java.util.Scanner;

/**
 *
 * @author kike
 */
public class SistemaRegistroAlumnosProyecto { 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opciones = 0;

        while (opciones != 5) {
            System.out.println("\n============================================");
            System.out.println("Bienvenido al sistema de registro de alumnos");
            System.out.println("============================================");
            System.out.println("1. registrar alumno");
            System.out.println("2. Calcular promedio");
            System.out.println("3. determinar estado");
            System.out.println("4. Mostrar datos del alumno");
            System.out.println("5. salir");
            System.out.println("ingrese una opcion:");

            opciones = entrada.nextInt();
            entrada.nextLine();

            switch (opciones) {
                case 1:
                    RegistrarAlumno();
                    break;

                case 2:
                    CalcularPromedio();
                    break;

                case 3:
                    DeterminarEstado();
                    break;

                case 4:
                    MostrarDatosAlumno();
                    break;

                case 5:
                    System.out.println("\n------Saliendo del Sistema------");
                    break;

                default:
                    System.out.println("opcion no valida intente de nuevo");
            }
        }
    }

    public static void RegistrarAlumno() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nRegistrar Alumno");
             
        String nombre = "";
        while (true) {
            System.out.println("Ingresa el Nombre");
            nombre = entrada.nextLine();
                 
            boolean NombreValido = true;
                 
            for (int i = 0; i < nombre.length(); i++) {
                char c = nombre.charAt(i);
                // si se encuentra un numero el nombre sera invalido
                if (Character.isDigit(c)) {
                    NombreValido = false;
                    break;
                } 
            }
            
            // si no tiene numeros y no esta vacio, salimos del while
            if (NombreValido && !nombre.isEmpty()) {
                break;
            } else {
                System.out.println("El Nombre no puede contener numeros ni estar vacio");
            }
        }
        
        // ingresar la matricula
        System.out.println("Ingresa la Matricula");
        String matricula = entrada.nextLine();
             
        // Validar que la entrada sea solo numeros
        int edad = 0;
        while (true) {
            System.out.println("Ingresa la Edad");
            String edadT = entrada.nextLine();
                        
            boolean edadValida = true;
            
            // si solo se presiona enter se toma como invalido
            if (edadT.isEmpty()) {
                edadValida = false;
            }
                        
            // despues procedemos a revisar que cada caracter sea un numero
            for (int i = 0; i < edadT.length(); i++) {
                char c = edadT.charAt(i);
                // si la entrada no es un digito se toma como invalido
                if (!Character.isDigit(c)) {
                    edadValida = false;
                    break;
                }
            }
            
            if (edadValida) {
                edad = Integer.parseInt(edadT);
                break;
            } else {
                System.out.println("Solo puedes ingresar numeros");
            }
        }
             
        System.out.println("\nAlumno registrado");
        System.out.println("Alumno registrado: " + "\nNombre: " + nombre + 
                           "\nMatricula: " + matricula + "\nEdad: " + edad);
    }

    public static void CalcularPromedio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nCalcular promedio");
        
        double calificaciones[] = new double[3];
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("calificacion: " + (i + 1));
            calificaciones[i] = entrada.nextDouble();
        }
    }

    public static void DeterminarEstado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDeterminar Estado");
        
        double promedio = entrada.nextDouble();
        
        if (promedio == 10) {
            System.out.println("Exelente aprovechamiento");
        } else if (promedio >= 8) {
            System.out.print("Buen aprovechamiento");
        } else if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("reprobado");
        }
    }

    public static void MostrarDatosAlumno() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Mostrar datos del alumno");
        
        System.out.println("Nombre del alumno:");
        String nombreAlumno = entrada.nextLine();
        
        System.out.println("Matricula del alumno:");
        String matriculaAlumno = entrada.nextLine();
        
        System.out.println("Promedio del alumno:");
        double promedioAlumno = entrada.nextDouble();
        entrada.nextLine();
        
        String estadoAlumno = "";
        if (promedioAlumno == 10) {
            estadoAlumno = "Exelente aprovechamiento";
        } else if (promedioAlumno >= 8) {
            estadoAlumno = "Buen aprovechamiento";
        } else if (promedioAlumno >= 7) {
            estadoAlumno = "Aprobado";
        } else {
            estadoAlumno = "reprobado";
        }
        
        System.out.println("----Datos del alumno----" + "\nNombre: " + nombreAlumno + "\nMatricula: "
                + matriculaAlumno + "\nPromedio: " + promedioAlumno + "\nEstado: " + estadoAlumno);
    }
}