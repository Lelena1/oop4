import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Mechanic<T extends Transport> {
    private final String nameOfMechanic;
    private final String nameOfCompany;



    public Mechanic(String nameOfMechanic, String nameOfCompany) {
        this.nameOfMechanic = nameOfMechanic;
        this.nameOfCompany = nameOfCompany;

    }

    public boolean diagnostics(T t) {
       return t.diagnostics();
    }

    public void fixTransport(T t) {
        t.fixTransport();
    }

    public String getNameOfMechanic() {
        return nameOfMechanic;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(nameOfMechanic, mechanic.nameOfMechanic) && Objects.equals(nameOfCompany, mechanic.nameOfCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfMechanic, nameOfCompany);
    }

    @Override
    public String toString() {
        return "Механик " + nameOfMechanic + " из " + nameOfCompany + ";";
    }
}

