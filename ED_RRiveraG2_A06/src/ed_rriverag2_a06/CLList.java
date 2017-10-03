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
public class CLList <T> {
    int length = 0;
    Node pivot = null;
    Node pointer = null;

    public CLList(T d) {
        Node node = new Node(d);
        pivot = node.next = node;
        length++;
    }

    public CLList() {
    pivot = null;
    pointer = null;
    length = 0;    
    }

    //add a new node at the start of the linked list
    public void insertNode(T d){
        Node node = new Node(d);
        if (isEmpty()){
            pivot = node.next = node;
            length++;
        } else {
            node.next = pivot.next;
            pivot.next = node;
            length++;
        }
    }

    public void deleteNode(T d){
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            pointer = pivot;
            for (int i=0;i<=length;i++){
                if (pivot.data == d){
                    pivot = pivot.next;
                    i = length+1;
                } 
                if (pointer.next.data == d){    
                    pointer.next = pointer.next.next;
                    i = length+1;
                }
                pointer = pointer.next;
            }
        }
    }
    public void deleteList(){
        pivot = pivot.next = null;
    }
    

    public boolean isEmpty(){
        return length == 0;
    }

    //print the linked list
    public void showList(){
        pointer = pivot;
        System.out.print("first->");
        for (int i=0;i<length;i++){
            System.out.print("["+pointer.data.toString()+"]->");
            pointer=pointer.next;
        }
        System.out.println("<-first");
    }
}
