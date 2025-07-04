/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Estudiantes;

/**
 *
 * @author Yumor
 */
public enum EstadoEstudiante {
    ACTIVO("Activo"),
    INACTIVO("Inactivo");
    
    private final String EstadoEstudiante; 

    private EstadoEstudiante(String EstadoEstudiante) {
        this.EstadoEstudiante = EstadoEstudiante;
    }

    public String getEstadoEstudiante() {
        return EstadoEstudiante;
    }

    @Override
    public String toString() {
        return "EstadoEstudiante{" + "ordinal=" + ordinal() + ", name=" + name() + ", EstadoEstudiante=" + EstadoEstudiante + '}';
    }

   
}


    
    
    
    
    

