package com.improving.game;

import java.util.List;
import java.util.Optional;

public interface IGame {
    public void playCard(Card card, Optional<Colors> declaredColor, IPlayerInfo player);

    public boolean isPlayable(Card card);

    public Card draw();

    public Card drawForTurn();

    public List<IPlayerInfo> getPlayerInfo();

    public IPlayer getNextPlayer();

    public IPlayer getPreviousPlayer();

    public IPlayer getNextNextPlayer();

    public IDeck getDeckInfo();
}

