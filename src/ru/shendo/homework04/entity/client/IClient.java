package ru.shendo.homework04.entity.client;

import ru.shendo.homework04.entity.date.IDate;

public interface IClient {

    String getFirstName();

    String getMiddleName();

    String getLastName();

    IDate getBirthDate();

}
