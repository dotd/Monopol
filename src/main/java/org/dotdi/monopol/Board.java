package org.dotdi.monopol;

import java.util.ArrayList;
import java.util.List;

public class Board {

    List<Cell> cells = null;

    public Board() {
        cells = new ArrayList<Cell>();
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=0, type=Go, moneyChange=200"));
        cells.add(new Cell("idx=1, cost=60, type=Street, canBeOwned=true, name=Mediterenian Avenue, color=Brown," + ""
                        + "rent=2,1_house=10, 2_houses=30, 3_houses=90, 4_houses=160, 1_hotel=250, mortage=30, house_price=50, hotel_price=250"));
        cells.add(new Cell("idx=2, type=Community Chest"));
        cells.add(new Cell("idx=3, cost=60, type=Street, canBeOwned=true, name=Baltic Avenue, color=Brown, rent=4,"
                        + "1_house=20, 2_houses=60, 3_houses=180, 4_houses=320, 1_hotel=450, mortage=30, house_price=50, hotel_price=250"));
        cells.add(new Cell("idx=4, type=Income Tax, moneyChange=-200"));
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=5, cost=200, type=Railroad, name=Reading Railroad"));
        cells.add(new Cell("idx=6, cost=100, type=Street, canBeOwned=true, name=Oriental Avenue, color=Light Blue,"
                        + "rent=6, 1_house=30, 2_houses=90, 3_houses=270, 4_houses=400, 1_hotel=550, mortage=50, house_price=50, hotel_price=250"));
        cells.add(new Cell("idx=7, type=Chance"));
        cells.add(new Cell("idx=8, cost=100, type=Street, canBeOwned=true, name=Vermont Avenue, color=Light Blue,"
                        + "rent=6, 1_house=30, 2_houses=90, 3_houses=270, 4_houses=400, 1_hotel=550, mortage=50, house_price=50, hotel_price=250"));
        cells.add(new Cell("idx=9, cost=100, type=Street, canBeOwned=true, name=Connecticut Avenue, color=Light Blue,"
                        + "rent=8, 1_house=40, 2_houses=100, 3_houses=300, 4_houses=450, 1_hotel=600, mortage=60, house_price=50, hotel_price=250"));
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=10, type=Just Visiting"));
        cells.add(new Cell("idx=11, cost=140, type=Street, canBeOwned=true, name=St. Charles Place, color=Pink,"
                        + "rent=10, 1_house=50, 2_houses=150, 3_houses=450, 4_houses=625, 1_hotel=750, mortage=70, house_price=100, hotel_price=500"));
        cells.add(new Cell("idx=12, cost=150, type=Utility, name=Electric Company"));
        cells.add(new Cell("idx=13, cost=140, type=Street, canBeOwned=true, name=States Avenue, color=Pink,"
                        + "rent=10, 1_house=50, 2_houses=150, 3_houses=450, 4_houses=625, 1_hotel=750, mortage=70, house_price=100, hotel_price=500"));
        cells.add(new Cell("idx=14, cost=160, type=Street, canBeOwned=true, name=Virginia Avenue, color=Pink,"
                        + "rent=12, 1_house=60, 2_houses=180, 3_houses=500, 4_houses=700, 1_hotel=900, mortage=80, house_price=100, hotel_price=500"));
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=15, cost=200, type=Railroad, name=Pennsylvania Railroad"));
        cells.add(new Cell("idx=16, cost=180, type=Street, canBeOwned=true, name=St. James Place, color=Orange,"
                        + "rent=14, 1_house=70, 2_houses=200, 3_houses=550, 4_houses=750, 1_hotel=950, mortage=90, house_price=100, hotel_price=500"));
        cells.add(new Cell("idx=17, type=Community Chest"));
        cells.add(new Cell("idx=18, cost=180, type=Street, canBeOwned=true, name=Tennessee Avenue, color=Orange,"
                        + "rent=14, 1_house=70, 2_houses=200, 3_houses=550, 4_houses=750, 1_hotel=950, mortage=90, house_price=100, hotel_price=500"));
        cells.add(new Cell("idx=19, cost=200, type=Street, canBeOwned=true, name=New York Avenue, color=Orange,"
                        + "rent=16, 1_house=80, 2_houses=220, 3_houses=600, 4_houses=800, 1_hotel=1000, mortage=100, house_price=100, hotel_price=500"));
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=20, type=Free Park"));
        cells.add(new Cell("idx=21, cost=220, type=Street, canBeOwned=true, name=Kentucky Avenue, color=Red,"
                        + "rent=18, 1_house=90, 2_houses=250, 3_houses=700, 4_houses=875, 1_hotel=1050, mortage=110, house_price=150, hotel_price=750"));
        cells.add(new Cell("idx=22, type=Chance"));
        cells.add(new Cell("idx=23, cost=220, type=Street, canBeOwned=true, name=Indiana Avenue, color=Red,"
                        + "rent=18, 1_house=90, 2_houses=250, 3_houses=700, 4_houses=875, 1_hotel=1050, mortage=110, house_price=150, hotel_price=750"));
        cells.add(new Cell("idx=24, cost=240, type=Street, canBeOwned=true, name=Illinois Avenue, color=Red,"
                        + "rent=20, 1_house=100, 2_houses=300, 3_houses=750, 4_houses=925, 1_hotel=1100, mortage=120, house_price=150, hotel_price=750"));
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=25, cost=200, type=Railroad, name=B. & O. Railroad"));
        cells.add(new Cell("idx=26, cost=260, type=Street, canBeOwned=true, name=Atlantic Avenue, color=Yello,"
                        + "rent=22, 1_house=110, 2_houses=330, 3_houses=800, 4_houses=975, 1_hotel=1150, mortage=130, house_price=150, hotel_price=750"));
        cells.add(new Cell("idx=27, cost=260, type=Street, canBeOwned=true, name=Ventor Avenue, color=Yello,"
                        + "rent=22, 1_house=110, 2_houses=330, 3_houses=800, 4_houses=975, 1_hotel=1150, mortage=130, house_price=150, hotel_price=750"));
        cells.add(new Cell("idx=28, cost=150, type=Utility, name=Water Company"));
        cells.add(new Cell("idx=29, cost=280, type=Street, canBeOwned=true, name=Marvin Gardens, color=Yello,"
                        + "rent=24, 1_house=120, 2_houses=360, 3_houses=850, 4_houses=1025, 1_hotel=1200, mortage=140, house_price=150, hotel_price=750"));
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=30, type=Go To Jail"));
        cells.add(new Cell("idx=31, cost=300, type=Street, canBeOwned=true, name=Pacific Avenue, color=Green,"
                        + "rent=26, 1_house=130, 2_houses=390, 3_houses=900, 4_houses=1100, 1_hotel=1275, mortage=150, house_price=200, hotel_price=1000"));
        cells.add(new Cell("idx=32, cost=300, type=Street, canBeOwned=true, name=North Carolina Avenue, color=Green,"
                        + "rent=26, 1_house=130, 2_houses=390, 3_houses=900, 4_houses=1100, 1_hotel=1275, mortage=150, house_price=200, hotel_price=1000"));
        cells.add(new Cell("idx=33, type=Community Chest"));
        cells.add(new Cell("idx=34, cost=320, type=Street, canBeOwned=true, name=Pennsylvania Avenue, color=Green,"
                        + "rent=28, 1_house=150, 2_houses=450, 3_houses=1000, 4_houses=1200, 1_hotel=1400, mortage=160, house_price=200, hotel_price=1000"));
        //---------------------------------------------------------------------------------------------------------
        cells.add(new Cell("idx=35, cost=200, type=Railroad, name=Short Line Railroad"));
        cells.add(new Cell("idx=36, type=Chance"));
        cells.add(new Cell("idx=37, cost=350, type=Street, canBeOwned=true, name=Park Place, color=Dark Blue,"
                        + "rent=35, 1_house=175, 2_houses=500, 3_houses=1100, 4_houses=1300, 1_hotel=1500, mortage=175, house_price=200, hotel_price=1000"));
        cells.add(new Cell("idx=38, type=Luxury Tax, moneyChange=-100"));
        cells.add(new Cell("idx=39, cost=400, type=Street, canBeOwned=true, name=Boardwalk, color=Dark Blue,"
                        + "rent=50, 1_house=200, 2_houses=600, 3_houses=1400, 4_houses=1700, 1_hotel=2000, mortage=200, house_price=200, hotel_price=1000"));
    }

}
