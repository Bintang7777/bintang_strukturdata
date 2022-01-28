/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author STAR
 */
public class binarytree2 {

   
     public static void main(String[] args) { 
        binarytree1 tree = new binarytree1(); 
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        
        tree.inorder(); 
    } 
} 