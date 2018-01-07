package com.interviewprep.poker.model;

import lombok.Getter;

/**
 * @author Vivek Rao
 */
@Getter
public class Card
{
    private final Suite suite;

    private final CardRank cardRank;

    public Card(final Suite suite, final CardRank cardRank)
    {
        this.suite = suite;
        this.cardRank = cardRank;
    }
}
