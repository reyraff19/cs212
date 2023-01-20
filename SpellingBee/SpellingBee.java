import java.util.*; // Reyaad Raffik CS211
import java.io.*;

public class SpellingBee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner names = new Scanner(System.in);
        Scanner results = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> contestants = new ArrayList<String>();
        int round = 1;

        try (Scanner wordslist = new Scanner(new File("wordlist.txt"))) {
            while (wordslist.hasNext()) {
                words.add((wordslist.nextLine())); // As long as the wordlist.txt file has words, it will continue to
                                                   // add words to the words list.
            }
            System.out.print("How many contestants? ");
            int a = input.nextInt(); // Reads in number of contestants, a.

            System.out.println("Enter the names of the contestants.");

            for (int i = 0; i < a; i++) {
                String b = names.next(); // Takes the name of each contestant.
                contestants.add(b); // Adds the contestant names to a list.
            }

            do {
                ArrayList<String> nextRoundContestants = new ArrayList<String>();
                System.out.println("Round " + round + "\n");
                for (int i = 0; i < contestants.size(); i++) {
                    int word = ((int) (Math.random() * words.size() - 1) + 1); // Stores the index of the word used.
                    System.out.println("The word for " + contestants.get(i) + " is: "
                            + words.get(word));
                    words.remove(word); // Removes the word used from the word list so it is not repeated twice.
                    System.out.print("Answered correctly?(y/n):");
                    String yn = results.next();
                    System.out.println();
                    if (yn.equals("y")) { // If the contestant spells the word correctly, they are added to the next
                        // round of contestants.
                        nextRoundContestants.add(contestants.get(i));
                    }
                }
                if (nextRoundContestants.size() != 0) { // If no one correctly spelled the word, everyone from the
                    // current round goes to
                    // the next round.
                    contestants = nextRoundContestants;
                }
                round++;
            } while (contestants.size() != 1); // As long as there is more than one contestant, keep asking the
            // contestants to spell words.

            System.out.println(contestants.get(0) + " wins!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        names.close();
        input.close();
        results.close();
    }
}