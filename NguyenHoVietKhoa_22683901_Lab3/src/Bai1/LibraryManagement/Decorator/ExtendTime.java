package Bai1.LibraryManagement.Decorator;

public class ExtendTime extends BorrowDecorator {
    public ExtendTime(Borrow borrow) {
        super(borrow);
    }

    public void borrow() {
        super.borrow();
        System.out.println("Extended borrow time");
    }
}
