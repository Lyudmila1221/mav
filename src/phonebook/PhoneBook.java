package phonebook;

import java.util.*;

public class PhoneBook {
    public final Map<String, List<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        book.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return book.getOrDefault(surname, Collections.emptyList());
    }
}
