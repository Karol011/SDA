package Kolekcje.Stosy.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(CheckParentesis("(({[]}))"));
    }

    private static boolean CheckParentesis(String input) {
        if (input.isEmpty())
            return true;

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }

        }
        return stack.isEmpty();
    }
    /*
    funkcja przyjmuje stringa zawierajacego nawiasy a nastepnie zwraca true jesli sa prawidlowo zagniezdzone
     */
}
