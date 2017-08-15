/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a03;


/**
 *
 * @author Rodrigo
 */
public class Secuencial extends FetchClass{

    
    int Fetch(int n) {
        for (int i=0;i<vector.length;i++){ //recorre el arreglo pocision por pocision 
            if (n==vector[i]){ //si n es igual al valor dentro del vector
             return i; //regresa el valor dentro de esa pocision
            }
        } return -1; //si no se encuentra el numero que busca, regresa -1
    }

    @Override
    int Fetch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
        
    }

   
   
