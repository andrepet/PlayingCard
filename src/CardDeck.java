import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    public final List<Card> cards = new ArrayList();

    private CardDeck() {
        for (final var color : Color.values()) {
            for (final var value : Value.values()) {
                cards.add(new Card(color, value));
            }
        }
    }

    public static CardDeck createCardDeck(){
        return new CardDeck();
    }

//    public CardDeck(List cards){
//
//    }


}
