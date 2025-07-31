package collections;
import java.util.*;

class Card {
    String symbol;
    int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Card))
            return false;
        Card other = (Card) obj;
        return this.symbol.equals(other.symbol) && this.number == other.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, number);
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}
class CardCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Card> cardSet = new HashSet<>();
        Set<String> symbolsFound = new HashSet<>();
        while (symbolsFound.size() < 4) {
            System.out.print("Enter a card :");
            String input = scanner.nextLine().trim();
            String symbol = input.substring(0, 1);
            int number = Integer.parseInt(input.substring(1).trim());

            Card card = new Card(symbol, number);
            cardSet.add(card);
            symbolsFound.add(symbol);
        }

        System.out.println("Four symbols gathered in " + cardSet.size() + " cards.");
        System.out.println("Cards in Set are :");
        List<Card> cardList = new ArrayList<>(cardSet);
       
        Collections.sort(cardList, Comparator.comparing(c -> c.symbol));

        for (Card c : cardList) {
            System.out.println(c.symbol + " " + c.number);
        }

        scanner.close();
    }
}
