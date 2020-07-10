package com.company;

import java.util.Scanner;

public class SystemOutPrintGameSituation {

    public static void printGameSituation(int quantityMatchesTable, int quantityMatchesGamer) {
        int quantityMatchesComputer = GamingComputerLogic.matchesComputer(quantityMatchesTable, quantityMatchesGamer);
        if (quantityMatchesTable == 20) {
            System.out.println("Игра началась!");
        } else if (quantityMatchesGamer < 1 || quantityMatchesGamer > 3) {
            System.out.print("Неверное количество.\nВам необходимо убирать 1, 2 или 3 спички.\n" +
                    "Введите количество убираемых спичек: ");
        } else if (quantityMatchesTable == 1) {
            System.out.println("Компьтер выбрал " + quantityMatchesComputer +
                    " спички.\nHа столе осталась 1 спичка. Вы проиграили.");
        } else {
            System.out.print(quantityMatchesTable + quantityMatchesComputer + " спичек лежит на столе.\n" +
                    "- Компьтер выбрал количество спичек: " + quantityMatchesComputer  +
                    "\n" + quantityMatchesTable + " спичек осталось на столе.\n- Ваш ход. " +
                    "Введите количество убираемых спичек: ");
        }
    }

}
