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
        Secuencial a = new Secuencial();
        a.setV(a.randomV(10));
        a.showV();
        a.showF(a.Fetch(30));
    }
    
}
