package app.view;

import java.util.Scanner;

public class UtilitiesView {
    public static String ask(Scanner reader, String string) {
        System.out.println(string);
        return reader.nextLine();
    }

    public static Integer askInteger(Scanner reader, String string) {
        System.out.println(string);
        return Integer.valueOf(reader.nextLine());
    }
}
