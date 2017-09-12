/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a06;

/**
 *
 * @author Rodrigo
 */
public class MyList {
    Node first;
    Node last;
    Node pointer;

    public MyList() {
        first = last = pointer = null;
    }

    public MyList(int data) {
        Node node = new Node(data);
        first = last = node;
        node.next = null;
    }
    
    void insertFirst(int n){
        Node node = new Node(n);
        if (isEmpty()){ //Lista vacia
            first = last = node;
            node.next = null;
        } else { //Lista con elementos
            node.next=first;
            first=node;
            
        }
    }
    void insertLast(int n){
        Node node = new Node(n);
        if (isEmpty()){ //Lista vacia
            first = last = node;
            node.next = null;
        } else { //Lista con elementos
            last.next = last = node;
        }
    }
            
    void deleteFirst(){
        if (!isEmpty()){
            if (first.next==null){ //Si la lista solo tiene un elemento
                first = last = null;
            } else { //Si la lista tiene mas de un elemento
                first=first.next;
            }
        }
    }

    void deleteLast(){
        if (!isEmpty()){
            if (first==last){ //Si la lista solo tiene un elemento
                first = last = null;
            } else { //Si la lista tiene mas de un elemento
                pointer = first;
                while (pointer.next!=last){ //Recorremos el arreglo hasta que pointer.next es last
                 pointer = pointer.next;   
                }
                last = pointer;
                last.next = pointer = null;
            }
        }
    }
    
    void deleteNode(int n){

    }   

    void showNode(){

    }

    boolean isEmpty(){
        return first==null;
    }   
    
}

