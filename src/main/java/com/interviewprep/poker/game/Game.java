package com.interviewprep.poker.game;

import java.util.ArrayList;
import java.util.List;

import com.interviewprep.poker.evaluator.HandEvaluator;

/**
 * Emulates an instance of a poker game.
 *
 * @author Vivek Rao
 */
public class Game
{
    private final List<Player> players = new ArrayList<Player>();

    private final Deck deck = new Deck();

    private final List<HandEvaluator> evaluators = new ArrayList<HandEvaluator>();

    public Game()
    {
        setup();
    }

    private void setup()
    {
        // create deck, players and evaluators, the latter
        // sorted by decreasing order of ranks
    }

    public void play()
    {
        final GameState gameState = new GameState();
        // reshuffle deck if required
        // deal 2 cards to each player
        // do initial bet
        bet(gameState);
        // 2 more rounds 1 card each and bet
        // pick winner
        // update winning player's pot
        updateWinnerPot(pickWinner(), gameState);
    }

    private void bet(final GameState gameState)
    {
        for (final Player player : this.players)
        {
            if (!player.isFold())
            {
                final Turn turn = player.makeTurn(gameState);
                if (Turn.TurnType.BET.equals(turn.getTurnType()) && isValidTurn(turn))
                {
                    gameState.addBet(turn.getBet());
                }
            }
        }
    }

    private void updateWinnerPot(final Player winner, final GameState gameState)
    {
        winner.updatePot(gameState.getCurrentPot());
    }

    private Player pickWinner()
    {
        Player winningPlayer = null;
        int currentRank = Integer.MAX_VALUE;

        for (final Player player : this.players)
        {
            for (final HandEvaluator evaluator : this.evaluators)
            {
                if (evaluator.evaluate(player.getHand()))
                {
                    if (evaluator.getRank() < currentRank)
                    {
                        winningPlayer = player;
                        currentRank = evaluator.getRank();
                    }
                }
            }
        }

        return winningPlayer;
    }

    private boolean isValidTurn(final Turn turn)
    {
        // make sure the player doesn't do stupid things like FOLD but still bet
        return true;
    }
}
