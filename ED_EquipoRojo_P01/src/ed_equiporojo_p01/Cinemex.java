package ed_equiporojo_p01;



import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Cinemex <P> {
    ArrayList <Pelicula> peliculas = new ArrayList();
    
    public Cinemex (){
    }
    
    public boolean addPelicula (String nombre,int asistentes){
        return addPelicula(new Pelicula(nombre,asistentes));
    }
    public boolean addPelicula (Pelicula nombre){
        if (findPelicula(nombre.getNombre())== -1) {
            peliculas.add(nombre);
            return true;
        }
        return false;
    } 

    public int findPelicula(String nombre){
        for (int i=0;i < peliculas.size();i++){
            if (peliculas.get(i).getNombre().equals(nombre))
                return i;
        }
        return -1;
    }
    
    public void listPeliculas(){
        for (Pelicula temp: peliculas){
            System.out.println(temp.toString());
        }
    }
    
    String mostViewed(){
        Collections.sort(peliculas);
        System.out.println("La pelicula mas vista en esta sala fue:");
        return peliculas.get(0).getNombre();
    }

    
    
    
    
}
