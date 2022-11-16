import java.util.*;

public class ProductList {
    private final Map<Product, Integer> products;

    public ProductList() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product, int count) {
        if (products.containsKey(product)) {
            throw new RuntimeException("Продукт уже добавлен");
        }
        products.put(product, count);
    }

    public void addProduct(Product product) {
        addProduct(product, 1);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void markAsBought(Product product) {
        product.buy();
    }

    public Map<Product, Integer> getProducts() {
        return Collections.unmodifiableMap(products);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Product, Integer> p : products.entrySet()) {
            str.append(p.getKey()).append(" ").append(p.getValue()).append("\n");
        }
        return str.toString();
    }
}
