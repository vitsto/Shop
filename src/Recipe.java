import java.util.Map;
import java.util.Objects;

public class Recipe {
    private final ProductList products;
    private final String title;
    private double cost;

    public Recipe(String title, ProductList products) {
        this.products = products;
        this.title = title;
    }

    public double getCost() {
        if (Double.compare(cost, 0) == 0) {
            for (Map.Entry<Product, Integer> product : products.getProducts().entrySet()) {
                cost += product.getKey().getPrice() * product.getValue();
            }
        }
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(title, recipe.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, cost);
    }
}
