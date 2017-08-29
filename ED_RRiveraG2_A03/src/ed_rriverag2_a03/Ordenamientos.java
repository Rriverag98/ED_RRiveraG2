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
public interface Ordenamientos {
    public abstract void seleccion();
    public abstract void insertion();
    public abstract void quickSort(int primero, int ultimo);
    public abstract void mergeSort(int primero, int ultimo);
}
