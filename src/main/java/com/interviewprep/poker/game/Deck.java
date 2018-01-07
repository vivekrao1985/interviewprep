package com.interviewprep.poker.game;

import java.util.ArrayList;
import java.util.List;

import com.interviewprep.poker.model.Card;
import lombok.Getter;

/**
 * A deck of {@link Card}s.
 *
 * @author Vivek Rao
 */
public class Deck
{
    private final List<Card> cards;

    @Getter
    private boolean shuffled = false;

    public Deck()
    {
        this.cards = new ArrayList<Card>(52);
        init();
    }

    /*
     * Shuffle the cards in the deck.
     */
    public void shuffle()
    {
        this.shuffled = true;
    }

    /*
     * Get the card at the top of the deck.
     */
    public Card getCard()
    {
        if (this.shuffled)
        {
            this.shuffled = false;
        }

        return this.cards.remove(this.cards.size() - 1);
    }

    private void init()
    {
        createDeck();
        shuffle();
    }

    private void createDeck()
    {
    }
}
