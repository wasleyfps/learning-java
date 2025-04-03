package academy.devdojo.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumer {
    private Long id;
    private String name;

    public Consumer(Long id, String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,1000);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer = (Consumer) o;
        return Objects.equals(id, consumer.id) && Objects.equals(name, consumer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
