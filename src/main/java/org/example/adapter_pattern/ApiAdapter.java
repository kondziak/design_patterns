package org.example.adapter_pattern;

import java.time.LocalDate;

public class ApiAdapter implements  LibraryApi, LibraryApiv2{

    private LibraryApiv2 libraryApiv2;
    private User user;

    public ApiAdapter(LibraryApiv2 libraryApiv2, User user) {
        this.libraryApiv2 = libraryApiv2;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        return true;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return true;
    }
}
