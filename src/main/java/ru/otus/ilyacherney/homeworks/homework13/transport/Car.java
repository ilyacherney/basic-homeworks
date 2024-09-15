package ru.otus.ilyacherney.homeworks.homework13.transport;

import ru.otus.ilyacherney.homeworks.homework13.Terrain;

import java.util.ArrayList;

public class Car extends Transport{
    public Car () {
        forbiddenTerrains.add(Terrain.DEEP_FOREST);
        forbiddenTerrains.add(Terrain.SWAMP);
        consumableResource = 15;
        consumptionRate = 6;
    }
}
