package edu.eci.cvds.patterns.archetype;

/**
 * The App class demonstrates a simple console application that prints a greeting message.
 */
public class App {

    /**
     * The entry point of the application. It processes command-line arguments
     * to construct and print a greeting message.
     *
     * @param args command-line arguments; if present, they are used to personalize the greeting.
     */
    public static void main(String[] args) {
        StringBuilder greetingName = new StringBuilder();

        for (String arg : args) {
            greetingName.append(arg).append(" ");
        }

        String resultMessage = greetingName.toString().trim();

        if (resultMessage.isEmpty()) {
            System.out.println("Hello world!");
        } else {
            System.out.println("Hello " + resultMessage + "!");
        }
    }
}

