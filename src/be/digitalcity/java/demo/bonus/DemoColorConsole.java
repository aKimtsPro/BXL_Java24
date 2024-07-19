package be.digitalcity.java.demo.bonus;

public class DemoColorConsole {

    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        // Couleur dans la console
        System.out.println(ANSI_RED + "salut");
        System.out.println(ANSI_RESET + "salut");
        System.out.println(ANSI_GREEN + "salut");

        // utilisation d'unicode
        System.out.println('\u8742');
    }
}
