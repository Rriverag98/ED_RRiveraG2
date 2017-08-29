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
public class ED_RRiveraG2_A03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Secuencial a = new Secuencial();
        a.setV(a.randomV(10));
        System.out.println("-----------");
        a.showV();
        System.out.println("-----------");
        a.showF(a.Fetch(30));
        System.out.println("-----------");
        Binario b = new Binario ();
        b.setV(a.randomV(10));
        b.showV();
        System.out.println("-----------");
        b.insertion();
        b.showV();
        System.out.println("-----------");
        b.showF(b.Fetch(15));*/
        Binario c = new Binario ();
        c.setV(c.randomV(10));
        c.showV();
        System.out.println("-----------");
        int ultimo = (c.vector.length-1);
        int primero = 0;
        c.mergeSort(primero,ultimo);
        c.showV();
        System.out.println("-----------");
        c.showF(c.Fetch(15));
    }
    
}
