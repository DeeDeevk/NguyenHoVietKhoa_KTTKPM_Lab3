package Bai1.LibraryManagement.Strategy;

import Bai1.LibraryManagement.FactoryMethod.Book;

import java.util.List;

public class SearchByTitle implements SearchStrategy{
    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream()
                .filter(b -> b.getTitle().contains(keyword))
                .toList();
    }
}
