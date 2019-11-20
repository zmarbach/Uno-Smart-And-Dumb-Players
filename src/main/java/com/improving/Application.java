package com.improving;

import com.improving.game.Game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var game = context.getBean(Game.class);
        var wins = new HashMap<String, Integer>();

        for(var p : game.getPlayerInfo()) {
            wins.put(p.getName(), 0);
        }

        for (int i = 0; i < 10000; i++) {
            game.play();
            var name = game.getWinningPlayer().getName();
            wins.put(name, wins.get(name) + 1);
        }

        for (var key : wins.keySet()) {
            System.out.println(key + "\t\t\t" + wins.get(key));
        }
    }
}
