package ru.otus.ilyacherney.homeworks.homework13.transport;

import ru.otus.ilyacherney.homeworks.homework13.Terrain;

public class Horse extends Transport{
    int stamina;
    public Horse () {
        consumableResource = 410;
        consumptionRate = 4;
        forbiddenTerrains.add(Terrain.SWAMP);
    }
}
