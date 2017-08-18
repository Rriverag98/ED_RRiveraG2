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
public class Binario extends FetchClass implements Ordenamientos {
   
    
    int Fetch(int n) {
    int b = vector.length; //se usara b para asignarles un valor a inicio, final y centro
    
    int inicio;
    int Final;
    int centro;
    
    
    int valorCentro;    //valorCentro se usara para revisar si el valor que busca ya lo encontro
    inicio = 0; //0 es la posicion inicial del vector
    Final = b-1; //se le resta 1 al length del vector ya que las posiciones en un vector empieza en 0,
                 //por lo que la posicion final de un vector de 8 sera 7
    while (inicio<Final){ //se hara el proceso unicamente si inicio es mayor a final, ya que si son iguales o final > inicio, el numero
                          //no existe en el arreglo
    centro = (inicio + Final)/2; //La pocision centro del arreglo es la mitad de la suma entre la pocision inicio y final
    valorCentro = vector[centro]; //valorCentro toma el valor que esta en la pocision Centro
    if (valorCentro==n){ //si valorCentro es igual al numero que busca
        return n;        //regresa el numero que busca
    }
    if (n<vector[centro]){ //si el numero que busca es menor al valor que se encuentra en la pocision centro
        Final = valorCentro-1; //final tomara el valor de valorCentro menos 1
    }
     if (n>vector[centro]){ //si el numero que busca es mayor al valor que se encuentra en la pocision centro
        inicio = valorCentro-1; //inicio tomara el valor de valorCentro menos 1
    }
    } return -1; //si inicio es mayor a final el numero no existe en el arreglo, por lo que se regresa el numero -1
    }

    @Override
    int Fetch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public void seleccion() {
        for (int i = 0;i<vector.length;i++){
            int menor = i;
            for (int j =i+1;j<vector.length;j++){
                if (vector[j]<vector[menor]){
                    menor = j;
                }
            }
            int auxiliar = vector[i];
            vector[i]=vector[menor];
            vector[menor]=auxiliar;
        }
    }
    
}
