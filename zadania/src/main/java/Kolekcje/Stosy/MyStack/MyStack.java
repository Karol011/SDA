package Kolekcje.Stosy.MyStack;

public class MyStack {
    private int[] stos;
    private int wierzcholekStosu;

    MyStack() {
        this.stos = new int[10];
        this.wierzcholekStosu = -1;
    }

    public MyStack(int wielkoscStosu) {
        this.stos = new int[wielkoscStosu];
        this.wierzcholekStosu = -1;
    }

    public boolean isEmpty() {
        return this.wierzcholekStosu == -1;
    }

    void push(int liczba) {
        if (wierzcholekStosu >= stos.length - 1) {
            powiekszStos();
        }

        this.stos[++wierzcholekStosu] = liczba;
    }

    int pop(){
        return stos[wierzcholekStosu--];
    }

    int peek(){
        return stos[wierzcholekStosu];
    }

    private void powiekszStos() {
        int[] nowaTablica = new int[stos.length * 2];
        for (int i = 0; i < stos.length; i++) {
            nowaTablica[i] = stos[i];
        }
        this.stos = nowaTablica;
    }


}
