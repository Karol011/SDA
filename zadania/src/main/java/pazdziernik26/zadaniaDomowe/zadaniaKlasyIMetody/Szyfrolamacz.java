package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody;

import java.util.Random;
import java.util.Scanner;

/*
6. Szyfrołamacz – użytkownik musi odgadnąć 4 cyfrowe hasło, ma 5 żyć,
po podaniu hasła program informuje go czy podany kod był większy lub mniejszy od hasła. Po utracie wszystkich żyć program kończy działanie
    a. Po utracie wszystkich żyć program pyta użytkownika czy chce spróbować ponownie
    b. Użytkownik może raz w ciągu gry poprosić o podpowiedź która odsłoni jedno z 4 cyfr tajnego hasła
 */
public class Szyfrolamacz {
    public static int password = generatePassword();
   public static boolean isHintAvailable = true;
   public static int lives = 5;



    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        boolean isAWinner;
        do {
            //TODO: add some hint to password for user
            System.out.println("lives: " + lives);
            isAWinner = checkNumber(loadNumber(), password);
            lives--;
        } while (lives > 0 && !isAWinner);  //has lives or is not a winner
        if (lives == 0) {
            System.out.println("password was: " + password + " but you are out of lives, game over :(");
        }
    }

    public static int generatePassword() {
        // define the range
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        int randomPassword;
        // generate random numbers within 1 to 10
        randomPassword = (int) (Math.random() * range) + min;
        return randomPassword;
    }

    public static int loadNumber() {
        System.out.println("Type the number ");
        if (isHintAvailable) {
            System.out.println(" (0 for hint)");
        }
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        if (givenNumber == 0 && isHintAvailable) {
            askForHelp();
            isHintAvailable = false;
            lives++;
        }

        return givenNumber;
    }

    //check if greater,lower or equal
    public static void askForHelp() {
        Random random = new Random();
        int index = random.nextInt(4)+1;
        System.out.println("Digit " + index +1 + " in code is: " + String.valueOf(password).charAt(index));

    }

    public static boolean checkNumber(int number, int password) {
        boolean isAWinner = false;
        if (number == password) {
            System.out.println("congratulations");
            isAWinner = true;
        }
        if (number > password) {
            System.out.println("too much");
        }
        if (number < password) {
            System.out.println("too little");
        }
        return isAWinner;
    }
}

