/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a13;

/**
 *
 * @author Rodrigo
 */
public class leaf {
    private int data;
  
    leaf right;
    leaf left;

    public leaf() {
        left = right = null;
        data = 0;
    }

    public leaf(int d) {
        left = right = null;
        this.data = d;
    }
    
    public void print(){
        
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
}
