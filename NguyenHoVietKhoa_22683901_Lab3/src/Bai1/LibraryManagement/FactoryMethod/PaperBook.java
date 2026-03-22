package Bai1.LibraryManagement.FactoryMethod;

public class PaperBook extends Book{
    public PaperBook(String t, String a, String c) {
        super(t, a, c);
    }

    @Override
    public String getInfo() {
        return "PaperBook: " + title;
    }
}
