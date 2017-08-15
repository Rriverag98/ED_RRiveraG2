/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a03;
import java.util.*;

/**
 *
 * @author Rodrigo
 */
public abstract class FetchClass {
    protected int[] vector;
    
    abstract int Fetch();

    public int[] getV(){
        return this.vector;
    }
    
    public int[] randomV(int n){
        int [] vector = new int [n];
        Random rnd = new Random();
        for (int i = 0;i<vector.length;i++){
            vector[i] = rnd.nextInt(100);
        }
        return vector;
    }
    
    public void setV(int[] v){
        this.vector = v;
    }
    
    public void showV(){
        for (int i = 0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    
    public void showF(int r){
        if (r == -1){
            System.out.println("El numero que busca no existe en el vector");
        } else {
        System.out.println(r);
        }
    }    
}
