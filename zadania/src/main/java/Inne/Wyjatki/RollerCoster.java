package Inne.Wyjatki;

import java.util.Scanner;

public class RollerCoster {


    public static void main(String[] args) throws InsufficientHeightException {
      //  try {
            sprawdzCzyMozeJechac(pobierzWzrost());
      //  } catch (InsufficientHeightException e) {
          //  e.printStackTrace();
      //  }

    }


    static int pobierzWzrost() {
        int wzrost;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wzrost  ");
        wzrost = scanner.nextInt();
        return wzrost;
    }

    static void sprawdzCzyMozeJechac(int wzrost) throws InsufficientHeightException {

        if (wzrost > 160) {
            System.out.println("mozesz jechac");
        } else {
            throw new InsufficientHeightException("jestes za niski");
        }
    }
}
