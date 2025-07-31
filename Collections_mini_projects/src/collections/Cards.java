package collections;
import java.util.*;

class Cards {
    String symbol;
    int number;

    public Cards(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Cards : ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        List<Card> cards = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter card " + i + ":");
            String input = scanner.nextLine().trim();
            String symbol = "";
            String numberStr = "";
            for (char ch : input.toCharArray()) {
                if (Character.isDigit(ch))
                    numberStr += ch;
                else
                    symbol += ch;
            }
            int number = Integer.parseInt(numberStr);
            cards.add(new Card(symbol, number));
        }
        Map<String, List<Card>> symbolMap = new TreeMap<>();
        for (Card card : cards) {
            symbolMap.computeIfAbsent(card.symbol, k -> new ArrayList<>()).add(card);
        }

        System.out.print("Distinct Symbols are : ");
        for (String key : symbolMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

     
        for (Map.Entry<String, List<Card>> entry : symbolMap.entrySet()) {
            String symbol = entry.getKey();
            List<Card> cardList = entry.getValue();

            System.out.println("Cards in " + symbol + " Symbol");
            int sum = 0;
            for (Card c : cardList) {
                System.out.print(c.number + c.symbol + " ");
                sum += c.number;
            }
            System.out.println();
            System.out.println("Number of cards : " + cardList.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        scanner.close();
    }
}