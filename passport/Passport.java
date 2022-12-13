package passport;

import java.time.LocalDate;
import java.util.Objects;

import static passport.ValidateUtils.validateLocalDate;
import static passport.ValidateUtils.validateString;

public class Passport {
    private String number;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthday;

    public Passport(String number, String surname, String name, String patronymic, LocalDate birthday) {
        this.number = validateString(number);
        this.surname = validateString(surname);
        this.name = validateString(name);
        this.patronymic = patronymic;
        this.birthday = validateLocalDate(birthday);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = validateString(number);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = validateString(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateString(name);
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = validateLocalDate(birthday);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Паспорт " + number + " " + surname + " " + name + " " + patronymic + ", " + birthday;
    }
}
