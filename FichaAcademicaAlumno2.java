/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi_primer_proyecto_en_java;
/**
 *
 * @author kike
 */
public class FichaAcademicaAlumno2 {
    public static void main(String[] args) {
        String nombre ="Luis perez";
        String carrera = "Ingenieria en sistemas";
        String grupo = "6A";
        String matricula = "25";
        int edad = 20;
        double calificacion1= 8.5;
        double calificacion2= 9.0;
        double calificacion3= 7.5;
        
        double promedio=(calificacion1 + calificacion2 + calificacion3) / 3;
        boolean aprobado= promedio >=7;
        
        System.out.println("alumno: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Grupo: " + grupo);
        System.out.println("Matricula: " + matricula);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobado: " + aprobado);
        System.out.println("Promedio destacado: " + (promedio >= 9));
        
    }
    
}
