package dictionaries;

public class Word {

    public static final int LETTERS = 26, WORDS = LETTERS * LETTERS;

    private String word;

    public int hashCode() {
        //how we mapped  a two-letter word to unique number between 0 and 675
        return LETTERS * (word.charAt(0) - 'a') + (word.charAt(1) - 'a');
    }
}

/*public class WordDictionary {
    private Definition[] defTable = new Definition[Word.WORDS];

    public void insert(Word w, Definition d) {
        defTable[w.hashCode()] = d;
    }

    Definition find(Word w) {
        return defTable[w.hashCode()];
    }

}*/

