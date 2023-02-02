package aplication;

import entities.Lanche;
import java.util.Locale;
import java.util.Scanner;
import repository.RepositoryRestaurant;
import services.Purchase;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try ( Scanner in = new Scanner(System.in)) {
            RepositoryRestaurant rr = new RepositoryRestaurant();

            rr.addFood(new Lanche(1, "Hotdog", 4.00));
            rr.addFood(new Lanche(2, "X-Salada", 4.50));
            rr.addFood(new Lanche(3, "X-Bacon", 5.00));
            rr.addFood(new Lanche(4, "Torrada Simples", 2.00));
            rr.addFood(new Lanche(5, "Refrigerante", 1.50));

            while (true) {
                System.out.println("1           Hotdog R$ 4,00");
                System.out.println("2           X-Salada R$ 4,50");
                System.out.println("3           X-Bacon R$ 5,00");
                System.out.println("4           Torrada Simples R$ 2,00");
                System.out.println("5           Refrigerante $ 1,50");

                System.out.println("enter the snack number: ");
                int id = in.nextInt();
                if (rr.checkFood(id)) {
                System.out.println("enter the amount: ");
                int quantidade = in.nextInt();

                    Lanche lanche = rr.getFood(id);
                    System.out.println("");
                    System.out.println("Total price: R$" + String.format("%.2f", Purchase.totalPurchase(lanche, quantidade)));
                    System.out.println("");
                }else{
                    System.out.println("Snack not found");
                    break;
                }
            }
        }
    }

}
