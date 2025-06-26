import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mad Libs Game!");
        System.out.println("Please provide the following words:");

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb (past tense): ");
        String verbPast = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Enter a person's name: ");
        String person = scanner.nextLine();

        System.out.print("Enter a plural noun: ");
        String pluralNoun = scanner.nextLine();

        System.out.println("\nHere's your Mad Libs story:\n");

        String story = "One day, " + person + " went to the " + place + ".\n" +
                       "It was a very " + adjective + " day. Suddenly, a " + noun + " appeared and " + verbPast + " " + adverb + ".\n" +
                       "Everyone around was shocked, but they just kept playing with their " + pluralNoun + ".\n" +
                       "It was a day to remember!\n";

        System.out.println(story);

        scanner.close();
    }
}
