package phonebook;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> contacts = new HashMap<>();

    public void add(String surname, String phone) {
        contacts.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String surname) {
        return contacts.getOrDefault(surname, Collections.emptyList());
    }
}
