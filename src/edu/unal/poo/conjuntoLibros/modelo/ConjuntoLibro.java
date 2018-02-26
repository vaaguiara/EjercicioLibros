/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.modelo;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
        //Asociacion
    private Libro[] libros;

    public ConjuntoLibro() {
      this.libros = new Libro[20];
    }
    
    public boolean anadirLibro(Libro libro){
       int posVacio = -1;
       for (int i = 0; i < 20; i++) {
          if(this.libros[i] == null){
            posVacio = i;
            break;
          }     
       }
       if(posVacio != -1){
         this.libros[posVacio] = libro;
         return true;
       }
       else return false;
       
    }
    
    public Libro[] mostrarLibros(){
      return this.libros;
    }
    
    public boolean eliminarAutor (String nombre){
        boolean resultado = false;
        for (int i = 0; i < 20 ; i++)
        {
            if (this.libros[i] != null)
            {
                Autor autor =  this.libros[i].getAutor();
                if (autor.getNombre().equals(nombre))
                {
                    this.libros[i]=null;
                    resultado = true;
                }
            }
        }
        return resultado;
    }
    
    public boolean eliminarxTitulo (String titulo){
        boolean resultado = false;
        for (int i = 0; i < 20; i++)
        {
            if (this.libros[i] != null)
            {
                if (this.libros[i].getTitulo().equals(titulo))
                {
                    this.libros[i] = null;
                    resultado = true;
                }
            }
        }
        return resultado;
    }
    
    public Libro buscarMejorCalificado(){
        Libro mayorCalificacion = null;
        for (int i = 0; i < 20; i++)
        {
            if (this.libros[i]!=null && mayorCalificacion == null)
            {
                mayorCalificacion = this.libros[i];
            }else{
                if (this.libros[i]!= null && this.libros[i].getCalificacion() > mayorCalificacion.getCalificacion())
                {
                    mayorCalificacion = this.libros[i];
                }
            }
            
        }
        return mayorCalificacion;
        }
        
    public Libro buscarMenorCalificacion(){
        Libro menorCalificacion = null;
        for (int i = 0; i < 20; i++) {
            if (this.libros[i] != null && menorCalificacion == null)
            {
                menorCalificacion = this.libros[i];
            }else{
                if (this.libros[i] != null && this.libros[i].getCalificacion() < menorCalificacion.getCalificacion())
                {
                    menorCalificacion = this.libros[i];
                }
            }            
                
            }        
        return menorCalificacion;
    }
    
}
