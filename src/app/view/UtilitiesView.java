package app.view;

import java.util.Scanner;

public class UtilitiesView {
    public static String ask(Scanner reader, String string) {
        System.out.println(string);
        return reader.nextLine();
    }
}
