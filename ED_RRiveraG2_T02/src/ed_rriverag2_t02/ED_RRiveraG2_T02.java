/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_t02;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ED_RRiveraG2_T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<Character>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("What word do you want to check?");
        String a = teclado.nextLine();
        System.out.println("Is it a palindrome?");
        
        
        for (int i = 0; i < a.length(); i++) {
           a = a.toLowerCase();
           a = a.replace(" ", "");
           a = a.replace(",", "");
           a = a.replace("!", "");
           a = a.replace("?", "");
           a = a.replace(".", "");
           a = a.replace("´", "");
           a = a.replace("-", "");
           a = a.replace("", "");
           stack.push(a.charAt(i));
        }
        
        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }

        if (a.equals(reverseInput))
            System.out.println("Yes! That word is a palindrome.");
        else
            System.out.println("No! That word isn't a palindrome.");
    }
}
