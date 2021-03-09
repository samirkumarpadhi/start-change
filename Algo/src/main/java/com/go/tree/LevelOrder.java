package com.go.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrder {
    Node root;
    private  ArrayList<ArrayList<Integer>> printLevelOrderQueue() {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return res;
        // Initialization
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> curr = new ArrayList<Integer>();
        while (!q.isEmpty()) {
            Node tmp = q.poll();
            if (tmp != null) {
                curr.add(tmp.data);
                if (tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                if (tmp.right != null)
                    q.offer(tmp.right);
            } else {
                ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
                res.add(c_curr);
                curr.clear(); // Java will clear the reference, so have to new an new ArrayList.
                // completion of a level;
                if (!q.isEmpty())
                    q.offer(null);
            }
            System.out.println("Q 2"+q);
        }
        return res;

    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {
        LevelOrder tree = new LevelOrder();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
        tree.root.right.left= new Node(6);
        tree.root.right.right= new Node(7);
        System.out.println("Level order traversal "+tree.printLevelOrderQueue());

    }
    //      1
    //   2      3
    // 4    5
}
