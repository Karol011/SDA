package Inne.Generyka.Pair;

public class Pair<Left, Right> {
    private Left left;
    private Right right;

    public Pair(Left left, Right right) {
        this.left = left;
        this.right = right;
    }



    public Left getLeft() {
        return left;
    }

    public Right getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
