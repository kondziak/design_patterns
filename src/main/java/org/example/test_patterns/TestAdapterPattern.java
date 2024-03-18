package org.example.test_patterns;

import org.example.adapter_pattern.*;

public class TestAdapterPattern {

    public static void testAdapterPattern() {
        User user = new User("Paweł","Cwik","32131212");
        LibraryApiv2 libraryApiv2 = new LibraryApiv2Impl();
        ApiAdapter apiAdapter = new ApiAdapter(libraryApiv2, user);
        BookConnector connector = new BookConnector(user,apiAdapter);
        System.out.println(connector.checkAvailability("Harry Potter i Zakon Feniksa"));
    }
}
