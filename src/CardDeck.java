import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CardDeck {

    public final List<Card> cards = new ArrayList();

    private CardDeck() {
        for (final var color : Color.values()) {
            for (final var value : Value.values()) {
                cards.add(new Card(color, value));
            }
        }

//        cards.add(new Card(Color.HEARTS, Value.NINE));
    }

    public static CardDeck createCardDeck(){
        return new CardDeck();
    }

    public Optional<Card> drawCard(){
        Card drawedCard = null;
        try{
            drawedCard = cards.remove(0);
            return Optional.of(drawedCard);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Heej");
            return Optional.empty();
        }
    }

    public boolean isEmpty(){
        return cards.size() <= 0;
    }

//    public CardDeck(List cards){
//
//    }


}
