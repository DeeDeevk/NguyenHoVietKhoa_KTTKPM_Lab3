package Bai1.ObserverDesignPattern;

public class Stock extends Subject{
    private String stockName;
    private double price;

    public Stock(String stockName) {
        this.stockName = stockName;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers("Stock " + stockName + " changed price to " + price);
    }
}
