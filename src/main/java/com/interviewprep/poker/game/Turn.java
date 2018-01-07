package com.interviewprep.poker.game;

import java.util.HashMap;
import java.util.Map;

import com.interviewprep.poker.model.CoinType;
import lombok.Getter;

/**
 * @author Vivek Rao
 */
public class Turn
{
    public enum TurnType { HOLD, BET, FOLD };

    @Getter
    private final TurnType turnType;

    @Getter
    private final Map<CoinType, Integer> bet = new HashMap<CoinType, Integer>();

    public Turn(final TurnType turnType)
    {
        this.turnType = turnType;
    }

    public void updateBet(final CoinType coinType, final Integer numCoins)
    {
        this.bet.put(coinType, numCoins);
    }
}
