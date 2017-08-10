/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a02;
import static ed_rriverag2_a02.Metodos.factorial;
import static ed_rriverag2_a02.Metodos.mult;
import static ed_rriverag2_a02.Metodos.suma;

/**
 *
 * @author Rodrigo
 */
public class ED_RRiveraG2_A02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //factorial
        int resultado1 = factorial(10);
        System.out.println(resultado1);
        int[] vector;
        vector = new int[] {1,2,3,4};
        int n = (vector.length-1);
        //Suma de vector
        int resultado2 = suma(vector,n);
        System.out.println(resultado2);
        //Multiplicacion de vector
        int resultado3 = mult(vector,n);
        System.out.println(resultado3);
    }
    
    
}

    

