/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author JEanpa
 */
public class Ejecutor2 {
    public static void main(String[] args) {
         String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numCreditos = 5;
        double costoCreditos = 50.5;
        EstudiantePresencial estudiantePresencial = new EstudiantePresencial(
        nombre,apellido,identificacion,edad,numCreditos,costoCreditos);
    estudiantePresencial.calcularMatriculaPresencial();
        System.out.println(estudiantePresencial);
    }
}
