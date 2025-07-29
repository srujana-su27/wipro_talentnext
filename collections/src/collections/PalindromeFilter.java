package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PalindromeFilter {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<>();
        words.add("radar");
        words.add("level");
        words.add("world");
        words.add("madam");
        words.add("java");
        words.add("civic");
        words.add("python");
        words.add("refer");
        words.add("hello");
        words.add("deified");

        Predicate<String> isPalindrome = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reversed);
        };

        List<String> palindromes = words.stream()
                                        .filter(isPalindrome)
                                        .collect(Collectors.toList());

        System.out.println("Palindromic words: " + palindromes);
    }
}