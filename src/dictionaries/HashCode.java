package dictionaries;

public class HashCode {
    private static final int number = 16908799;

    private static int hashCode(String key) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            //127 & number should be prime
            hashVal = (127 * hashVal + key.charAt(i)) % number;
        }
        return hashVal;
    }



    //Bad HashCode on Words.
    //some characters came up with more than other letters so we have a systematic bioses in our data
    //the goal that is sure the systematic biases in your input will not turn into collisions when we run hashCode

    //1-Sum ASCII Values of characters.
    //Rarely exceed 500.Bounched up in 500 buckets.

    // some words like "pat","apt","tap" collide to each others.

    //2-First 3 letters of a word,with (26)^3 buckets.
    //Lots of "pre..." words.
    //No "xzq ... words

    //3-Suppose prime modules to 127.
    //(127 *hashVal) %127 =0

    //Resizing Hash Tables
    /*
    If load factor n/N too large,we lose O(1) performance.
    *-Enlarge hash table when load factor > constant.
    typically, 0.75.
    *-Allocate new array (At least twices large)

    *-Walk through old array,rehash them into a new hashTable.

    Option:Shrink hash tables(e.g when n/N <0.25) to fine memory

    Hash table ops:Usually o(1) time (on average).
    When resizing happens,one operation can take Theta(n) time.

    Transposition Tables:Speed Game Trees:(Tic tac toe)
    Some grids can be reached through many sequences of moves,
    be evaluated many times.Maintain hash table of previously  or counted grids.
    Key is grid and Value is score for that grid.
    Min max alg checks if grid is in the table.
    if answer is yes:
    return score.
    answer No:
    evaluated score (by mini max) & store.

    After we make a move we should empty the table after each move.

     */

}

