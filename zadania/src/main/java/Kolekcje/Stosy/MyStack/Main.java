package Kolekcje.Stosy.MyStack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));
        myStack.push(new Random().nextInt(50));

        System.out.println(myStack.peek());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.peek());

    }
}
