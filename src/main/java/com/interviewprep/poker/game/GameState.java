package com.interviewprep.poker.game;

import java.util.HashMap;
import java.util.Map;

import com.interviewprep.poker.model.CoinType;
import lombok.Getter;

/**
 * Stores the current state of the game, which is basically the current pot.
 *
 * @author Vivek Rao
 */
public class GameState
{
    @Getter
    private final Map<CoinType, Integer> currentPot = new HashMap<CoinType, Integer>();

    public void addBet(final Map<CoinType, Integer> bet)
    {
        for (final CoinType coinType : bet.keySet())
        {
            Integer value = this.currentPot.get(coinType);
            if (value == null)
            {
                value = new Integer(0);
            }
            value = new Integer(value.intValue() + bet.get(coinType).intValue());
            this.currentPot.put(coinType, value);
        }
    }
}
