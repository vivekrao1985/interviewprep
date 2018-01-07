package com.interviewprep.poker.evaluator;

import com.interviewprep.poker.game.Hand;

/**
 * @author Vivek Rao
 */
public class RoyalFlushEvaluator implements HandEvaluator
{
    public boolean evaluate(final Hand hand)
    {
        // evaluate the hand to see if it's a royal flush
        return false;
    }

    public int getRank()
    {
        return HandType.ROYALFLUSH.getRank();
    }
}
