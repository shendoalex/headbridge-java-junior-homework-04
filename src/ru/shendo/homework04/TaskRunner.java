package ru.shendo.homework04;

import ru.shendo.homework04.entity.bankcard.BankCard;

public class TaskRunner {
    public static void main(String[] args) {

        BankCard bankCard1 = BankCardCreator.createBankCard(
                "Alex", "Mifodevich", "Shendo",
                1982, 7, 14,
                2024, 1, 10);

//        BankCard bankCard2 = BankCardCreator.createBankCard(
//                "Alex", "Mifodevich", "Shendo",
//                1982, 7, 14,
//                2025, 1, 10);

        System.out.println(bankCard1);
//        System.out.println(bankCard2);

    }
}
