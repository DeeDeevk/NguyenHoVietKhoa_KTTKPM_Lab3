package Bai1.LibraryManagement.Decorator;

public class BasicBorrow implements Borrow {
    @Override
    public void borrow() {
        System.out.println("Borrow book");
    }
}
