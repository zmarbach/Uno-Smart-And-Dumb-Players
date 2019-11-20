package com.improving.game;

import java.util.List;

public interface IDeck {
    public int getDrawPileSize();

    public List<Card> getDiscardPile();
}
