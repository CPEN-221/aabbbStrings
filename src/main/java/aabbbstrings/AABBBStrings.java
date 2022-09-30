package aabbbstrings;

import java.util.HashSet;
import java.util.Set;

public class AABBBStrings {

    /**
     * @param n >= 0
     * @return the number of words in the AABBB language of length n
     */
    public static long countStrings(int n) {

        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return 1;
        }
        return countStrings(n - 2) + countStrings(n - 3);
    }

    /**
     *
     * @param n
     *            >= 0
     * @return the set of words in the AABBB language of length n
     * @throws TooManyWordsException
     *             when the length of a word exceeds 30
     */
    public static Set<String> getWords(int n) throws TooManyWordsException {

        if (n == 0 || n == 1) {
            return new HashSet<String>();
        }

        if (n == 2) {
            HashSet<String> set = new HashSet<>();
            set.add("AA");
            return set;
        }

        if (n == 3) {
            HashSet<String> set = new HashSet<>();
            set.add("BBB");
            return set;
        }

        Set<String> setAA = getWords(n - 2);
        Set<String> setBBB = getWords(n - 3);

        HashSet<String> setWithAA = new HashSet<>();
        for (String word: setAA) {
            setWithAA.add(word + "AA");
        }

        HashSet<String> setWithBBB = new HashSet<>();
        for (String word: setBBB) {
            setWithBBB.add(word + "BBB");
        }

        setWithAA.addAll(setWithBBB);
        return setWithAA;

    }

}
