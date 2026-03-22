package Bai1.LibraryManagement.FactoryMethod;

public class EBook extends Book{
    public EBook(String t, String a, String c) {
        super(t, a, c);
    }

    @Override
    public String getInfo() {
        return "EBook: " + title;
    }
}
