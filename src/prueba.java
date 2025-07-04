/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yumor
 */
public class prueba {
    public String Nombre; 
    public int numero; 
    public int cedula; 

    public String getNombre() {
        return Nombre;
    }

    public int getNumero() {
        return numero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public prueba(String Nombre, int numero, int cedula) {
        this.Nombre = Nombre;
        this.numero = numero;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "prueba{" + "Nombre=" + Nombre + ", numero=" + numero + ", cedula=" + cedula + '}';
    }
    
    
    
}
