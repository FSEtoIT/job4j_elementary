package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        if ((word[word.length - 1] != postfix[postfix.length - 1]) && (word[word.length - 2] == postfix[postfix.length - 2])) {
        return false;
        }
        return result;
    }
}
