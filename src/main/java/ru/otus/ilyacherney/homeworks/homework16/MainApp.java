package ru.otus.ilyacherney.homeworks.homework16;
public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ilya", 89997508525L);
        phoneBook.add("Ilya", 89233408552L);
        phoneBook.add("Julia", 89133408761L);
        System.out.println(phoneBook.find("Andrew"));
        System.out.println(phoneBook.find("Ilya"));
        System.out.println(phoneBook.containsPhoneNumber(89133408761L));
        System.out.println(phoneBook.map);
    }
}
