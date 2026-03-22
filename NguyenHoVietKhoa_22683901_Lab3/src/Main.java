import Bai1.CompositeDesignPattern.FileLeaf;
import Bai1.CompositeDesignPattern.Folder;
import Bai1.ObserverDesignPattern.Investor;
import Bai1.ObserverDesignPattern.Stock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("AAPL");

        Investor inv1 = new Investor("Alice");
        Investor inv2 = new Investor("Bob");

        stock.attach(inv1);
        stock.attach(inv2);

        stock.setPrice(150);
        stock.setPrice(200);

    }
}