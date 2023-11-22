package ru.otus.ilyacherney.homeworks.homework13.transport;

import ru.otus.ilyacherney.homeworks.homework13.Terrain;

import java.util.ArrayList;

public class Bicycle extends Transport{
    public Bicycle () {
        forbiddenTerrains.add(Terrain.SWAMP);
    }
}
