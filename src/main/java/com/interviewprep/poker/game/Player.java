package com.interviewprep.poker.game;

import java.util.Map;

import com.interviewprep.poker.model.CoinType;
import lombok.Getter;

/**
 * @author Vivek Rao
 */
public class Player
{
    @Getter
    private final String name;

    @Getter
    private boolean fold;

    @Getter
    private final Hand hand;

    private final Map<CoinType, Integer> playerPot;

    public Player(
        final String name,
        final Hand initialHand,
        final Map<CoinType, Integer> initialPot)
    {
        this.name = name;
        this.hand = initialHand;
        this.playerPot = initialPot;
    }

    public Turn makeTurn(final GameState gameState)
    {
        // wait for player to make turn based on current game state
        return null;
    }

    public void updatePot(final Map<CoinType, Integer> pot)
    {
        for (final CoinType coinType : pot.keySet())
        {
            Integer value = this.playerPot.get(coinType);
            if (value == null)
            {
                value = new Integer(0);
            }
            value = new Integer(value.intValue() + pot.get(coinType).intValue());
            this.playerPot.put(coinType, value);
        }
    }
}
