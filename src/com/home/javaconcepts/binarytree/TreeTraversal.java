package com.home.javaconcepts.binarytree;

public class TreeTraversal {

    static Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        root = tree.getBinaryTree();

        printInOrder();
        System.out.println();

        printPreOrder();
        System.out.println();

        printPostOrder();
        System.out.println();
    }

    public static void printInOrder(){
        printInOrder(root);
    }

    public static void printInOrder(Node node){
        if(node == null) return;

        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public static void printPreOrder(){
        printPreOrder(root);
    }

    public static void printPreOrder(Node node){
        if(node == null) return;

        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void printPostOrder(){
        printPostOrder(root);
    }

    public static void printPostOrder(Node node){
        if(node == null) return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }


}
