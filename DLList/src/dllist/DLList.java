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
public class DLList <T> {
    Node first;
    Node last;
    Node back;
    Node pointer;
    private int length;

    public DLList() {
        first = last = back = null;
        length = 0;
    }

    public DLList(T data) {
        Node node = new Node(data); 
        first = last = node;
        node.next = null;
        node.back = null;
        length++;
    }
    
    void insertFirst(T n){
        Node node = new Node(n);
        if (isEmpty()){ //Lista vacia
            first = last = node;
        } else { //Lista con elementos
            node.next=first;
            first.back = node;
            first = node;
        }
        length++;
    }
    void insertLast(T n){
        Node node = new Node(n);
	if (isEmpty()) {
            first = last = node;
	} else {
	node.back = last;
	last.next = node;
	last = node;
	}
	length++;
    }
            
    void deleteFirst(){
        if (!isEmpty()) {
            if (first.next == null) {
		first = last = null;
            } else {
            first = first.next;
            first.back = null;
            }
            length--;
        }
    }

    void deleteLast() {
    if (!isEmpty()) {
        if (first == last) {
            first = last = null;
            } else {
            last = last.back;
            last.next = null;
        }
        length--;
    }
}
    
    public boolean deleteNode(T n){
    pointer = first;
    Node pointer2 = first.next.next;
    if (!isEmpty()) {
	if (first == last) { //Si la lista tiene un solo elemento
            if (first.data == n) { //revisa si es el elemento buscado
		deleteFirst(); //elimina first
		return true;
		} else {
		return false;
		}
            } else {
            if (first.data == n) { //revisa si el primer elemento tiene el dato que buscamos
		deleteFirst();
		return true;
            } 
            if (last.data == n) {
                deleteLast();
		return true;
            } else {
            while (pointer2.next != null) { //Recorremos el arreglo y se detiene si pointer.next es nulo
                if (pointer.next.data == n) { //revisa si el siguiente elemento contiene el elemento que buscamos
                    pointer.next = pointer.next.next;
                    pointer2.back = pointer2.back.back;
                    length--;
                    return true;
                    } else {
                    pointer = pointer.next;
                    pointer2 = pointer2.next;
                    }
                }
            return false;
            }
        }
    }
    return false;
}

    
    
    void showListFL() {
    pointer = first;
        System.out.print("first->");
        for (int i=0;i<length;i++){
            System.out.print("["+pointer.data.toString()+"]->");
            pointer=pointer.next;
        }
        System.out.println("<-last");
    }
    
    void showListLF() {
    pointer = last;
        System.out.print("Last ->");
        for (int i = length;i>0;i--){
            System.out.print("[" + pointer.data.toString() + "]->");
            pointer=pointer.back;
	}
        System.out.println("<- First");
    }
    
    boolean isEmpty(){
        return first==null;
    }   
    
}
        
