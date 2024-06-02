package ru.shendo.homework04.entity.bankcard;

import ru.shendo.homework04.entity.client.IClient;
import ru.shendo.homework04.entity.date.IDate;

public interface IBankCard {

    int CARD_VALID_YEARS = 2;

    IClient getClient();

    IDate getIssueDate();

    IDate getExpiryDate();

    String getCardNumber();

}
