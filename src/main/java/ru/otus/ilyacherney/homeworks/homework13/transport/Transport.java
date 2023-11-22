package ru.otus.ilyacherney.homeworks.homework13.transport;

import ru.otus.ilyacherney.homeworks.homework13.Terrain;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Transport {
    List<Terrain> forbiddenTerrains = new ArrayList<Terrain>();
    int consumableResource;
    int consumptionRate;

    public List<Terrain> getForbiddenTerrains() {
        return forbiddenTerrains;
    }

    public Transport() {

    }

    public int consume (int distance){
        int consumedAmount = consumptionRate * distance;
        if (consumableResource - consumedAmount < 0) {
            System.out.println("Транспорту не хватит ресурса на это расстояние");
            return 0;
        }
        consumableResource -= consumedAmount;
        System.out.println("Израсходовано " + consumedAmount);
        return consumedAmount;
    };

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public String info() {
        return "Transport{" +
                "forbiddenTerrains=" + forbiddenTerrains +
                ", consumableResource=" + consumableResource +
                ", consumptionRate=" + consumptionRate +
                '}';
    }
}
