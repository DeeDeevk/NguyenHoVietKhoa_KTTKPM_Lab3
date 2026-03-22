package Bai1.LibraryManagement.FactoryMethod;

public class PaperBookFactory extends BookFactory{
    @Override
    public Book createBook(String t, String a, String c) {
        return new PaperBook(t, a, c);
    }
}
