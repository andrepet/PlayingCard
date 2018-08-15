import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Card myCard = new Card(Color.HEARTS, Value.SEVEN);
//        System.out.println(myCard);
//        System.out.println(myCard.display());
//        System.out.println(myCard.isHidden());
//        myCard.flip();
//        System.out.println(myCard.display());
//        System.out.println(myCard.isHidden());
//        myCard.flip();
//        System.out.println(myCard.display());
//        System.out.println(myCard.isHidden());


//        CardDeck myDeck = CardDeck.createCardDeck();
//        for (final var card : myDeck.cards) {
//            System.out.println(card.display());
//        }


//        CardDeck myDeck = CardDeck.createCardDeck();
//        Optional<Card> card1 = myDeck.drawCard();
//        if (card1.isPresent()){
//            Card trueCard = card1.get();
//            System.out.println(trueCard.display());
//        }
//
//        Optional<Card> card2 = myDeck.drawCard();
//        if(!card2.isPresent()){
//            System.out.println("THe deck is empty!");
//        }


        CardDeck myDeck = CardDeck.createCardDeck();
        Card foundCard = null;

        myDeck.drawCard();

        while (!myDeck.isEmpty()){
            Optional<Card> card = myDeck.drawCard();
            if (card.isPresent()){
                Card realCard = card.get();
                if (realCard.getColor() == Color.SPADES && realCard.getValue() == Value.TWO){
                    foundCard = realCard;
                }
            }
        }
        if (foundCard != null){
            System.out.println("Found our card: " + foundCard.display());
        }
        else{
            System.out.println("We could not find our card! :(");
        }
    }
}
