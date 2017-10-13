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
public class Dequeue<T> {

    private DLNode<T> front;
    private DLNode<T> rear;
    private int size;

    //Constructores
    //por defecto
    public Dequeue(){
        front= null;
        rear= null;
        size=0;
    }
    //con un dato
    public Dequeue(T d){
        DLNode<T> node = new DLNode<T>(d);
        front=rear=node;
        size=1;
    }
    //Inserta un elemento al inicio
    public void enqueueFront(T d){
        DLNode<T> node = new DLNode<T>(d);
        if(isEmpty()){
            front=rear=node;
        }else{
            node.next=front;
            front.prev=node;
            front=node;
        }
        size++;
    }
    //Inserta un elemento al final
    public void enqueueRear(T d){
        if(isEmpty()){
            enqueueFront(d);
        }else{
            DLNode<T> node = new DLNode<T>(d);
            rear.next=node;
            node.prev=rear;
            rear=node;
            size++;
        }
    }
    //Identifica que extremo es, elimina y devuelve el valor
    public T dequeue(DLNode<T> pointer){
        if(size>1) {
            if (pointer.next == null) {
                rear = rear.prev;
                rear.next = null;
            } else {
                front = front.next;
                front.prev = null;
            }
        } else clearDequeue();
        return pointer.data;
    }
    //Elimina un elemento al inicio y devuelve su valor
    public T dequeueFront(){
        if(!isEmpty()) return dequeue(front);
        return null;
    }
    //Elimina un elemento al final y devuelve su valor
    public T dequeueRear(){
        if(!isEmpty()) return dequeue(rear);
        return null;
    }
    //Devuelve el valor del elemento apuntado por front
    public T getFront(){
        return front.data;
    }
    //Devuelve el valor del elemento apuntado por rear
    public T getRear(){
        return rear.data;
    }
    //Devuelve el tamaño del Deque
    public int getSize(){
        return size;
    }
    //Evalua si Deque esta vacia y devuelve un booleano
    public boolean isEmpty(){
        return size==0;
    }
    //Elimina todos los elementos del Deque
    public void clearDequeue(){
        front= null;
        rear= null;
        size=0;
    }
    //Muestra todos los elementos del Deque
    public void showDequeue(){
        System.out.print("front->");
        DLNode<T> p = front;
        if (p==null) System.out.print("NULL");
        while(p!=null){
            p.print();
            p=p.next;
        }
        System.out.println("<-rear");
    }
}
