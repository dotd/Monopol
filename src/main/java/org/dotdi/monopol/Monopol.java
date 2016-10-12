package org.dotdi.monopol;

import java.util.ArrayList;
import java.util.List;


public class Monopol {

    public static void main(String[] args) {
        Monopol m = new Monopol(3);
    }

    List<Player> players = null;

    public Monopol(int noPlayers) {
        players = new ArrayList<Player>(noPlayers);
        for (int i=0; i<noPlayers; i++)
            players.add(Player.generateStandard("player"+i));
    }
    
    


}
