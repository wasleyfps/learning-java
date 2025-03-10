package academy.devdojo.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String name;
    private Double price;
    private int quantity;

    public Manga(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long id, String name, Double price, int quantity) {
        this(id, name, price);
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga o) {
        // negativo se o this < outroManga
        // se this == outroManga, return 0
        // positivo se o this > outroManga
        
//        if (this.id < o.getId()) {
//            return -1;
//        } else if (this.id.equals(o.getId())){
//            return 0;
//        }else {
//            return 1;
//        }
        
        return this.id.compareTo(o.id);
        // return this.name.compareTo(o.name);
        // return Double.valueOf(o.price).compareTo(this.price);
        
    }
}
