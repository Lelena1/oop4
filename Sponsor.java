import java.util.Objects;

public class Sponsor {
    private final String name;
    private final double amountOfSupport;

    public Sponsor(String name, double amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;

    }


   public void sponsorTheRace() {
        System.out.println("Спонсор " + name + " спонсирует заезд на: " + amountOfSupport + " тыс.руб.");
    }


   public String getName() {
        return name;
    }

    public double getAmountOfSupport() {
        return amountOfSupport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.amountOfSupport, amountOfSupport) == 0 && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfSupport);
    }

    @Override
    public String toString() {
        return "Спонсор " + name + ", сумма поддержки: " + amountOfSupport + " тыс.руб.";
    }
}
