package academy.devdojo.maratonajava.javacore.ZZBbehavior.domain;

public class Car {
    private String name = "Audi";
    private String Color;
    private int year;

    public Car(int year, String color) {
        this.year = year;
        Color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return Color;
    }

    public int getYear() {
        return year;
    }
}
