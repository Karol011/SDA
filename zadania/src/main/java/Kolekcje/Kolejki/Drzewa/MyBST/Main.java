package Kolekcje.Kolejki.Drzewa.MyBST;

public class Main {
    public static void main(String[] args) {

        MyBST myBST = new MyBST();

        myBST.add(6);
        myBST.add(4);
        myBST.add(8);
        myBST.add(3);
        myBST.add(5);
        myBST.add(7);
        myBST.add(9);
        System.out.println("pre order "+myBST.preOrder());
        System.out.println("post order "+myBST.postOrder());
        System.out.println("in order "+myBST.preInOrder());
        System.out.println("leaf count: " + myBST.getLeafCount());
    }
}