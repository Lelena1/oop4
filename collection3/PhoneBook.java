package collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static collection3.ValidateUtils.validateString;

public class PhoneBook {
    private final String nameAndSurname;
    private final String phoneNumber;
    private static final Map<String, String> phoneBook = new HashMap<>();

    public PhoneBook(String nameAndSurname, String phoneNumber) {
        this.nameAndSurname = validateString(nameAndSurname);
        this.phoneNumber = validateString(phoneNumber);
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(nameAndSurname, phoneBook.nameAndSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname);
    }

    @Override
    public String toString() {
        return nameAndSurname + ": " + phoneNumber;
    }
}
