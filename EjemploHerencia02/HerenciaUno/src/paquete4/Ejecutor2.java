/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author JEanpa
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //1. Crear un objeto de tipo Estudiante Presensencial
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        EstudiantePresencial estudiantePresencial = new EstudiantePresencial(
                nombre, apellido, identificacion, edad);
        estudiantePresencial.establecerCostoCredito(50.5);
        estudiantePresencial.establecerNumeroCreditos(5);
        estudiantePresencial.calcularMatriculaPresencial();

        System.out.println(estudiantePresencial);
    }
}
