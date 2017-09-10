package ed_equiporojo_p01;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Rodrigo
 */
public class Sala {
    ArrayList <Pelicula> peliculas = new ArrayList();
    int numero;

    public Sala(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean addPelicula (String nombre){
        return addPelicula(new Pelicula(nombre));
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
        return peliculas.get(0).getNombre();
    }

    int Fetch(String name) {
        for(int i=0;i<peliculas.size();i++){
            if(peliculas.get(i).getNombre()==name)return i; 
        }
        return -1; 
}
}

