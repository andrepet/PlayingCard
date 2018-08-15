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


        CardDeck myDeck = CardDeck.createCardDeck();
        for (final var card : myDeck.cards) {
            System.out.println(card.display());
        }

    }
}
