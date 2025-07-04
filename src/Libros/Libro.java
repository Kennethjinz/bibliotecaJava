/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros;
import EntidadesBases.EntidadBase;
import java.util.regex.Matcher;
/**
 *
 * @author User
 */
public class Libro extends EntidadBase {
    private static final String ISBN="^(1-9)+";
    
   private String libro;
   private String isbn;
   private String autor;

    public String getLibro() {
        return libro;
    }

    private String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }
    
    public boolean validarISBN(String isbn){
        return 
    }
   
   
}
