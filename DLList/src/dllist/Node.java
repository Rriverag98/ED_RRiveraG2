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
public class Node <T> {
    T data;
    Node next;
    Node back;

    public Node(T data) {
        this.data = data;
	next = null;
	back = null;
    }
    
}
