import Bai1.CompositeDesignPattern.FileLeaf;
import Bai1.CompositeDesignPattern.Folder;
import Bai1.LibraryManagement.Decorator.BasicBorrow;
import Bai1.LibraryManagement.Decorator.Borrow;
import Bai1.LibraryManagement.Decorator.ExtendTime;
import Bai1.LibraryManagement.FactoryMethod.Book;
import Bai1.LibraryManagement.FactoryMethod.BookFactory;
import Bai1.LibraryManagement.FactoryMethod.PaperBookFactory;
import Bai1.LibraryManagement.Singleton.Library;
import Bai1.LibraryManagement.Strategy.SearchByTitle;
import Bai1.LibraryManagement.Strategy.SearchStrategy;
import Bai1.ObserverDesignPattern.Investor;
import Bai1.ObserverDesignPattern.Stock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library lib = Library.getInstance();

        BookFactory factory = new PaperBookFactory();
        Book b1 = factory.createBook("Java", "Khoa", "IT");

        lib.addBook(b1);

        SearchStrategy search = new SearchByTitle();
        System.out.println(search.search(lib.getBooks(), "Java"));

        Borrow borrow = new ExtendTime(new BasicBorrow());
        borrow.borrow();

    }
}