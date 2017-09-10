package ed_equiporojo_p01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Pelicula<P> implements Comparable<Pelicula<P>> {

    private String nombre;
    private int asistentes;


    public Pelicula(String nombre) {
        this.nombre = nombre;
    }
    
    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }
   

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre + " con " +asistentes + "asistentes";
    }
    
     public int compareTo(Pelicula<P> o) {
        if(this.getAsistentes()<o.getAsistentes()){
            return 1;
        }
        if(this.getAsistentes()>o.getAsistentes()){
            return -1;
        }
        return 0;
    }
    
     
     
}
