public class Phrase {
    public void replaceNthOccurrence(String str, int n, String repl) {
        int spot = findNthOccurrence(str, n);
        if (spot != -1) {
            currentPhrase = currentPhrase.substring(0, spot) + repl + currentPhrase.substring(spot + str.length);
        }
    }
}
