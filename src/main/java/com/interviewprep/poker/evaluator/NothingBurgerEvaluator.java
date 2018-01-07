package com.interviewprep.poker.evaluator;

import com.interviewprep.poker.game.Hand;

/**
 * @author Vivek Rao
 */
public class NothingBurgerEvaluator implements HandEvaluator
{
    public boolean evaluate(final Hand hand)
    {
        return true;
    }

    public int getRank()
    {
        return HandType.NOTHINGBURGER.getRank();
    }
}
