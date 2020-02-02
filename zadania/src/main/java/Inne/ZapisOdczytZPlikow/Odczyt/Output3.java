package Inne.ZapisOdczytZPlikow.Odczyt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Output3 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\Sheet\\output_form.txt");
        Path path = Paths.get(file.getAbsolutePath());
        long lineCount = Files.lines(path).count();

        try (Stream<String> stream = Files.lines(path)) {
            long numberOFWords = Files.lines(path)
                    .flatMap(line -> Arrays.stream(line.split(" "))) // this section
                    .count();
            System.out.println("Lines: " + lineCount + "\n" +
                    "Words: " + numberOFWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
