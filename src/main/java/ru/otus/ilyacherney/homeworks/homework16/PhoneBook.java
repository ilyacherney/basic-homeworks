package ru.otus.ilyacherney.homeworks.homework16;

import java.util.*;

public class PhoneBook {
    public Map<String, Set<String>> map;
    public PhoneBook() {
        this.map = new HashMap<>();
    }

    public void add(String name, String number) {
        if (map.containsKey(name)) {
            Set<String> existingNumbers = map.get(name);
            existingNumbers.add(number);
        } else {
            Set<String> newNumbers = new HashSet<>();
            newNumbers.add(number);
            map.put(name, newNumbers);
        }
    }

    public Set<String> find(String name) {
        try {
            return map.get(name);
        } catch (NullPointerException e) {
            return null;
        }
    }

    public boolean containsPhoneNumber(String number) {
        for (Set<String> value: map.values()) {
            if (value.contains(number)) return true;
        }
        return false;
    }
}
