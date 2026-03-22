package Bai1.LibraryManagement.Decorator;

public class BorrowDecorator implements Borrow {
    protected Borrow borrow;

    public BorrowDecorator(Borrow borrow) {
        this.borrow = borrow;
    }

    @Override
    public void borrow() {
        borrow.borrow();
    }
}
