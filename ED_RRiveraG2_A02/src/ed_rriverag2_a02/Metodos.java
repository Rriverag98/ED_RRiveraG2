/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a02;

/**
 *
 * @author Rodrigo
 */
public class Metodos {
    public static int factorial (int n){
            if (n==0){
                return 1;
            } else {
                return n*factorial(n-1);
            }
        }
    
    public static int suma (int[] vector,int n){
            if (n==0){
                return vector[0];
            } else {
                return suma(vector,n-1)+ vector[n];
            }
        }
 
    public static int mult (int[] vector,int n){
            if (n==0){
                return vector[0];
            } else {
                return mult(vector,n-1)* vector[n];
            }
        }
    
}
