package ru.shendo.homework04.entity.client;

import ru.shendo.homework04.entity.date.IDate;

public class Client implements IClient {
    private String firstName;
    private String middleName = "";
    private String lastName;
    private IDate birthDate;

    public Client() {
    }

    public Client(String firstName, String lastName, IDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Client(String firstName, String middleName, String lastName, IDate birthDate) {
        this(firstName, lastName, birthDate);
        this.middleName = middleName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public IDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
