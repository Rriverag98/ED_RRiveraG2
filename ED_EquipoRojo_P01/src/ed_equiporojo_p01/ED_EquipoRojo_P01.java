/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_equiporojo_p01;
import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class ED_EquipoRojo_P01 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static Cinemex sala1 = new Cinemex();
    public static Cinemex sala2 = new Cinemex();
    public static Cinemex sala3 = new Cinemex();
    public static Cinemex sala4 = new Cinemex();
    public static Cinemex sala5 = new Cinemex();
    public static Cinemex sala6 = new Cinemex();
    public static Cinemex sala7 = new Cinemex();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i=0;i<15;i++){
        System.out.println("Ingrese el nombre de la pelicula numero "+(i+1)+":");
        addPelicula();
        }
        listPeliculas();
        System.out.println("------------");
        System.out.println("Sala 1");
        System.out.println(sala1.mostViewed());
        System.out.println("Sala 2");
        System.out.println(sala2.mostViewed());
        System.out.println("Sala 3");
        System.out.println(sala3.mostViewed());
        System.out.println("Sala 4");
        System.out.println(sala4.mostViewed());
        System.out.println("Sala 5");
        System.out.println(sala5.mostViewed());
        System.out.println("Sala 6");
        System.out.println(sala6.mostViewed());
        System.out.println("Sala 7");
        System.out.println(sala7.mostViewed());

}
    public static void addPelicula(){
        Scanner read = new Scanner (System.in);
        String nombre;
        int asistentes;
        nombre = read.nextLine();
        asistentes = (int) Math.ceil(Math.random() * 100);
        
        if(sala1.addPelicula(nombre,asistentes)){
            asistentes = (int) Math.ceil(Math.random() * 100);
            sala2.addPelicula(nombre,asistentes);
            asistentes = (int) Math.ceil(Math.random() * 100);
            sala3.addPelicula(nombre,asistentes);
            asistentes = (int) Math.ceil(Math.random() * 100);
            sala4.addPelicula(nombre,asistentes);
            asistentes = (int) Math.ceil(Math.random() * 100);
            sala5.addPelicula(nombre,asistentes);
            asistentes = (int) Math.ceil(Math.random() * 100);
            sala6.addPelicula(nombre,asistentes);
            asistentes = (int) Math.ceil(Math.random() * 100);
            sala7.addPelicula(nombre,asistentes);
                    
            System.out.println("Pelicula añadida");
        }else{ 
        System.out.println("Esa pelicula ya esta en la lista");
        }
    }
    
    public static void listPeliculas(){
        System.out.println("Asistentes a cada pelicula en cada sala:");
        System.out.println("Sala 1:");
        sala1.listPeliculas();
        System.out.println("Sala 2:");
        sala2.listPeliculas();
        System.out.println("Sala 3:");
        sala3.listPeliculas();
        System.out.println("Sala 4:");
        sala4.listPeliculas();
        System.out.println("Sala 5:");
        sala5.listPeliculas();
        System.out.println("Sala 6:");
        sala6.listPeliculas();
        System.out.println("Sala 7:");
        sala7.listPeliculas();
        
    }
    
}

