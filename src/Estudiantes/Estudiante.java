/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author Yumor
 */
public class Estudiante {
    public String nombre; 
    public String correo; 
    public GradoAcademico grado; 

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public GradoAcademico getGrado() {
        return grado;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setGrado(GradoAcademico grado) {
        this.grado = grado;
    }

    private  void Validadorcorreo(String correo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un correo electrónico: ");

        String regexCorreo = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regexCorreo);
        Matcher matcher = pattern.matcher(correo);

        if (matcher.matches()) {
            System.out.println("Correo válido.");
        } else {
            System.out.println(" Correo inválido.");
        }
    }
       
public Estudiante(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.grado = GradoAcademico.PRIMARIA;
    }
}