/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Estudiantes;

/**
 *
 * @author Yumor
 */
public enum GradoAcademico {
    PRIMARIA("Primaria"),
    SECUNDARIA("Secundaria"),
    BACHILLERATO("Bachillerato");
    
    private final String GradoAcademico; 
    
    public String getGradoAcademico() {
        return GradoAcademico;
    }

    private GradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }

    @Override
    public String toString() {
        return "GradoAcademico{" + "ordinal=" + ordinal() + ", name=" + name() + ", GradoAcademico=" + GradoAcademico + '}';
    }
    
    
    
}
