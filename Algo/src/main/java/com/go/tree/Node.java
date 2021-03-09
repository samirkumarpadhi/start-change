package com.go.tree;

class Node
{
    int data;
    Node left, right;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
