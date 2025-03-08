package Step8.Step8_Link2.Step8_Link2_8;

import java.util.Objects;

public class Human {
    private int id;
    private String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Human " + name + '\'';
    }
}
