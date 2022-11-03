import java.lang.reflect.Array;

public class Product implements Comparable <Product> {
    int price;
    String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        return this.price - o.price;
    }

    @Override
    public String toString() {
        return String.format("%s %d",name,price);
    }
}
