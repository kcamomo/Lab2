package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	public Deck()
	{		
		//	This method will do a for/each, returning each rank in the enum.
		DeckID=UUID.randomUUID();
		
		for (eRank Rank : eRank.values()) {
			Card heart=new Card(Rank,eSuit.HEARTS);
			Card club=new Card(Rank,eSuit.CLUBS);
			Card spade=new Card(Rank,eSuit.SPADES);
			Card diamond=new Card(Rank,eSuit.DIAMONDS);
			
			DeckCards.add(heart);
			DeckCards.add(club);
			DeckCards.add(spade);
			DeckCards.add(diamond);
		}
		
		Collections.shuffle(DeckCards);
	}
	
	public Card DrawCard()
	{
		return DeckCards.remove(0);
	}
}
