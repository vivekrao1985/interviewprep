package com.interviewprep.poker.model;

import lombok.Getter;

/**
 * @author Vivek Rao
 */
public enum CoinType
{
    BLACK(100),
    GREEN(50),
    YELLOW(20),
    RED(10),
    WHITE(1);

    @Getter
    private final int value;

    CoinType(final int value)
    {
        this.value = value;
    }
}
