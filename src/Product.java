import java.util.Objects;

public class Product {
    private final String title;
    private double price;
    private double weight;

    private boolean bought;

    public Product(String title, double price, double weight) {
        if (title == null || !title.matches("^[А-ЯЁ][а-яё]*") || Double.compare(price, 0) == 0 || Double.compare(weight, 0) == 0) {
            throw new RuntimeException("Uncompleted initialization");
        }
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public void buy() {
        this.bought = true;
    }

    public boolean isBought() {
        return bought;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "Наименование:'" + title + '\'' +
                ", цена=" + price +
                ", вес (в кг.)=" + weight +
                ", куплен: " + (bought ? '+' : '-');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.weight, weight) == 0 && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, weight);
    }
}
