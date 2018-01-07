package com.interviewprep.poker.evaluator;

import com.interviewprep.poker.game.Hand;

/**
 * @author Vivek Rao
 */
public interface HandEvaluator
{
    boolean evaluate(Hand hand);

    int getRank();
}
