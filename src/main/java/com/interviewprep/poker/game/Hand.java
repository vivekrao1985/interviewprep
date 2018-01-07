package com.interviewprep.poker.game;

import java.util.ArrayList;
import java.util.List;

import com.interviewprep.poker.model.Card;
import lombok.Getter;

/**
 * @author Vivek Rao
 */
public class Hand
{
    @Getter
    private final List<Card> cards = new ArrayList<Card>(4);

    public void addCard(final Card card)
    {
        if (this.cards.size() < 3)
        {
            this.cards.add(card);
        }
    }
}
