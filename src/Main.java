public class Main {
    public static void main(String[] args) {
        Product banana = new Product("Банан", 150, 1);
        Product potato = new Product("Картофель", 65, 1);
        Product onion = new Product("Лук", 45, 1);
        Product yoghurt = new Product("Йогурт", 32, 1);
        Product cucumber = new Product("Огурец", 190, 1);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(cucumber);
        productList.addProduct(potato);

        ProductList productList2 = new ProductList();
        productList2.addProduct(onion);
        productList2.addProduct(yoghurt);
        productList2.removeProduct(banana);


        Recipe recipe1 = new Recipe("рецепт1", productList);
        Recipe recipe2 = new Recipe("рецепт2", productList2);
        Recipe recipe3 = new Recipe("рецепт1", productList2);


        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        recipeList.addRecipe(recipe2);
//        recipeList.addRecipe(recipe3);
        System.out.println(recipe1.getCost());
        System.out.println(productList.getProducts());

//        Recipe recipe = new Recipe();
    }
}