package ru.otus.ilyacherney.homeworks.homework16;
public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ilya", "89997508525");
        phoneBook.add("Ilya", "89233408552");
        phoneBook.add("Julia", "89133408761");
        System.out.println(phoneBook.find("Andrew"));
        System.out.println(phoneBook.find("Ilya"));
        System.out.println(phoneBook.find("Julia"));
        System.out.println(phoneBook.containsPhoneNumber("89997508525"));
        System.out.println(phoneBook.containsPhoneNumber("89997508521"));
        System.out.println(phoneBook.map);
    }
}
