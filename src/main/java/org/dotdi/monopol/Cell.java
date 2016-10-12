package org.dotdi.monopol;

class Cell {

    private String type = null;
    private String owner = null;
    private int moneyChange = 0;
    private int idx = -1;
    private boolean canBeOwned = false;
    private String name = null;
    String color = null;
    private int cost = 0;

    int rent = 0;

    int with_1_house = 0;
    int with_2_houses = 0;
    int with_3_houses = 0;
    int with_4_houses = 0;

    int with_1_hotel = 0;

    int mortage = 0;
    int house_price = 0;
    int hotel_price = 0;
    
    int if_2_rr_owned = 50;
    int if_3_rr_owned = 100;
    int if_4_rr_owned = 200;

    public Cell(String str) {
        String[] words = str.split(",");
        for (String word : words) {
            word = word.trim();
            String[] parts = word.split("=");
            String key = parts[0].trim();
            String value = parts[1].trim();

            if (key.equals("type"))
                type = value;
            else if (key.equals("owner"))
                owner = value;
            else if (key.equals("moneyChange"))
                moneyChange = Integer.parseInt(value);
            else if (key.equals("idx"))
                idx = Integer.parseInt(value);
            else if (key.equals("canBeOwned"))
                canBeOwned = Boolean.parseBoolean(value);
            else if (key.equals("name"))
                name = value;
            else if (key.equals("color"))
                color = value;
            else if (key.equals("rent"))
                rent = Integer.parseInt(value);
            else if (key.equals("1_house"))
                with_1_house = Integer.parseInt(value);
            else if (key.equals("2_houses"))
                with_2_houses = Integer.parseInt(value);
            else if (key.equals("3_houses"))
                with_3_houses = Integer.parseInt(value);
            else if (key.equals("4_houses"))
                with_4_houses = Integer.parseInt(value);
            else if (key.equals("1_hotel"))
                with_1_hotel = Integer.parseInt(value);
            else if (key.equals("mortage"))
                with_1_hotel = Integer.parseInt(value);
            else if (key.equals("house_price"))
                house_price = Integer.parseInt(value);
            else if (key.equals("hotel_price"))
                hotel_price = Integer.parseInt(value);
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public int getMoneyChange() {
        return moneyChange;
    }

    public int getIdx() {
        return idx;
    }

    public boolean isCanBeOwned() {
        return canBeOwned;
    }
}
