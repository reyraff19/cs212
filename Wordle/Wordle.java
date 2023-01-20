import java.util.*; // Reyaad Raffik CS212
import java.io.*;

public class Wordle {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> words = new ArrayList<String>();
        Scanner wordslist = new Scanner(new File("wordlist.txt"));
        Scanner input = new Scanner(System.in);

        while (wordslist.hasNext()) {
            String word = wordslist.nextLine();
            if (word.length() != 5 || (word.contains("'"))) { // If the list has a word that is not 5 letters or
                                                              // contains an apostrophe, it is not added to the list of
                                                              // words that can be used for Wordle.
                continue;
            }
            words.add(word); // Adds the 5 letter words.
        }

        char[][] Wordle = new char[2][5]; // A 2D array which represents the word to guess and the user's input.
        int wordIndex = (int) ((Math.random() * words.size() - 1) + 1); // Takes in the index of the random word to be
                                                                        // used.
        String wordtoGuess = words.get(wordIndex);
        String guess;

        do {
            System.out.print("Enter a guess: ");
            guess = input.next(); // Gets the user's input

            for (int i = 0; i < 5; i++) {
                Wordle[0][i] = wordtoGuess.charAt(i); // Adds each letter from the word that is being guessed to the 2D
                                                      // array.
            }
            if (!words.contains(guess)) { // If the user's guess is not a word in the list, will have them input another
                                          // word.
                System.out.println("Guess is invalid!");
                System.out.print("Enter a guess: ");
                guess = input.next();
            }
            for (int i = 0; i < 5; i++) {
                Wordle[1][i] = guess.charAt(i); // Adds each letter from the user's input to the 2D array of characters.
            }

            boolean[] characters = new boolean[26]; // Creates a 1D array that is a one to one with the alphabet,
                                                    // characters[0] -> 'a', characters[1] -> 'b', as well as all being
                                                    // false because false means that all letters have not been seen
                                                    // once already.

            for (int i = 0; i < 5; i++) {
                int charIndex = Wordle[1][i] - 'a'; // Gets the index of the character that is being tested, subtracts
                                                    // the letter 'a' from the user's guess since the difference
                                                    // represents the index of the letter in the 1D array.

                if (Wordle[1][i] == Wordle[0][i]) { // If the character from the user's guess and the word being guessed
                                                    // is the same and is in the same index, it is accounted for by
                                                    // changing the characters array to true and uppercases the letter.
                    Wordle[1][i] = Character.toUpperCase(Wordle[1][i]);
                    characters[charIndex] = true;
                } else if (wordtoGuess.contains(Character.toString(Wordle[1][i]))) { // If the character from the user's
                                                                                     // guess is in the word being
                                                                                     // guessed, it checks if the word
                                                                                     // has already been found, seeing
                                                                                     // if the element in the 1D array
                                                                                     // is true, then converts it to a
                                                                                     // hyphen.
                    if (characters[charIndex]) {
                        Wordle[1][i] = '-';
                    } else {
                        Wordle[1][i] = Wordle[1][i]; // If the character from the user's guess is in the word but has
                                                     // not been accounted for in the 1D array, the index of the letter
                                                     // is changed to true and the letter remains in the guess.
                        characters[charIndex] = true;
                    }
                } else {
                    Wordle[1][i] = '-'; // If the character from the user's guess is not in the word being guessed, it
                                        // is changed to a hyphen.
                }
            }

            for (int i = 0; i < 5; i++) { // Demonstrates which letters are and are not in the right place or if the
                                          // letters are in the word being guessed.
                System.out.print(Wordle[1][i]);
            }
            System.out.println();

        } while (!(guess.equalsIgnoreCase(wordtoGuess))); // This will run until the word that the user guesses is the
                                                          // same as the word being guessed.

        input.close();
    }
}