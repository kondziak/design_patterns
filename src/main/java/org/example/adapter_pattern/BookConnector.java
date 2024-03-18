package org.example.adapter_pattern;

public class BookConnector {
    private final User user;
    private final LibraryApi api;

    public BookConnector(User user, LibraryApi api) {
        this.user = user;
        this.api = api;
    }
    public boolean checkAvailability(String title) {
        return api.isAvailable(title);
    }
}
