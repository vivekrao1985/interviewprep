package com.interviewprep.poker.evaluator;

import lombok.Getter;

/**
 * @author Vivek Rao
 */
public enum HandType
{
    ROYALFLUSH(1),
    FLUSH(2),
    THREESAME(3),
    TWOSAME(4),
    NOTHINGBURGER(5);

    @Getter
    private final int rank;

    HandType(final int rank)
    {
        this.rank = rank;
    }
}
