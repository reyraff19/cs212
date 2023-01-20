package Objects;

public class DeckTester {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		for(int i = 0; i < 4; i++) {
			System.out.println(myDeck.drawCard());
		}
		myDeck.shuffle();
		for(int i = 0; i < 4; i++) {
			System.out.println(myDeck.drawCard());
		}
		System.out.println(myDeck.getNumCards());
		
		//draw top card and put it back
		Card topCard = myDeck.drawCard();
		myDeck.returnCardToTop(topCard);
		
		myDeck.restore();
		System.out.println(myDeck.getNumCards());
		
		myDeck.shuffle();
		Card firstCard = myDeck.drawCard();
		Card secondCard = myDeck.drawCard();
		System.out.println(firstCard + "\n" + secondCard);
		if(firstCard.hasSameRankAs(secondCard)) {
			System.out.println("These cards are a pair!");
		}else {
			System.out.println("These cards are not a pair.");
		}
		
		String[] mySuits = {"Circles", "Squares"};
		String[] myRanks = {"A", "B", "C", "D", "E", "F"};
		Deck deck2 = new Deck(mySuits, myRanks);
		deck2.shuffle();
		System.out.println(deck2.drawCard());
	}

}
