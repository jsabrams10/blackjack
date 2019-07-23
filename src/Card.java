// This class represents one playing card.
public class Card
{
	
	public static void main(String[] args){
		Card testCard = new Card(0, 1);
		int suit = testCard.getSuit();
		int face = testCard.getFace();
		int value = testCard.getValue();
		System.out.println(suit);
		System.out.println(face);
		System.out.println(value);
	}
	
	// Card suits (provided for your convenience - use is optional)
	public static final int SPADES   = 0;
	public static final int HEARTS   = 1;
	public static final int CLUBS    = 2;
	public static final int DIAMONDS = 3;

	// Card faces (provided for your convenience - use is optional)
	public static final int ACE      = 1;
	public static final int TWO      = 2;
	public static final int THREE    = 3;
	public static final int FOUR     = 4;
	public static final int FIVE     = 5;
	public static final int SIX      = 6;
	public static final int SEVEN    = 7;
	public static final int EIGHT    = 8;
	public static final int NINE     = 9;
	public static final int TEN      = 10;
	public static final int JACK     = 11;
	public static final int QUEEN    = 12;
	public static final int KING     = 13;

	// define fields here
	int suit;
	int face;
	int value;
	
	// This constructor builds a card with the given suit and face, turned face down.
	public Card(int cardSuit, int cardFace)
	{
		//Construct Card's Suit
		if (cardSuit == 0)
			this.suit = SPADES;
		
		if (cardSuit == 1)
			this.suit = HEARTS;
		
		if (cardSuit == 2)
			this.suit = CLUBS;
		
		if (cardSuit == 3)
			this.suit = DIAMONDS;
		
		//Construct Card's Face
		if (cardFace == 1)
			this.face = ACE;
		
		if (cardFace == 2)
			this.face = TWO;
		
		if (cardFace == 3)
			this.face = THREE;
		
		if (cardFace == 4)
			this.face = FOUR;
		
		if (cardFace == 5)
			this.face = FIVE;
		
		if (cardFace == 6)
			this.face = SIX;
		
		if (cardFace == 7)
			this.face = SEVEN;
		
		if (cardFace == 8)
			this.face = EIGHT;
		
		if (cardFace == 9)
			this.face = NINE;
		
		if (cardFace == 10)
			this.face = TEN;
		
		if (cardFace == 11)
			this.face = JACK;
		
		if (cardFace == 12)
			this.face = QUEEN;
		
		if (cardFace == 13)
			this.face = KING;
	}

	// This method retrieves the suit (spades, hearts, etc.) of this card.
	public int getSuit()
	{
		return this.suit;
	}
	
	// This method retrieves the face (ace through king) of this card.
	public int getFace()
	{
		return this.face;
	}
	
	// This method retrieves the numerical value of this card
	// (usually same as card face, except 1 for ace and 10 for jack/queen/king)
	public int getValue()
	{
		if (this.face <= 9)
			return this.face;
	
		else
			return 10;
	}
	
	public String toString(Card a){
		
		String face = null;
		String suit = null;
		
		if (a.getFace() == 1)
			face = "Ace of ";
		
		if (a.getFace() == 2)
			face = "Two of ";
		
		if (a.getFace() == 3)
			face = "Three of ";
		
		if (a.getFace() == 4)
			face = "Four of ";
		
		if (a.getFace() == 5)
			face = "Five of ";
		
		if (a.getFace() == 6)
			face = "Six of ";
		
		if (a.getFace() == 7)
			face = "Seven of ";
	
		if (a.getFace() == 8)
			face = "Eight of ";
		
		if (a.getFace() == 9)
			face = "Nine of ";
		
		if (a.getFace() == 10)
			face = "Ten of ";
		
		if (a.getFace() == 11)
			face = "Jack of ";
		
		if (a.getFace() == 12)
			face = "Queen of ";
		
		if (a.getFace() == 13)
			face = "King of ";
		
		if (a.getSuit() == 0)
			suit = "Spades";
		
		if (a.getSuit() == 1)
			suit = "Hearts";
				
		if (a.getSuit() == 2)
			suit = "Clubs";
					
		if (a.getSuit() == 3)
			suit = "Diamonds";

		return ""+face+suit;
	}
}