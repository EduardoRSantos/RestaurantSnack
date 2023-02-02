package repository;

import entities.Lanche;
import java.util.ArrayList;
import java.util.List;


public class RepositoryRestaurant {

    List<Lanche> list = new ArrayList<>();

    ;
    
    public void addFood(Lanche lanche) {
        list.add(lanche);
    }

    public void removeFood(Lanche lanche) {
        list.remove(lanche);
    }

    public Lanche getFood(int id){
        for (Lanche lanche : list) {
            if (id == lanche.getId()) {
                return lanche;
            }
        }
        return null;
    }

    public boolean checkFood(int id){
        boolean c = false;
        for (Lanche lanche : list) {
            if (id == lanche.getId()) {
                c = true;
            }
        }
        return c;
    }
}
