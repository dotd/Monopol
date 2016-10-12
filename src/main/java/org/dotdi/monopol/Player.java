package org.dotdi.monopol;

public class Player {
    
    private String name = null;
    private int money = 0;
    
    public Player(String name, int money) {
        super();
        this.name = name;
        this.money = money;
    }

    public static Player generateStandard(String name) {
        return new Player(name, 1500);                
    }

}
