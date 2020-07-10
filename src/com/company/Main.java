package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int quantityMatchesTable = 20;
        int quantityMatchesGamer = 1;
        SystemOutPrintGameSituation.printGameSituation(quantityMatchesTable, quantityMatchesGamer);
        while (true) {
            quantityMatchesTable -= GamingComputerLogic.matchesComputer(quantityMatchesTable, quantityMatchesGamer);
            SystemOutPrintGameSituation.printGameSituation(quantityMatchesTable, quantityMatchesGamer);
            if (quantityMatchesTable == 1) {
                break;
            }
            quantityMatchesGamer = new Scanner(System.in).nextInt();
            quantityMatchesGamer = (quantityMatchesGamer < 1 || quantityMatchesGamer > 3) ? 0 : quantityMatchesGamer;
            quantityMatchesTable -= quantityMatchesGamer;
        }
    }

}
