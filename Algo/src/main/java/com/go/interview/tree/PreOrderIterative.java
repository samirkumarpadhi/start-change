/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package com.go.interview.tree;

import com.go.interview.tree.misc.BinaryTree;
import com.go.interview.tree.misc.Node;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderIterative {
    BinaryTreeNode root;
    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        while(!s.isEmpty()){
        	BinaryTreeNode tmp = s.pop();
            res.add(tmp.data);
            // pay more attention to this sequence. 
            if(tmp.right != null)
                s.push(tmp.right);
            if(tmp.getLeft() != null)
                s.push(tmp.getLeft());  
        }
        return res;
    }
    public static void main(String args[])
    {
        PreOrderIterative tree = new PreOrderIterative();
        tree.root = new BinaryTreeNode(2);
        tree.root.left = new BinaryTreeNode(7);
        tree.root.right = new BinaryTreeNode(5);
        tree.root.left.right = new BinaryTreeNode(6);
        tree.root.left.right.left = new BinaryTreeNode(1);
        tree.root.left.right.right = new BinaryTreeNode(11);
        tree.root.right.right = new BinaryTreeNode(9);
        tree.root.right.right.left = new BinaryTreeNode(4);

        // Function call
        System.out.println("Maximum element is "
                + tree.preorderTraversal(tree.root));

    }
}
