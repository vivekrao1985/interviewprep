package com.interviewprep.poker.game;

import java.util.ArrayList;
import java.util.List;

import com.interviewprep.poker.model.Card;
import lombok.Getter;

/**
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
    }

    public void shuffle()
    {
        this.shuffled = true;
    }

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
