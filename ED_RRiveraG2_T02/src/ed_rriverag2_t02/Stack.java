package ed_rriverag2_t02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Stack <T> {
    Node<T> top;
    int size;

    public Stack() {
       top = null;
       size = 0;
    }

    public Stack(T d) {
        Node node = new Node(d);
        top = node;
        size = 1;
    }

    public int getSize() {
        return size;
    }

    public T getTop() {
        if (!isEmpty()){
            return top.data;
        } else {
            return null;
        }
    }
    
    public void push(T d){
        Node node = new Node(d);
        node.next = top;
        top = node;
        size++;
    }
    
    public T pop() {
        Node<T> d;
        if (!isEmpty()){
            d = top;        
            top = top.next;
            size--;
        } else {
            d = null;
            System.out.println("Empty Stack");
        }
        return (T)d.data.toString();
    }
    
    public void showStack(){
        Node<T> t = top;
        while(t!=null){
            System.out.println(t.data.toString());
            t = t.next;
        }
        
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
}
