package ru.otus.ilyacherney.homeworks.homework16;

import java.util.*;

public class PhoneBook {
    public Map<String, ArrayList<Long>> map;
    public PhoneBook() {
        this.map = new HashMap<>();
    }

    public void add(String name, long number) {
        if (find(name) == null) {
            List<Long> numbers = new ArrayList<>();
            numbers.add(number);
            map.put(name, (ArrayList<Long>) numbers);
        } else {
            List<Long> numbers = map.get(name);
            numbers.add(number);
        }
    }

    public String find(String name) {
        try {
            return map.get(name).toString();
        } catch (NullPointerException e) {
            return null;
        }
    }

    public boolean containsPhoneNumber(long number) {
        for (Map.Entry<String, ArrayList<Long>> entry : map.entrySet())
            if (entry.getValue().contains(number))
                return true;
        return false;
    }
}
