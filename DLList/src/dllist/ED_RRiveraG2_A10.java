/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dllist;

/**
 *
 * @author Rodrigo
 */
public class ED_RRiveraG2_A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DLList <String> Lista  = new DLList();
        Lista.insertFirst("101");
        Lista.showListFL();
        Lista.insertLast("30");
        Lista.showListFL();
        Lista.insertLast("200");
        Lista.showListFL();
        Lista.deleteNode("200");
        Lista.showListFL();
        Lista.showListLF();
    }
    
}
