package ru.otus.ilyacherney.homeworks.homework10;

public class User {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int birthYear;
    private String email;

    public User(String lastName, String firstName, String patronymic, int birthYear, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void info() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
    }
}
