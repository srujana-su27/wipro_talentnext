package collections;
import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performOperations(String S1, String S2) {
        ArrayList<String> results = new ArrayList<>();
        StringBuilder s1Op1 = new StringBuilder(S1);
        int s2Index = 0;
        for (int i = 1; i < s1Op1.length(); i += 2) {
            s1Op1.setCharAt(i, S2.charAt(s2Index % S2.length()));
            s2Index++;
        }
        results.add(s1Op1.toString());

        String s2Rev = new StringBuilder(S2).reverse().toString();
        int lastIdx = S1.lastIndexOf(S2);
        String s2plusS1;
        if (lastIdx != -1) {
            s2plusS1 = S1.substring(0, lastIdx) + s2Rev + S1.substring(lastIdx + S2.length());
        } else {
            s2plusS1 = S1 + S2;
        }
        results.add(s2plusS1);
        int firstIdx = S1.indexOf(S2);
        String s3;
        if (firstIdx != -1) {
            s3 = S1.substring(0, firstIdx) + S1.substring(firstIdx + S2.length());
        } else {
            s3 = S1;
        }
        results.add(s3);
        int len = S2.length();
        int firstHalfEnd = (len + 1) / 2; 
        String firstHalf = S2.substring(0, firstHalfEnd);
        String secondHalf = S2.substring(firstHalfEnd);
        String s4 = firstHalf + S1 + secondHalf;
        results.add(s4);
        StringBuilder s5 = new StringBuilder(S1);
        for (int i = 0; i < s5.length(); i++) {
            if (S2.indexOf(s5.charAt(i)) != -1) {
                s5.setCharAt(i, '*');
            }
        }
        results.add(s5.toString());

        return results;
    }
    public static void main(String[] args) {
        String S1 = "JAVAJAVA";
        String S2 = "VA";
        ArrayList<String> result = performOperations(S1, S2);
        System.out.println(result);
    }
}