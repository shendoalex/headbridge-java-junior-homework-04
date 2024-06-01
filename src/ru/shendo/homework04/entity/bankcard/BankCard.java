package ru.shendo.homework04.entity.bankcard;

import ru.shendo.homework04.entity.client.IClient;
import ru.shendo.homework04.entity.date.IDate;

public class BankCard implements IBankCard {
    private IClient client;
    private IDate issueDate;
    private IDate expiryDate;

    public BankCard() {
    }

    public BankCard(IClient client, IDate issueDate, IDate expiryDate) {
        this.client = client;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public IClient getClient() {
        return client;
    }

    @Override
    public IDate getIssueDate() {
        return issueDate;
    }

    @Override
    public IDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String getCardNumber() {
        return "NNNN-NNNN-NNNN-NNNN";
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "client=" + client +
                ", issueDate=" + issueDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
