package ru.otus.ilyacherney.homeworks.homework13;

import ru.otus.ilyacherney.homeworks.homework13.transport.Transport;

public class Human {
    String name;
    Transport currentTransport;
    public Human (String name) {
        this.name = name;
    }

    public void getOnTransport(Transport transport) {
        currentTransport = transport;
        System.out.println(name + " сел в " + transport);
    }
    public void leaveTransport() {
        System.out.println(name + " вышел из " + currentTransport);
        currentTransport = null;
    }

    public boolean ride(int distance, Terrain terrain) {
        if (currentTransport == null) {
            System.out.println(name + " идёт пешком по " + terrain + " " + distance + " метров.");
            return true;
        }

        if (currentTransport.getForbiddenTerrains().contains(terrain)) {
            System.out.println(currentTransport + " не может ехать по " + terrain);
            return false;
        }

        System.out.println(name + " едет на " + currentTransport + " " + "по " + terrain + " " + distance + " метров");
        currentTransport.consume(distance);
        return true;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", currentTransport=" + currentTransport +
                '}';
    }
}
