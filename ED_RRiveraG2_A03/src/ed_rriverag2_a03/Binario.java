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
public class Binario extends FetchClass {
   
    
    int Fetch(int n) {
    int b = vector.length;
    
    int inicio;
    int Final;
    int centro;
    
    
    int valorCentro;    
    inicio = 0;
    Final = b-1;
    while (inicio<Final){
    centro = (inicio + Final)/2;
    valorCentro = vector[centro];
    if (valorCentro==n){
        return n;
    }
    if (n<vector[centro]){
        Final = valorCentro-1;
    }
     if (n>vector[centro]){
        inicio = valorCentro-1;
    }
    } return -1;
    }

    @Override
    int Fetch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
