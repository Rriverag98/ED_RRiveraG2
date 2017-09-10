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
    public static ArrayList <Sala> Cinemex = new ArrayList();
    public static ArrayList <String> nombres = new ArrayList(Arrays.asList("Avatar","Titanic","Star Wars Ep. VII: The Force Awakens",
    "Jurassic World","The Avengers","Furious 7","Avengers: Age of Ultron","Harry Potter and the Deathly Hallows: Part II","Frozen"
    ,"Beauty and the Beast","The Fate of the Furious","IronMan 3","Minions","Captain America: Civil War","The Lord of the Rings: The Return of the King"));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        peliculas();
        for(int j = 0; j<7; j++) {
        System.out.println("La pelicula mas vista en la sala "+(j+1)+" fue:");
        System.out.println(Cinemex.get(j).mostViewed());   
        }
        

}
    
    public static void peliculas(){
         for(int j = 0; j<7; j++) Cinemex.add(new Sala(j+1));
         for(int i = 0; i<15; i++){
            for(int j = 0; j<7; j++) {
                Cinemex.get(j).addPelicula(nombres.get(i));
                int p = Cinemex.get(j).Fetch(nombres.get(i));
                Cinemex.get(j).peliculas.get(p).setAsistentes((int) Math.ceil(Math.random() * 100));
            }    
         }
    }
}
