package services;

import entities.Lanche;

public class Purchase {
    
    public static double totalPurchase(Lanche lanche, int quantidade) {
            return lanche.getPrice() * quantidade;
    }

}
