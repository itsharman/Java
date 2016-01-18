package casino;

import java.util.ArrayList;

public class Dealer {

	ArrayList<Card> deck; //data
	
	public Dealer(){
		deck = new ArrayList<Card>(); //creates an empty deck
		
		//this is how I add cards
		//deck.add(new Card(1,5)); //(suit, value)
		
		for(int suit = 0; suit < 4; suit++) {
			for(int value = 1; value <= 13; value++) {
				deck.add(new Card(value,suit));
			}
		}
			
	}

	public Card deal()
	{
		int randCard = (int) (Math.random()*deck.size());	
		return deck.remove(randCard);
	}
	
	public ArrayList<Card> getDeck()
	{
		return deck;
	}
	
	// Returns the highest valued card in an array
	public Card highestCard(ArrayList<Card> hand)
	{
		
		Card highestCard = null;
		for (int i = 0; i < hand.size(); i++) {
			highestCard = hand.get(i);
			if (hand.get(i).getValue() <= hand.get(i+1).getValue()) {
				highestCard = hand.get(i+1);
			}
		}
		return highestCard;
		
	} 

	// Return 1 if handA has the highest card, 2 if handB has the highest card, or 3 if they have the same highest card
	public int highHand(ArrayList<Card> handA, ArrayList<Card> handB)
	{
		return 0;

	}

}

