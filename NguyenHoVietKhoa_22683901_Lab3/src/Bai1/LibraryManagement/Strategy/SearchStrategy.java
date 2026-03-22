package Bai1.LibraryManagement.Strategy;

import Bai1.LibraryManagement.FactoryMethod.Book;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
