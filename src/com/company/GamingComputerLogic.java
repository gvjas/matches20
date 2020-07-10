package com.company;

public class GamingComputerLogic {

    public static int matchesComputer(int quantityMatchesTable, int quantityMatchesGamer) {
        if (quantityMatchesTable == 20) {
            return 3;
        } else if (quantityMatchesGamer < 1 || quantityMatchesGamer > 3) {
            return 0;
        } else {
            return 4 - quantityMatchesGamer;
        }

    }

}
