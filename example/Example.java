package example;

import java.util.Objects;

public class Example {
    private final int x;
    private final int y;

    public Example(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return x == example.x && y == example.y || y == example.x && x == example.y;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x) * Objects.hashCode(y);
    }

    @Override
    public String toString() {
        return x + " * " + y + " =";
    }
}
