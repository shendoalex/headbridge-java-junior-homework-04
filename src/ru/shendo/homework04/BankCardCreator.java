package ru.shendo.homework04;

import ru.shendo.homework04.entity.bankcard.BankCard;
import ru.shendo.homework04.entity.client.Client;
import ru.shendo.homework04.entity.date.Date;

import java.time.Year;

public class BankCardCreator {
    private static final int CARD_VALID_YEARS = 2;


    public static BankCard createBankCard(String firstName, String middleName, String lastName,
                                          int birthYear, int birthMonth, int birthDay,
                                          int cardIssueYear, int cardIssueMonth, int cardIssueDay) {

        if (checkClientNameValid(firstName, middleName, lastName)
                && checkIfDateValid(birthYear, birthMonth, birthDay)
                && checkIfDateValid(cardIssueYear, cardIssueMonth, cardIssueDay)) {

            return new BankCard(
                    new Client(firstName, middleName, lastName, new Date(birthYear, birthMonth, birthDay)),
                    new Date(cardIssueYear, cardIssueMonth, cardIssueDay),
                    new Date(cardIssueYear + CARD_VALID_YEARS, cardIssueMonth, cardIssueDay)
            );
        }
        throw new RuntimeException("Данные для создания карты не прошли валидацию");
    }

    private static boolean checkClientNameValid(String firstName, String middleName, String lastName) {
        return ((firstName != null && !firstName.isEmpty())
                && (middleName != null)
                && (lastName != null && !lastName.isEmpty()));
    }

    private static boolean checkIfDateValid(int year, int month, int day) {

        if (year < 0 || year >Year.now().getValue ()) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day < 1 || day > 31) {
                        return false;
                    }
                case 4, 6, 9, 11:
                    if (day < 1 || day > 30) {
                        return false;
                    }
                case 2:
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        if (day < 1 || day > 29) {
                            return false;
                        }
                    } else {
                        if (day < 1 || day > 28) {
                            return false;
                        }
                    }
            }
        }
        return true;
    }
}
