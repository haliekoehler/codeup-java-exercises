import java.util.Scanner;

/**
 * Created by HKoehler on 1/5/17.
 */

// TODO Translate from English to Pig Latin.

        // Prompt the user for a word.
        // Translate the text to Pig Latin and display it on the console.
        // Ask the user if he or she wants to translate another word.
        // Convert each word to lowercase before translating.
        // If a word starts with a vowel, just add “way” onto the ending.
        // If a word starts with a consonant, move all of the consonants that appear before the first vowel to the end of the word, then add “ay” to the end of the word.
        // Treat “y” as a consonant.

public class PigLatin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;

        System.out.println("!--- PIG LATIN translator ---!");
        System.out.println("Enter word to translate: ");
        userInput = sc.next().toLowerCase();
        System.out.println(userInput);

        System.out.println(userInput.indexOf(0));
        System.out.println(userInput.lastIndexOf(0));
    }

}
