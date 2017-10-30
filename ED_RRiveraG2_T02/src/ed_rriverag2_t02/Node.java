/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_t02;

/**
 *
 * @author Rodrigo
 */
public class Node <T> {
    T data;
    Node next;

    public Node(){
        next= null;
    }
    public Node(T d){
        next=null;
        data = d;
    }
    
    public void print(){
        System.out.println(data + "->");
    }
    public void printS(){
        System.out.println(data + "\n ↓");
    }  
}
