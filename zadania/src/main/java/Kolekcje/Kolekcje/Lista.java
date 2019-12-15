package Kolekcje.Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("piesel");
        myList.add("samochod");
        myList.add("kotel");
        myList.add("tata");
        myList.add("tata");
        myList.add("kotel");
        myList.add("czlowiek");
        myList.add("czlowiek");
        myList.add("ziomeczek");
        myList.add("pioter");
        myList.add("pioter");
        System.out.println(myList);
        /*
        myList.set(3, "korona");
        System.out.println(myList);
        System.out.println(myList.indexOf("kotel"));
        System.out.println(myList);
        myList.remove("czlowiek");
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
        System.out.println();
        */
        System.out.println();
        showDuplicates(myList);
        System.out.println(removeDuplicates(myList));

    }

    public static void showDuplicates(List<String> listTocheck) {
        int indexToRemove = 0;
        List<String> listOfDuplicates = new ArrayList<>();
        for (int i = 0; i < listTocheck.size(); i++) {
            if (listTocheck.lastIndexOf(listTocheck.get(i)) != i) {
                listOfDuplicates.add(listTocheck.get(i));
            }
        }
        System.out.println(listOfDuplicates);
    }
    public static List removeDuplicates(List<String> listTocheck) { //todo
        List<String> removeDuplicates = new ArrayList<>();
        for (int i = 0; i < listTocheck.size(); i++) {
            if (listTocheck.lastIndexOf(listTocheck.get(i)) != i) {
                removeDuplicates.remove(listTocheck.get(i));
            }
        }
        System.out.println(removeDuplicates);
return removeDuplicates;
    }

}
