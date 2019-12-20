package com.improving.game;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public interface IPlayer extends IPlayerInfo {

    public Card draw(IGame iGame);

    public void takeTurn(IGame iGame);

    public void newHand(List<Card> hand);

    public List<Card> getHand();

    public void playInfo(Card card, Optional<Color> color, IPlayerInfo player);

    public void playInfo(IPlayerInfo player);
}

