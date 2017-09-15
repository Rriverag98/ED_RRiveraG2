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
public class MyList <T> {
    Node first;
    Node last;
    Node pointer;

    public MyList() {
        first = last = pointer = null;
    }

    public MyList(T data) {
        Node node = new Node(data);
        first = last = node;
        node.next = null;
    }
    
    void insertFirst(T n){
        Node node = new Node(n);
        if (isEmpty()){ //Lista vacia
            first = last = node;
            node.next = null;
        } else { //Lista con elementos
            node.next=first;
            first=node;
            
        }
    }
    void insertLast(T n){
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
                while (pointer.next!=last){ //Recorremos el arreglo y se detiene cuando pointer.next es last
                 pointer = pointer.next;   
                }
                last = pointer;
                last.next = pointer = null;
            }
        }
    }
    
    public boolean deleteNode(T n){
        Node p = fetchBack(n);
        if (p!=null){
            if (fetchBack(n)==n){ //Si el valor se el unico elemento o el primero en la lista
                deleteFirst();
            } else { //Si no es el unico elemento o el primero en la lista
                p.next = p.next.next;
            }
            return true;
        }  
        return false;
    }
    
    public Node fetch(T n){
        if(!isEmpty()) {
            if (first.data == n) return first;
            Node temp = fetchBack(n);
            if (temp != null) {
                return temp.next;
            }
        } return null;
    }

    public Node fetchBack(T n){
        pointer = first;
        if (!isEmpty()){
            if(first==last){ //Si la lista tiene un solo elemento
                if (first.data == n){ //revisa si es el elemento buscado
                    return first; //regresa a si mismo
                } else {
                    return null;
                }
            } else {
                if (first.data == n){ //revisa si el primer elemento tiene el dato que buscamos
                    return first;
                } else {
                    while (pointer.next!=null){ //Recorremos el arreglo y se detiene si pointer.next es nulo
                        if (pointer.next.data == n){ //revisa si el siguiente elemento contiene el elemento que buscamos
                            return pointer;
                        }
                        pointer = pointer.next;
                    }
                    return null;
                }
            }
        }
        return null;
    }
    
    void showNode(){

    }

    boolean isEmpty(){
        return first==null;
    }   
    
}
