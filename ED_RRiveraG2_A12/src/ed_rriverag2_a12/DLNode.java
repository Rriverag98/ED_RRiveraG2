/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a12;

/**
 *
 * @author Rodrigo
 */
public class DLNode<T> {
    T data;
    DLNode next;
    DLNode prev;

    public DLNode(T data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

    public void print() {
        System.out.println(data.toString());
    }
}