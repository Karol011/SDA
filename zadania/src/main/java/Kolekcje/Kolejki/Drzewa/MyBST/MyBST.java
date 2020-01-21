package Kolekcje.Kolejki.Drzewa.MyBST;

import java.util.ArrayList;
import java.util.List;

public class MyBST {

    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    List<Node> preOrder() {
        List<Node> listaWezlow = new ArrayList<>();
        recursivePreOrder(root, listaWezlow);
        return listaWezlow;
    }

    private void recursivePreOrder(Node current, List<Node> alreadyVisited) {

        alreadyVisited.add(current); // 1.
        if (current.left != null) {
            recursivePreOrder(current.left, alreadyVisited); // 2.
        }
        if (current.right != null) {
            recursivePreOrder(current.right, alreadyVisited); // 3.
        }

    }

    List<Node> preInOrder() {
        List<Node> listaWezlow = new ArrayList<>();
        recursiveInOrder(root, listaWezlow);
        return listaWezlow;
    }

    private void recursiveInOrder(Node current, List<Node> alreadyVisited) {


        if (current.left != null) {
            recursiveInOrder(current.left, alreadyVisited); // 2.
        }
        alreadyVisited.add(current); // 1.
        if (current.right != null) {
            recursiveInOrder(current.right, alreadyVisited); // 3.
        }

    }


    List<Node> postOrder() {
        List<Node> listaWezlow = new ArrayList<>();
        recursivePostOrder(root, listaWezlow);
        return listaWezlow;
    }

    private void recursivePostOrder(Node current, List<Node> alreadyVisited) {

        if (current.left != null) {
            recursivePostOrder(current.left, alreadyVisited); // 2.
        }

        if (current.right != null) {
            recursivePostOrder(current.right, alreadyVisited); // 3.
        }
        alreadyVisited.add(current); // 1.

    }

    int getLeafCount() {
        return getLeafCountRecursive(root);
    }

    private int getLeafCountRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return getLeafCountRecursive(node.left) + getLeafCountRecursive(node.right);
        }
    }

}
