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
public class binaryTree {
    private leaf root;
    private int leaves;

    public binaryTree() {
        root = null;
        leaves = 0;
    }
    
    public binaryTree(int d) {
        root = new leaf(d);
        leaves = 1;
    }
    
public void insert (int d,leaf root){
    if (isEmpty()) {
	if (d < root.getData()) {
            if (root.left!=null) {
		root.left = new leaf(d);
		leaves++;
            } else {
             insert(d, root.left);
            }
	} else {
	if (root.right!=null) {
            root.right = new leaf(d);
            leaves++;
	} else {
            insert(d, root.right);
            }
        }
    } else {
    root = new leaf(d);
    leaves = 1;
    }
}
    
public void showLeaf(leaf root){
    
}

public void deleteLeaf(int d){
    
}

public boolean isEmpty(){
    return false;
}

public leaf getRoot(){
    return root;   
}

public int Height(leaf root){
    if (isEmpty()) {
	return 0;
    } else {
	int a, b;
	if (root.left!=null && root.right!=null) {
            return 1;
	} else {
            a = Height(root.left);
            b = Height(root.right);
            if (a > b) return a + 1;
            else return b + 1;
	}
    }
}

public int getLeaves(){
    return leaves;
}

}
