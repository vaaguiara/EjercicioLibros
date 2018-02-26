/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.vista;

import edu.unal.poo.conjuntoLibros.modelo.Autor;
import edu.unal.poo.conjuntoLibros.modelo.ConjuntoLibro;
import edu.unal.poo.conjuntoLibros.modelo.Libro;
import java.util.Scanner;


public class PruebaLibro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre Autor");
        String nombre = teclado.next();
        //Dependencia 
        Autor autor = new Autor(nombre, "Marquez", "245712");
        Libro libro = new Libro("Cien annios soledad", 300);
        //asociando el libro con el autor
        libro.setAutor(autor);
        //
        
        ConjuntoLibro conjuntoLibro = new ConjuntoLibro();
        conjuntoLibro.anadirLibro(libro);
        Libro[] libros;
        libros = conjuntoLibro.mostrarLibros();
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null){
                System.out.println(libros[i].getTitulo());
            }
        }
       boolean resultado =
        conjuntoLibro.eliminarxTitulo("Cien annios soledad");
       if (resultado == true)
       {
           System.out.println("Eliminacion exitosa");
       }else{
           System.out.println("No se elimino el libro");
       }
       
        String autorLibro=libro.getAutor().getNombre();
        System.out.println(autorLibro);
    }
}
