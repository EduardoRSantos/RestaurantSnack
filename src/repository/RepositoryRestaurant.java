package repository;

import entities.Lanche;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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
            }else{
                throw new RuntimeException("Snack not found");
            }
        }
        return null;
    }

    public void checkSnack(int id){
        long d = list.stream().filter(e -> e.getId() == id).map(e -> e.getId()).count();
        if(d <= 0 ){
            throw new RuntimeException("snack does not exist");
        }
    }
}
