package data;

import plants.Aster;
import plants.Chamomile;
import plants.Plant;
import plants.Rose;

import java.util.List;

public class FlowerCollection {

    private List<Plant> listCollection;

    public FlowerCollection() {
        Plant aster = new Aster("красные");
        Plant rose = new Rose("желтые");
        Plant chamomile = new Chamomile("белые");

        listCollection = List.of(aster, rose, chamomile);
    }

    public List<Plant> getListCollection() {
        return listCollection;
    }
}
