// This class represents the deck of cards from which cards are dealt to players.
public class Deck
{
	// define fields here
	Card [] deck = new Card [52];
	int cardsLeft = 52;
	
	// This constructor builds a deck of 52 cards.
	public Deck()
	{
		//Open new pack.
		for (int suit = 0; suit < 4; suit++){
			for (int face = 1; face < 14; face++){
				Card newCard = new Card(suit,face);
				deck[(suit*13)+face-1] = newCard;
			}
		}
		
		// First shuffle.
		shuffle();
	}
	
	// This method takes the top card off the deck and returns it.
	public Card deal()
	{
		cardsLeft--;
		return this.deck[(cardsLeft)];
	}
	
	// this method returns true if there are no more cards to deal, false otherwise
	public boolean isEmpty()
	{
		if (cardsLeft < 1)
			return true;
		
		else
			return false;		
	}
	
	//this method puts the deck in some random order
	public void shuffle(){
		
		for (int i = 51; i >= 0; i--){
			int random = (int)(Math.random() * 52);
			Card temp = deck [i];
			deck [i] = deck [random];
			deck [random] = temp;
		}	
	}
}